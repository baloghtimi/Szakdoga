/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.ColorSenior;
import freshmancamp.CardSeniorsOfColorSeniorMatch;
import freshmancamp.util.CardSeniorsOfColorSeniorQuerySpecification;
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
 * Generated pattern matcher API of the freshmancamp.cardSeniorsOfColorSenior pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CardSeniorsOfColorSeniorMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern cardSeniorsOfColorSenior(cardSenior : CardSenior, colorSenior : ColorSenior) = {
 * 	ColorSenior.inferiors(colorSenior, cardSenior);
 * }
 * </pre></code>
 * 
 * @see CardSeniorsOfColorSeniorMatch
 * @see CardSeniorsOfColorSeniorProcessor
 * @see CardSeniorsOfColorSeniorQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CardSeniorsOfColorSeniorMatcher extends BaseMatcher<CardSeniorsOfColorSeniorMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CardSeniorsOfColorSeniorMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    CardSeniorsOfColorSeniorMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (CardSeniorsOfColorSeniorMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static CardSeniorsOfColorSeniorMatcher create() throws ViatraQueryException {
    return new CardSeniorsOfColorSeniorMatcher();
  }
  
  private final static int POSITION_CARDSENIOR = 0;
  
  private final static int POSITION_COLORSENIOR = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CardSeniorsOfColorSeniorMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private CardSeniorsOfColorSeniorMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @return matches represented as a CardSeniorsOfColorSeniorMatch object.
   * 
   */
  public Collection<CardSeniorsOfColorSeniorMatch> getAllMatches(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    return rawGetAllMatches(new Object[]{pCardSenior, pColorSenior});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @return a match represented as a CardSeniorsOfColorSeniorMatch object, or null if no match is found.
   * 
   */
  public CardSeniorsOfColorSeniorMatch getOneArbitraryMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    return rawGetOneArbitraryMatch(new Object[]{pCardSenior, pColorSenior});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    return rawHasMatch(new Object[]{pCardSenior, pColorSenior});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    return rawCountMatches(new Object[]{pCardSenior, pColorSenior});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior, final IMatchProcessor<? super CardSeniorsOfColorSeniorMatch> processor) {
    rawForEachMatch(new Object[]{pCardSenior, pColorSenior}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior, final IMatchProcessor<? super CardSeniorsOfColorSeniorMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCardSenior, pColorSenior}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CardSeniorsOfColorSeniorMatch newMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    return CardSeniorsOfColorSeniorMatch.newMatch(pCardSenior, pColorSenior);
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
  
  /**
   * Retrieve the set of values that occur in matches for cardSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CardSenior> getAllValuesOfcardSenior(final CardSeniorsOfColorSeniorMatch partialMatch) {
    return rawAccumulateAllValuesOfcardSenior(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cardSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CardSenior> getAllValuesOfcardSenior(final ColorSenior pColorSenior) {
    return rawAccumulateAllValuesOfcardSenior(new Object[]{
    null, 
    pColorSenior
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ColorSenior> rawAccumulateAllValuesOfcolorSenior(final Object[] parameters) {
    Set<ColorSenior> results = new HashSet<ColorSenior>();
    rawAccumulateAllValues(POSITION_COLORSENIOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ColorSenior> getAllValuesOfcolorSenior() {
    return rawAccumulateAllValuesOfcolorSenior(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ColorSenior> getAllValuesOfcolorSenior(final CardSeniorsOfColorSeniorMatch partialMatch) {
    return rawAccumulateAllValuesOfcolorSenior(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ColorSenior> getAllValuesOfcolorSenior(final CardSenior pCardSenior) {
    return rawAccumulateAllValuesOfcolorSenior(new Object[]{
    pCardSenior, 
    null
    });
  }
  
  @Override
  protected CardSeniorsOfColorSeniorMatch tupleToMatch(final Tuple t) {
    try {
    	return CardSeniorsOfColorSeniorMatch.newMatch((CardSenior) t.get(POSITION_CARDSENIOR), (ColorSenior) t.get(POSITION_COLORSENIOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CardSeniorsOfColorSeniorMatch arrayToMatch(final Object[] match) {
    try {
    	return CardSeniorsOfColorSeniorMatch.newMatch((CardSenior) match[POSITION_CARDSENIOR], (ColorSenior) match[POSITION_COLORSENIOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CardSeniorsOfColorSeniorMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CardSeniorsOfColorSeniorMatch.newMutableMatch((CardSenior) match[POSITION_CARDSENIOR], (ColorSenior) match[POSITION_COLORSENIOR]);
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
  public static IQuerySpecification<CardSeniorsOfColorSeniorMatcher> querySpecification() throws ViatraQueryException {
    return CardSeniorsOfColorSeniorQuerySpecification.instance();
  }
}
