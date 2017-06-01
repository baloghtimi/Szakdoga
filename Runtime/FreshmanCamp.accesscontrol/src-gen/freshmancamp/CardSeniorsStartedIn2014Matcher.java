/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.CardSenior;
import freshmancamp.CardSeniorsStartedIn2014Match;
import freshmancamp.util.CardSeniorsStartedIn2014QuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the freshmancamp.cardSeniorsStartedIn2014 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CardSeniorsStartedIn2014Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern cardSeniorsStartedIn2014(cardSenior : CardSenior) = {
 * 	CardSenior.year(cardSenior, 2014);
 * }
 * </pre></code>
 * 
 * @see CardSeniorsStartedIn2014Match
 * @see CardSeniorsStartedIn2014Processor
 * @see CardSeniorsStartedIn2014QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CardSeniorsStartedIn2014Matcher extends BaseMatcher<CardSeniorsStartedIn2014Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CardSeniorsStartedIn2014Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    CardSeniorsStartedIn2014Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (CardSeniorsStartedIn2014Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static CardSeniorsStartedIn2014Matcher create() throws ViatraQueryException {
    return new CardSeniorsStartedIn2014Matcher();
  }
  
  private final static int POSITION_CARDSENIOR = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CardSeniorsStartedIn2014Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private CardSeniorsStartedIn2014Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @return matches represented as a CardSeniorsStartedIn2014Match object.
   * 
   */
  public Collection<CardSeniorsStartedIn2014Match> getAllMatches(final CardSenior pCardSenior) {
    return rawGetAllMatches(new Object[]{pCardSenior});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @return a match represented as a CardSeniorsStartedIn2014Match object, or null if no match is found.
   * 
   */
  public CardSeniorsStartedIn2014Match getOneArbitraryMatch(final CardSenior pCardSenior) {
    return rawGetOneArbitraryMatch(new Object[]{pCardSenior});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CardSenior pCardSenior) {
    return rawHasMatch(new Object[]{pCardSenior});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CardSenior pCardSenior) {
    return rawCountMatches(new Object[]{pCardSenior});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CardSenior pCardSenior, final IMatchProcessor<? super CardSeniorsStartedIn2014Match> processor) {
    rawForEachMatch(new Object[]{pCardSenior}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CardSenior pCardSenior, final IMatchProcessor<? super CardSeniorsStartedIn2014Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCardSenior}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CardSeniorsStartedIn2014Match newMatch(final CardSenior pCardSenior) {
    return CardSeniorsStartedIn2014Match.newMatch(pCardSenior);
  }
  
  /**
   * Retrieve the set of values that occur in matches for cardSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<CardSenior> rawAccumulateAllValuesOfcardSenior(final Object[] parameters) {
    Set<CardSenior> results = new HashSet<CardSenior>();
    rawAccumulateAllValues(POSITION_CARDSENIOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cardSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CardSenior> getAllValuesOfcardSenior() {
    return rawAccumulateAllValuesOfcardSenior(emptyArray());
  }
  
  @Override
  protected CardSeniorsStartedIn2014Match tupleToMatch(final Tuple t) {
    try {
    	return CardSeniorsStartedIn2014Match.newMatch((CardSenior) t.get(POSITION_CARDSENIOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CardSeniorsStartedIn2014Match arrayToMatch(final Object[] match) {
    try {
    	return CardSeniorsStartedIn2014Match.newMatch((CardSenior) match[POSITION_CARDSENIOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CardSeniorsStartedIn2014Match arrayToMatchMutable(final Object[] match) {
    try {
    	return CardSeniorsStartedIn2014Match.newMutableMatch((CardSenior) match[POSITION_CARDSENIOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CardSeniorsStartedIn2014Matcher> querySpecification() throws ViatraQueryException {
    return CardSeniorsStartedIn2014QuerySpecification.instance();
  }
}
