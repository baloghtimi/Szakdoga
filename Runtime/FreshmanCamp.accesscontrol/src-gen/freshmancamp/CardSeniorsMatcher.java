/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.ColorType;
import freshmancamp.CardSeniorsMatch;
import freshmancamp.util.CardSeniorsQuerySpecification;
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
 * Generated pattern matcher API of the freshmancamp.cardSeniors pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CardSeniorsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern cardSeniors(cardSenior : CardSenior, colorType : ColorType) = {
 * 	CardSenior.color(cardSenior, colorType);
 * }
 * </pre></code>
 * 
 * @see CardSeniorsMatch
 * @see CardSeniorsProcessor
 * @see CardSeniorsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CardSeniorsMatcher extends BaseMatcher<CardSeniorsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CardSeniorsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    CardSeniorsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (CardSeniorsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static CardSeniorsMatcher create() throws ViatraQueryException {
    return new CardSeniorsMatcher();
  }
  
  private final static int POSITION_CARDSENIOR = 0;
  
  private final static int POSITION_COLORTYPE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CardSeniorsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private CardSeniorsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return matches represented as a CardSeniorsMatch object.
   * 
   */
  public Collection<CardSeniorsMatch> getAllMatches(final CardSenior pCardSenior, final ColorType pColorType) {
    return rawGetAllMatches(new Object[]{pCardSenior, pColorType});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return a match represented as a CardSeniorsMatch object, or null if no match is found.
   * 
   */
  public CardSeniorsMatch getOneArbitraryMatch(final CardSenior pCardSenior, final ColorType pColorType) {
    return rawGetOneArbitraryMatch(new Object[]{pCardSenior, pColorType});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CardSenior pCardSenior, final ColorType pColorType) {
    return rawHasMatch(new Object[]{pCardSenior, pColorType});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CardSenior pCardSenior, final ColorType pColorType) {
    return rawCountMatches(new Object[]{pCardSenior, pColorType});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CardSenior pCardSenior, final ColorType pColorType, final IMatchProcessor<? super CardSeniorsMatch> processor) {
    rawForEachMatch(new Object[]{pCardSenior, pColorType}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CardSenior pCardSenior, final ColorType pColorType, final IMatchProcessor<? super CardSeniorsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCardSenior, pColorType}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CardSeniorsMatch newMatch(final CardSenior pCardSenior, final ColorType pColorType) {
    return CardSeniorsMatch.newMatch(pCardSenior, pColorType);
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
  public Set<CardSenior> getAllValuesOfcardSenior(final CardSeniorsMatch partialMatch) {
    return rawAccumulateAllValuesOfcardSenior(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cardSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CardSenior> getAllValuesOfcardSenior(final ColorType pColorType) {
    return rawAccumulateAllValuesOfcardSenior(new Object[]{
    null, 
    pColorType
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ColorType> rawAccumulateAllValuesOfcolorType(final Object[] parameters) {
    Set<ColorType> results = new HashSet<ColorType>();
    rawAccumulateAllValues(POSITION_COLORTYPE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ColorType> getAllValuesOfcolorType() {
    return rawAccumulateAllValuesOfcolorType(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ColorType> getAllValuesOfcolorType(final CardSeniorsMatch partialMatch) {
    return rawAccumulateAllValuesOfcolorType(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ColorType> getAllValuesOfcolorType(final CardSenior pCardSenior) {
    return rawAccumulateAllValuesOfcolorType(new Object[]{
    pCardSenior, 
    null
    });
  }
  
  @Override
  protected CardSeniorsMatch tupleToMatch(final Tuple t) {
    try {
    	return CardSeniorsMatch.newMatch((CardSenior) t.get(POSITION_CARDSENIOR), (ColorType) t.get(POSITION_COLORTYPE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CardSeniorsMatch arrayToMatch(final Object[] match) {
    try {
    	return CardSeniorsMatch.newMatch((CardSenior) match[POSITION_CARDSENIOR], (ColorType) match[POSITION_COLORTYPE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CardSeniorsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CardSeniorsMatch.newMutableMatch((CardSenior) match[POSITION_CARDSENIOR], (ColorType) match[POSITION_COLORTYPE]);
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
  public static IQuerySpecification<CardSeniorsMatcher> querySpecification() throws ViatraQueryException {
    return CardSeniorsQuerySpecification.instance();
  }
}
