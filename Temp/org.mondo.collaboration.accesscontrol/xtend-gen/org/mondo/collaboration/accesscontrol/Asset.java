/**
 * Copyright (c) 2004-2015 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 */
package org.mondo.collaboration.accesscontrol;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * An asset represents something that policy rules can permit/deny access to.
 * @author Bergmann Gabor
 */
@SuppressWarnings("all")
public abstract class Asset {
  @Data
  public static class ObjectAsset extends Asset {
    private final EObject object;
    
    @Override
    public Tuple toTuple() {
      return new FlatTuple(this.object);
    }
    
    public static Asset.Factory factory(final int objectPos) {
      final Asset.Factory _function = (IPatternMatch it) -> {
        Object _get = it.get(objectPos);
        Asset.ObjectAsset _objectAsset = new Asset.ObjectAsset(((EObject) _get));
        return Collections.<Asset>unmodifiableSet(CollectionLiterals.<Asset>newHashSet(_objectAsset));
      };
      return _function;
    }
    
    @Override
    public void WriteOut() {
      InputOutput.<String>println(this.object.toString());
    }
    
    public ObjectAsset(final EObject object) {
      super();
      this.object = object;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.object== null) ? 0 : this.object.hashCode());
      return result;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Asset.ObjectAsset other = (Asset.ObjectAsset) obj;
      if (this.object == null) {
        if (other.object != null)
          return false;
      } else if (!this.object.equals(other.object))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
    
    @Pure
    public EObject getObject() {
      return this.object;
    }
  }
  
  @Data
  public static class ReferenceAsset extends Asset {
    private final EObject source;
    
    private final EReference reference;
    
    private final EObject target;
    
    @Override
    public Tuple toTuple() {
      return new FlatTuple(this.source, this.reference, this.target);
    }
    
    public static Asset.Factory factory(final int sourcePos, final EReference reference, final int targetPos) {
      Asset.Factory _xblockexpression = null;
      {
        final EReference opposite = reference.getEOpposite();
        Asset.Factory _xifexpression = null;
        boolean _equals = Objects.equal(opposite, null);
        if (_equals) {
          final Asset.Factory _function = (IPatternMatch it) -> {
            Object _get = it.get(sourcePos);
            Object _get_1 = it.get(targetPos);
            Asset.ReferenceAsset _referenceAsset = new Asset.ReferenceAsset(((EObject) _get), reference, ((EObject) _get_1));
            return Collections.<Asset>unmodifiableSet(CollectionLiterals.<Asset>newHashSet(_referenceAsset));
          };
          _xifexpression = _function;
        } else {
          final Asset.Factory _function_1 = (IPatternMatch it) -> {
            Set<Asset> _xblockexpression_1 = null;
            {
              Object _get = it.get(sourcePos);
              final EObject src = ((EObject) _get);
              Object _get_1 = it.get(targetPos);
              final EObject trg = ((EObject) _get_1);
              Asset.ReferenceAsset _referenceAsset = new Asset.ReferenceAsset(src, reference, trg);
              Asset.ReferenceAsset _referenceAsset_1 = new Asset.ReferenceAsset(trg, opposite, src);
              _xblockexpression_1 = Collections.<Asset>unmodifiableSet(CollectionLiterals.<Asset>newHashSet(_referenceAsset, _referenceAsset_1));
            }
            return _xblockexpression_1;
          };
          _xifexpression = _function_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    }
    
    public static Asset.Factory factory(final int sourcePos, final String referenceName, final int targetPos) {
      final Asset.Factory _function = (IPatternMatch it) -> {
        Set<Asset> _xblockexpression = null;
        {
          Object _get = it.get(sourcePos);
          final EObject src = ((EObject) _get);
          Object _get_1 = it.get(targetPos);
          final EObject trg = ((EObject) _get_1);
          final EStructuralFeature feature = src.eClass().getEStructuralFeature(referenceName);
          if ((Objects.equal(feature, null) || (!(feature instanceof EReference)))) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Security Policy parsing error: No EReference of name ");
            _builder.append(referenceName);
            _builder.append(" found in EClass ");
            EClass _eClass = src.eClass();
            _builder.append(_eClass);
            _builder.append(" of object ");
            _builder.append(src);
            throw new IllegalArgumentException(_builder.toString());
          }
          final EReference reference = ((EReference) feature);
          final EReference opposite = reference.getEOpposite();
          Set<Asset> _xifexpression = null;
          boolean _equals = Objects.equal(opposite, null);
          if (_equals) {
            Asset.ReferenceAsset _referenceAsset = new Asset.ReferenceAsset(src, reference, trg);
            _xifexpression = Collections.<Asset>unmodifiableSet(CollectionLiterals.<Asset>newHashSet(_referenceAsset));
          } else {
            Asset.ReferenceAsset _referenceAsset_1 = new Asset.ReferenceAsset(src, reference, trg);
            Asset.ReferenceAsset _referenceAsset_2 = new Asset.ReferenceAsset(trg, opposite, src);
            _xifexpression = Collections.<Asset>unmodifiableSet(CollectionLiterals.<Asset>newHashSet(_referenceAsset_1, _referenceAsset_2));
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      };
      return _function;
    }
    
    @Override
    public void WriteOut() {
      String _string = this.source.toString();
      String _plus = (_string + " -> ");
      String _string_1 = this.target.toString();
      String _plus_1 = (_plus + _string_1);
      String _plus_2 = (_plus_1 + ": ");
      String _name = this.reference.getName();
      String _plus_3 = (_plus_2 + _name);
      InputOutput.<String>println(_plus_3);
    }
    
    public ReferenceAsset(final EObject source, final EReference reference, final EObject target) {
      super();
      this.source = source;
      this.reference = reference;
      this.target = target;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.source== null) ? 0 : this.source.hashCode());
      result = prime * result + ((this.reference== null) ? 0 : this.reference.hashCode());
      result = prime * result + ((this.target== null) ? 0 : this.target.hashCode());
      return result;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Asset.ReferenceAsset other = (Asset.ReferenceAsset) obj;
      if (this.source == null) {
        if (other.source != null)
          return false;
      } else if (!this.source.equals(other.source))
        return false;
      if (this.reference == null) {
        if (other.reference != null)
          return false;
      } else if (!this.reference.equals(other.reference))
        return false;
      if (this.target == null) {
        if (other.target != null)
          return false;
      } else if (!this.target.equals(other.target))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
    
    @Pure
    public EObject getSource() {
      return this.source;
    }
    
    @Pure
    public EReference getReference() {
      return this.reference;
    }
    
    @Pure
    public EObject getTarget() {
      return this.target;
    }
  }
  
  @Data
  public static class AttributeAsset extends Asset {
    private final EObject source;
    
    private final EAttribute attribute;
    
    @Override
    public Tuple toTuple() {
      return new FlatTuple(this.source, this.attribute);
    }
    
    public static Asset.Factory factory(final int sourcePos, final EAttribute attribute) {
      final Asset.Factory _function = (IPatternMatch it) -> {
        Object _get = it.get(sourcePos);
        Asset.AttributeAsset _attributeAsset = new Asset.AttributeAsset(((EObject) _get), attribute);
        return Collections.<Asset>unmodifiableSet(CollectionLiterals.<Asset>newHashSet(_attributeAsset));
      };
      return _function;
    }
    
    public static Asset.Factory factory(final int sourcePos, final String attributeName) {
      final Asset.Factory _function = (IPatternMatch it) -> {
        Set<Asset> _xblockexpression = null;
        {
          Object _get = it.get(sourcePos);
          final EObject src = ((EObject) _get);
          final EStructuralFeature feature = src.eClass().getEStructuralFeature(attributeName);
          if ((Objects.equal(feature, null) || (!(feature instanceof EAttribute)))) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Security Policy parsing error: No EAttribute of name ");
            _builder.append(attributeName);
            _builder.append(" found in EClass ");
            EClass _eClass = src.eClass();
            _builder.append(_eClass);
            _builder.append(" of object ");
            _builder.append(src);
            throw new IllegalArgumentException(_builder.toString());
          }
          final EAttribute attribute = ((EAttribute) feature);
          Asset.AttributeAsset _attributeAsset = new Asset.AttributeAsset(src, attribute);
          _xblockexpression = Collections.<Asset>unmodifiableSet(CollectionLiterals.<Asset>newHashSet(_attributeAsset));
        }
        return _xblockexpression;
      };
      return _function;
    }
    
    @Override
    public void WriteOut() {
      String _string = this.source.toString();
      String _plus = (_string + ": ");
      String _name = this.attribute.getName();
      String _plus_1 = (_plus + _name);
      InputOutput.<String>println(_plus_1);
    }
    
    public AttributeAsset(final EObject source, final EAttribute attribute) {
      super();
      this.source = source;
      this.attribute = attribute;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.source== null) ? 0 : this.source.hashCode());
      result = prime * result + ((this.attribute== null) ? 0 : this.attribute.hashCode());
      return result;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Asset.AttributeAsset other = (Asset.AttributeAsset) obj;
      if (this.source == null) {
        if (other.source != null)
          return false;
      } else if (!this.source.equals(other.source))
        return false;
      if (this.attribute == null) {
        if (other.attribute != null)
          return false;
      } else if (!this.attribute.equals(other.attribute))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
    
    @Pure
    public EObject getSource() {
      return this.source;
    }
    
    @Pure
    public EAttribute getAttribute() {
      return this.attribute;
    }
  }
  
  public interface Factory extends Function<IPatternMatch, Set<? extends Asset>> {
  }
  
  public abstract Tuple toTuple();
  
  public abstract void WriteOut();
  
  public static Iterable<Class<? extends Asset>> getKinds() {
    final Function1<Class<?>, Boolean> _function = (Class<?> it) -> {
      return Boolean.valueOf(Asset.class.isAssignableFrom(it));
    };
    final Function1<Class<?>, Class<? extends Asset>> _function_1 = (Class<?> it) -> {
      return ((Class<? extends Asset>) it);
    };
    return IterableExtensions.<Class<?>, Class<? extends Asset>>map(IterableExtensions.<Class<?>>filter(((Iterable<Class<?>>)Conversions.doWrapArray(Asset.class.getClasses())), _function), _function_1);
  }
  
  public static Asset.Factory factoryFrom(final IQuerySpecification<?> query) {
    final Function1<PAnnotation, Boolean> _function = (PAnnotation it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "SecurityObject"));
    };
    final PAnnotation objAnnotation = IterableExtensions.<PAnnotation>findFirst(query.getAllAnnotations(), _function);
    boolean _notEquals = (!Objects.equal(objAnnotation, null));
    if (_notEquals) {
      final Integer objectPos = Asset.getParameterIndexFromAnnotationValue(objAnnotation, "object", query);
      return Asset.ObjectAsset.factory((objectPos).intValue());
    }
    final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "SecurityReference"));
    };
    final PAnnotation refAnnotation = IterableExtensions.<PAnnotation>findFirst(query.getAllAnnotations(), _function_1);
    boolean _notEquals_1 = (!Objects.equal(refAnnotation, null));
    if (_notEquals_1) {
      final Integer srcPos = Asset.getParameterIndexFromAnnotationValue(refAnnotation, "src", query);
      final Integer trgPos = Asset.getParameterIndexFromAnnotationValue(refAnnotation, "trg", query);
      Object _firstValue = refAnnotation.getFirstValue("feature");
      final String featureName = ((String) _firstValue);
      return Asset.ReferenceAsset.factory((srcPos).intValue(), featureName, (trgPos).intValue());
    }
    final Function1<PAnnotation, Boolean> _function_2 = (PAnnotation it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "SecurityAttribute"));
    };
    final PAnnotation attrAnnotation = IterableExtensions.<PAnnotation>findFirst(query.getAllAnnotations(), _function_2);
    boolean _notEquals_2 = (!Objects.equal(attrAnnotation, null));
    if (_notEquals_2) {
      final Integer srcPos_1 = Asset.getParameterIndexFromAnnotationValue(attrAnnotation, "src", query);
      Object _firstValue_1 = attrAnnotation.getFirstValue("feature");
      final String featureName_1 = ((String) _firstValue_1);
      return Asset.AttributeAsset.factory((srcPos_1).intValue(), featureName_1);
    }
    final String simpleName = IterableExtensions.<String>last(Splitter.on(".").split(query.getFullyQualifiedName()));
    boolean _startsWith = simpleName.startsWith("object");
    if (_startsWith) {
      return Asset.ObjectAsset.factory(0);
    } else {
      boolean _startsWith_1 = simpleName.startsWith("reference");
      if (_startsWith_1) {
        return Asset.ReferenceAsset.factory(0, simpleName.substring("reference".length()), 1);
      } else {
        boolean _startsWith_2 = simpleName.startsWith("attribute");
        if (_startsWith_2) {
          return Asset.AttributeAsset.factory(0, simpleName.substring("attribute".length()));
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Pattern ");
    String _fullyQualifiedName = query.getFullyQualifiedName();
    _builder.append(_fullyQualifiedName);
    _builder.append(" unrecognizable as security asset specification without annotations or naming convention.");
    throw new IllegalArgumentException(_builder.toString());
  }
  
  private static Integer getParameterIndexFromAnnotationValue(final PAnnotation annotation, final String annotationValueName, final IQuerySpecification<?> query) {
    Integer _xblockexpression = null;
    {
      final Object annotationValue = annotation.getFirstValue(annotationValueName);
      String _switchResult = null;
      boolean _matched = false;
      if (annotationValue instanceof ParameterReference) {
        _matched=true;
        _switchResult = ((ParameterReference)annotationValue).getName();
      }
      if (!_matched) {
        if (annotationValue instanceof String) {
          _matched=true;
          _switchResult = ((String)annotationValue);
        }
      }
      if (!_matched) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Annotation parameter \'");
        _builder.append(annotationValueName);
        _builder.append("\' not found for annotation @");
        String _name = annotation.getName();
        _builder.append(_name);
        _builder.append(" on query ");
        String _fullyQualifiedName = query.getFullyQualifiedName();
        _builder.append(_fullyQualifiedName);
        _builder.append(".");
        throw new IllegalArgumentException(_builder.toString());
      }
      final String paramName = _switchResult;
      boolean _equals = Objects.equal(paramName, null);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Parameter name not given for annotation parameter \'");
        _builder_1.append(annotationValueName);
        _builder_1.append("\' of @");
        String _name_1 = annotation.getName();
        _builder_1.append(_name_1);
        _builder_1.append(" on query ");
        String _fullyQualifiedName_1 = query.getFullyQualifiedName();
        _builder_1.append(_fullyQualifiedName_1);
        _builder_1.append(".");
        throw new IllegalArgumentException(_builder_1.toString());
      }
      final Integer pos = query.getPositionOfParameter(paramName);
      boolean _equals_1 = Objects.equal(pos, null);
      if (_equals_1) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Parameter name ");
        _builder_2.append(paramName);
        _builder_2.append(" (as indicated by annotation @");
        String _name_2 = annotation.getName();
        _builder_2.append(_name_2);
        _builder_2.append(") not found for query ");
        String _fullyQualifiedName_2 = query.getFullyQualifiedName();
        _builder_2.append(_fullyQualifiedName_2);
        _builder_2.append(".");
        throw new IllegalArgumentException(_builder_2.toString());
      }
      _xblockexpression = pos;
    }
    return _xblockexpression;
  }
}
