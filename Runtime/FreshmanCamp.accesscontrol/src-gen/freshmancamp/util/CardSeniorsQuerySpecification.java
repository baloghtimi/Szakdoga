/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import com.google.common.collect.Sets;
import freshmancamp.CardSeniorsMatch;
import freshmancamp.CardSeniorsMatcher;
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
 * A pattern-specific query specification that can instantiate CardSeniorsMatcher in a type-safe way.
 * 
 * @see CardSeniorsMatcher
 * @see CardSeniorsMatch
 * 
 */
@SuppressWarnings("all")
public final class CardSeniorsQuerySpecification extends BaseGeneratedEMFQuerySpecification<CardSeniorsMatcher> {
  private CardSeniorsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static CardSeniorsQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CardSeniorsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CardSeniorsMatcher.on(engine);
  }
  
  @Override
  public CardSeniorsMatcher instantiate() throws ViatraQueryException {
    return CardSeniorsMatcher.create();
  }
  
  @Override
  public CardSeniorsMatch newEmptyMatch() {
    return CardSeniorsMatch.newEmptyMatch();
  }
  
  @Override
  public CardSeniorsMatch newMatch(final Object... parameters) {
    return CardSeniorsMatch.newMatch((FreshmanCamp.freshmanCamp.CardSenior) parameters[0], (FreshmanCamp.freshmanCamp.ColorType) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link CardSeniorsQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link CardSeniorsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static CardSeniorsQuerySpecification INSTANCE = new CardSeniorsQuerySpecification();
    
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
    private final static CardSeniorsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pCardSenior = new PParameter("cardSenior", "FreshmanCamp.freshmanCamp.CardSenior", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "CardSenior")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pColorType = new PParameter("colorType", "FreshmanCamp.freshmanCamp.ColorType", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "ColorType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pCardSenior, parameter_pColorType);
    
    @Override
    public String getFullyQualifiedName() {
      return "freshmancamp.cardSeniors";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("cardSenior","colorType");
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
      		PVariable var_cardSenior = body.getOrCreateVariableByName("cardSenior");
      		PVariable var_colorType = body.getOrCreateVariableByName("colorType");
      		new TypeConstraint(body, new FlatTuple(var_cardSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "CardSenior")));
      		new TypeConstraint(body, new FlatTuple(var_colorType), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/freshmanCamp", "ColorType")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_cardSenior, parameter_pCardSenior),
      		   new ExportedParameter(body, var_colorType, parameter_pColorType)
      		));
      		// 	CardSenior.color(cardSenior, colorType)
      		new TypeConstraint(body, new FlatTuple(var_cardSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "CardSenior")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_cardSenior, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/freshmanCamp", "Senior", "color")));
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
