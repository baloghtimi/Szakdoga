/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import com.google.common.collect.Sets;
import freshmancamp.ColorsMatch;
import freshmancamp.ColorsMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ColorsMatcher in a type-safe way.
 * 
 * @see ColorsMatcher
 * @see ColorsMatch
 * 
 */
@SuppressWarnings("all")
public final class ColorsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ColorsMatcher> {
  private ColorsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ColorsQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ColorsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ColorsMatcher.on(engine);
  }
  
  @Override
  public ColorsMatcher instantiate() throws ViatraQueryException {
    return ColorsMatcher.create();
  }
  
  @Override
  public ColorsMatch newEmptyMatch() {
    return ColorsMatch.newEmptyMatch();
  }
  
  @Override
  public ColorsMatch newMatch(final Object... parameters) {
    return ColorsMatch.newMatch((FreshmanCamp.freshmanCamp.Color) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ColorsQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link ColorsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ColorsQuerySpecification INSTANCE = new ColorsQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ColorsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pColor = new PParameter("color", "FreshmanCamp.freshmanCamp.Color", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "Color")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pColor);
    
    @Override
    public String getFullyQualifiedName() {
      return "freshmancamp.colors";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("color");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_color = body.getOrCreateVariableByName("color");
      		new TypeConstraint(body, new FlatTuple(var_color), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "Color")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_color, parameter_pColor)
      		));
      		// 	Color(color)
      		new TypeConstraint(body, new FlatTuple(var_color), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "Color")));
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
