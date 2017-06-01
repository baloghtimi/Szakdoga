/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import com.google.common.collect.Sets;
import freshmancamp.RoomSeniorsMatch;
import freshmancamp.RoomSeniorsMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RoomSeniorsMatcher in a type-safe way.
 * 
 * @see RoomSeniorsMatcher
 * @see RoomSeniorsMatch
 * 
 */
@SuppressWarnings("all")
public final class RoomSeniorsQuerySpecification extends BaseGeneratedEMFQuerySpecification<RoomSeniorsMatcher> {
  private RoomSeniorsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static RoomSeniorsQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RoomSeniorsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RoomSeniorsMatcher.on(engine);
  }
  
  @Override
  public RoomSeniorsMatcher instantiate() throws ViatraQueryException {
    return RoomSeniorsMatcher.create();
  }
  
  @Override
  public RoomSeniorsMatch newEmptyMatch() {
    return RoomSeniorsMatch.newEmptyMatch();
  }
  
  @Override
  public RoomSeniorsMatch newMatch(final Object... parameters) {
    return RoomSeniorsMatch.newMatch((FreshmanCamp.freshmanCamp.RoomSenior) parameters[0], (FreshmanCamp.freshmanCamp.ColorType) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RoomSeniorsQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link RoomSeniorsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RoomSeniorsQuerySpecification INSTANCE = new RoomSeniorsQuerySpecification();
    
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
    private final static RoomSeniorsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pRoomSenior = new PParameter("roomSenior", "FreshmanCamp.freshmanCamp.RoomSenior", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "RoomSenior")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pColorType = new PParameter("colorType", "FreshmanCamp.freshmanCamp.ColorType", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "ColorType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pRoomSenior, parameter_pColorType);
    
    @Override
    public String getFullyQualifiedName() {
      return "freshmancamp.roomSeniors";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("roomSenior","colorType");
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
      		PVariable var_roomSenior = body.getOrCreateVariableByName("roomSenior");
      		PVariable var_colorType = body.getOrCreateVariableByName("colorType");
      		new TypeConstraint(body, new FlatTuple(var_roomSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "RoomSenior")));
      		new TypeConstraint(body, new FlatTuple(var_colorType), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/freshmanCamp", "ColorType")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_roomSenior, parameter_pRoomSenior),
      		   new ExportedParameter(body, var_colorType, parameter_pColorType)
      		));
      		// 	RoomSenior.color(roomSenior, colorType)
      		new TypeConstraint(body, new FlatTuple(var_roomSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "RoomSenior")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_roomSenior, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/freshmanCamp", "Senior", "color")));
      		new Equality(body, var__virtual_0_, var_colorType);
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
