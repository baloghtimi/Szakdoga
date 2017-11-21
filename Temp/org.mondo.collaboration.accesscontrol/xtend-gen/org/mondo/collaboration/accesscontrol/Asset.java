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
import java.util.List;
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
      String _string = this.object.toString();
      InputOutput.<String>println(_string);
    }
    
    @Override
    public boolean equals(final Object o) {
      boolean _xifexpression = false;
      if ((!(o instanceof Asset.ObjectAsset))) {
        return false;
      } else {
        boolean _xblockexpression = false;
        {
          final Asset.ObjectAsset objAsset = ((Asset.ObjectAsset) o);
          int _hashCode = this.hashCode();
          int _hashCode_1 = objAsset.hashCode();
          _xblockexpression = (_hashCode == _hashCode_1);
        }
        _xifexpression = _xblockexpression;
      }
      return _xifexpression;
    }
    
    @Override
    public int hashCode() {
      int _xblockexpression = (int) 0;
      {
        final int prime = 31;
        int result = 1;
        int _hashCode = this.object.hashCode();
        int _plus = ((prime * result) + _hashCode);
        _xblockexpression = result = _plus;
      }
      return _xblockexpression;
    }
    
    public ObjectAsset(final EObject object) {
      super();
      this.object = object;
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
          EClass _eClass = src.eClass();
          final EStructuralFeature feature = _eClass.getEStructuralFeature(referenceName);
          boolean _or = false;
          boolean _equals = Objects.equal(feature, null);
          if (_equals) {
            _or = true;
          } else {
            _or = (!(feature instanceof EReference));
          }
          if (_or) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Security Policy parsing error: No EReference of name ");
            _builder.append(referenceName, "");
            _builder.append(" found in EClass ");
            EClass _eClass_1 = src.eClass();
            _builder.append(_eClass_1, "");
            _builder.append(" of object ");
            _builder.append(src, "");
            throw new IllegalArgumentException(_builder.toString());
          }
          final EReference reference = ((EReference) feature);
          final EReference opposite = reference.getEOpposite();
          Set<Asset> _xifexpression = null;
          boolean _equals_1 = Objects.equal(opposite, null);
          if (_equals_1) {
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
    
    @Override
    public boolean equals(final Object o) {
      boolean _xblockexpression = false;
      {
        if ((!(o instanceof Asset.ReferenceAsset))) {
          return false;
        } else {
          final Asset.ReferenceAsset refAsset = ((Asset.ReferenceAsset) o);
          int _hashCode = this.hashCode();
          int _hashCode_1 = refAsset.hashCode();
          /* (_hashCode == _hashCode_1); */
        }
        int _hashCode_2 = this.hashCode();
        int _hashCode_3 = o.hashCode();
        _xblockexpression = (_hashCode_2 == _hashCode_3);
      }
      return _xblockexpression;
    }
    
    @Override
    public int hashCode() {
      int _xblockexpression = (int) 0;
      {
        final int prime = 31;
        int result = 1;
        int _hashCode = this.source.hashCode();
        int _plus = ((prime * result) + _hashCode);
        result = _plus;
        int _hashCode_1 = this.reference.hashCode();
        int _plus_1 = ((prime * result) + _hashCode_1);
        result = _plus_1;
        int _hashCode_2 = this.target.hashCode();
        int _plus_2 = ((prime * result) + _hashCode_2);
        _xblockexpression = result = _plus_2;
      }
      return _xblockexpression;
    }
    
    public ReferenceAsset(final EObject source, final EReference reference, final EObject target) {
      super();
      this.source = source;
      this.reference = reference;
      this.target = target;
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
          EClass _eClass = src.eClass();
          final EStructuralFeature feature = _eClass.getEStructuralFeature(attributeName);
          boolean _or = false;
          boolean _equals = Objects.equal(feature, null);
          if (_equals) {
            _or = true;
          } else {
            _or = (!(feature instanceof EAttribute));
          }
          if (_or) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Security Policy parsing error: No EAttribute of name ");
            _builder.append(attributeName, "");
            _builder.append(" found in EClass ");
            EClass _eClass_1 = src.eClass();
            _builder.append(_eClass_1, "");
            _builder.append(" of object ");
            _builder.append(src, "");
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
    
    @Override
    public boolean equals(final Object o) {
      boolean _xifexpression = false;
      if ((!(o instanceof Asset.AttributeAsset))) {
        return false;
      } else {
        boolean _xblockexpression = false;
        {
          final Asset.AttributeAsset attrAsset = ((Asset.AttributeAsset) o);
          int _hashCode = this.hashCode();
          int _hashCode_1 = attrAsset.hashCode();
          _xblockexpression = (_hashCode == _hashCode_1);
        }
        _xifexpression = _xblockexpression;
      }
      return _xifexpression;
    }
    
    @Override
    public int hashCode() {
      int _xblockexpression = (int) 0;
      {
        final int prime = 31;
        int result = 1;
        int _hashCode = this.source.hashCode();
        int _plus = ((prime * result) + _hashCode);
        result = _plus;
        int _hashCode_1 = this.attribute.hashCode();
        int _plus_1 = ((prime * result) + _hashCode_1);
        _xblockexpression = result = _plus_1;
      }
      return _xblockexpression;
    }
    
    public AttributeAsset(final EObject source, final EAttribute attribute) {
      super();
      this.source = source;
      this.attribute = attribute;
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
    Class<?>[] _classes = Asset.class.getClasses();
    final Function1<Class<?>, Boolean> _function = (Class<?> it) -> {
      return Boolean.valueOf(Asset.class.isAssignableFrom(it));
    };
    Iterable<Class<?>> _filter = IterableExtensions.<Class<?>>filter(((Iterable<Class<?>>)Conversions.doWrapArray(_classes)), _function);
    final Function1<Class<?>, Class<? extends Asset>> _function_1 = (Class<?> it) -> {
      return ((Class<? extends Asset>) it);
    };
    return IterableExtensions.<Class<?>, Class<? extends Asset>>map(_filter, _function_1);
  }
  
  public static Asset.Factory factoryFrom(final IQuerySpecification<?> query) {
    List<PAnnotation> _allAnnotations = query.getAllAnnotations();
    final Function1<PAnnotation, Boolean> _function = (PAnnotation it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "SecurityObject"));
    };
    final PAnnotation objAnnotation = IterableExtensions.<PAnnotation>findFirst(_allAnnotations, _function);
    boolean _notEquals = (!Objects.equal(objAnnotation, null));
    if (_notEquals) {
      final Integer objectPos = Asset.getParameterIndexFromAnnotationValue(objAnnotation, "object", query);
      return Asset.ObjectAsset.factory((objectPos).intValue());
    }
    List<PAnnotation> _allAnnotations_1 = query.getAllAnnotations();
    final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "SecurityReference"));
    };
    final PAnnotation refAnnotation = IterableExtensions.<PAnnotation>findFirst(_allAnnotations_1, _function_1);
    boolean _notEquals_1 = (!Objects.equal(refAnnotation, null));
    if (_notEquals_1) {
      final Integer srcPos = Asset.getParameterIndexFromAnnotationValue(refAnnotation, "src", query);
      final Integer trgPos = Asset.getParameterIndexFromAnnotationValue(refAnnotation, "trg", query);
      Object _firstValue = refAnnotation.getFirstValue("feature");
      final String featureName = ((String) _firstValue);
      return Asset.ReferenceAsset.factory((srcPos).intValue(), featureName, (trgPos).intValue());
    }
    List<PAnnotation> _allAnnotations_2 = query.getAllAnnotations();
    final Function1<PAnnotation, Boolean> _function_2 = (PAnnotation it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "SecurityAttribute"));
    };
    final PAnnotation attrAnnotation = IterableExtensions.<PAnnotation>findFirst(_allAnnotations_2, _function_2);
    boolean _notEquals_2 = (!Objects.equal(attrAnnotation, null));
    if (_notEquals_2) {
      final Integer srcPos_1 = Asset.getParameterIndexFromAnnotationValue(attrAnnotation, "src", query);
      Object _firstValue_1 = attrAnnotation.getFirstValue("feature");
      final String featureName_1 = ((String) _firstValue_1);
      return Asset.AttributeAsset.factory((srcPos_1).intValue(), featureName_1);
    }
    Splitter _on = Splitter.on(".");
    String _fullyQualifiedName = query.getFullyQualifiedName();
    Iterable<String> _split = _on.split(_fullyQualifiedName);
    final String simpleName = IterableExtensions.<String>last(_split);
    boolean _startsWith = simpleName.startsWith("object");
    if (_startsWith) {
      return Asset.ObjectAsset.factory(0);
    } else {
      boolean _startsWith_1 = simpleName.startsWith("reference");
      if (_startsWith_1) {
        int _length = "reference".length();
        String _substring = simpleName.substring(_length);
        return Asset.ReferenceAsset.factory(0, _substring, 1);
      } else {
        boolean _startsWith_2 = simpleName.startsWith("attribute");
        if (_startsWith_2) {
          int _length_1 = "attribute".length();
          String _substring_1 = simpleName.substring(_length_1);
          return Asset.AttributeAsset.factory(0, _substring_1);
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Pattern ");
    String _fullyQualifiedName_1 = query.getFullyQualifiedName();
    _builder.append(_fullyQualifiedName_1, "");
    _builder.append(" unrecognizable as security asset specification without annotations or naming convention.");
    throw new IllegalArgumentException(_builder.toString());
  }
  
  private static Integer getParameterIndexFromAnnotationValue(final PAnnotation annotation, final String annotationValueName, final IQuerySpecification<?> query) {
    Integer _xblockexpression = null;
    {
      final Object annotationValue = annotation.getFirstValue(annotationValueName);
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (annotationValue instanceof ParameterReference) {
          _matched=true;
          _switchResult = ((ParameterReference)annotationValue).getName();
        }
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
        _builder.append(annotationValueName, "");
        _builder.append("\' not found for annotation @");
        String _name = annotation.getName();
        _builder.append(_name, "");
        _builder.append(" on query ");
        String _fullyQualifiedName = query.getFullyQualifiedName();
        _builder.append(_fullyQualifiedName, "");
        _builder.append(".");
        throw new IllegalArgumentException(_builder.toString());
      }
      final String paramName = _switchResult;
      boolean _equals = Objects.equal(paramName, null);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Parameter name not given for annotation parameter \'");
        _builder_1.append(annotationValueName, "");
        _builder_1.append("\' of @");
        String _name_1 = annotation.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(" on query ");
        String _fullyQualifiedName_1 = query.getFullyQualifiedName();
        _builder_1.append(_fullyQualifiedName_1, "");
        _builder_1.append(".");
        throw new IllegalArgumentException(_builder_1.toString());
      }
      final Integer pos = query.getPositionOfParameter(paramName);
      boolean _equals_1 = Objects.equal(pos, null);
      if (_equals_1) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Parameter name ");
        _builder_2.append(paramName, "");
        _builder_2.append(" (as indicated by annotation @");
        String _name_2 = annotation.getName();
        _builder_2.append(_name_2, "");
        _builder_2.append(") not found for query ");
        String _fullyQualifiedName_2 = query.getFullyQualifiedName();
        _builder_2.append(_fullyQualifiedName_2, "");
        _builder_2.append(".");
        throw new IllegalArgumentException(_builder_2.toString());
      }
      _xblockexpression = pos;
    }
    return _xblockexpression;
  }
}
