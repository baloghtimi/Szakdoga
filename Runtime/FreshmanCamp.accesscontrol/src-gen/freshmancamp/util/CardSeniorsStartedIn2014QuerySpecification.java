/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import com.google.common.collect.Sets;
import freshmancamp.CardSeniorsStartedIn2014Match;
import freshmancamp.CardSeniorsStartedIn2014Matcher;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CardSeniorsStartedIn2014Matcher in a type-safe way.
 * 
 * @see CardSeniorsStartedIn2014Matcher
 * @see CardSeniorsStartedIn2014Match
 * 
 */
@SuppressWarnings("all")
public final class CardSeniorsStartedIn2014QuerySpecification extends BaseGeneratedEMFQuerySpecification<CardSeniorsStartedIn2014Matcher> {
  private CardSeniorsStartedIn2014QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static CardSeniorsStartedIn2014QuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CardSeniorsStartedIn2014Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CardSeniorsStartedIn2014Matcher.on(engine);
  }
  
  @Override
  public CardSeniorsStartedIn2014Matcher instantiate() throws ViatraQueryException {
    return CardSeniorsStartedIn2014Matcher.create();
  }
  
  @Override
  public CardSeniorsStartedIn2014Match newEmptyMatch() {
    return CardSeniorsStartedIn2014Match.newEmptyMatch();
  }
  
  @Override
  public CardSeniorsStartedIn2014Match newMatch(final Object... parameters) {
    return CardSeniorsStartedIn2014Match.newMatch((FreshmanCamp.freshmanCamp.CardSenior) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link CardSeniorsStartedIn2014QuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link CardSeniorsStartedIn2014QuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static CardSeniorsStartedIn2014QuerySpecification INSTANCE = new CardSeniorsStartedIn2014QuerySpecification();
    
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
    private final static CardSeniorsStartedIn2014QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pCardSenior = new PParameter("cardSenior", "FreshmanCamp.freshmanCamp.CardSenior", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/freshmanCamp", "CardSenior")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pCardSenior);
    
    @Override
    public String getFullyQualifiedName() {
      return "freshmancamp.cardSeniorsStartedIn2014";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("cardSenior");
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
      		new TypeConstraint(body, new FlatTuple(var_cardSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "CardSenior")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_cardSenior, parameter_pCardSenior)
      		));
      		// 	CardSenior.year(cardSenior, 2014)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, 2014);
      		new TypeConstraint(body, new FlatTuple(var_cardSenior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/freshmanCamp", "CardSenior")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_cardSenior, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/freshmanCamp", "Senior", "year")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
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
  
  private static int evaluateExpression_1_1() {
    return 2014;
  }
}
