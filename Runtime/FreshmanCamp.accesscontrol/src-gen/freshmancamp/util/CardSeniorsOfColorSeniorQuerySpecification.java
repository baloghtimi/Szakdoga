/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import com.google.common.collect.Sets;
import freshmancamp.CardSeniorsOfColorSeniorMatch;
import freshmancamp.CardSeniorsOfColorSeniorMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
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
 * A pattern-specific query specification that can instantiate CardSeniorsOfColorSeniorMatcher in a type-safe way.
 * 
 * @see CardSeniorsOfColorSeniorMatcher
 * @see CardSeniorsOfColorSeniorMatch
 * 
 */
@SuppressWarnings("all")
public final class CardSeniorsOfColorSeniorQuerySpecification extends BaseGeneratedEMFQuerySpecification<CardSeniorsOfColorSeniorMatcher> {
  private CardSeniorsOfColorSeniorQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static CardSeniorsOfColorSeniorQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CardSeniorsOfColorSeniorMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CardSeniorsOfColorSeniorMatcher.on(engine);
  }
  
  @Override
  public CardSeniorsOfColorSeniorMatcher instantiate() throws ViatraQueryException {
    return CardSeniorsOfColorSeniorMatcher.create();
  }
  
  @Override
  public CardSeniorsOfColorSeniorMatch newEmptyMatch() {
    return CardSeniorsOfColorSeniorMatch.newEmptyMatch();
  }
  
  @Override
  public CardSeniorsOfColorSeniorMatch newMatch(final Object... parameters) {
    return CardSeniorsOfColorSeniorMatch.newMatch((FreshmanCamp.freshmanCamp.CardSenior) parameters[0], (FreshmanCamp.freshmanCamp.ColorSenior) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link CardSeniorsOfColorSeniorQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link CardSeniorsOfColorSeniorQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static CardSeniorsOfColorSeniorQuerySpecification INSTANCE = new CardSeniorsOfColorSeniorQuerySpecification();
    
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
    private final static CardSeniorsOfColorSeniorQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pCardSenior = new PParameter("cardSenior", "FreshmanCamp.freshmanCamp.CardSenior", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "CardSenior")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pColorSenior = new PParameter("colorSenior", "FreshmanCamp.freshmanCamp.ColorSenior", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "ColorSenior")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pCardSenior, parameter_pColorSenior);
    
    @Override
    public String getFullyQualifiedName() {
      return "freshmancamp.cardSeniorsOfColorSenior";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("cardSenior","colorSenior");
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
      		PVariable var_colorSenior = body.getOrCreateVariableByName("colorSenior");
      		new TypeConstraint(body, new FlatTuple(var_cardSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "CardSenior")));
      		new TypeConstraint(body, new FlatTuple(var_colorSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "ColorSenior")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_cardSenior, parameter_pCardSenior),
      		   new ExportedParameter(body, var_colorSenior, parameter_pColorSenior)
      		));
      		// 	ColorSenior.inferiors(colorSenior, cardSenior)
      		new TypeConstraint(body, new FlatTuple(var_colorSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "ColorSenior")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_colorSenior, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/freshmanCamp", "ColorSenior", "inferiors")));
      		new Equality(body, var__virtual_0_, var_cardSenior);
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
