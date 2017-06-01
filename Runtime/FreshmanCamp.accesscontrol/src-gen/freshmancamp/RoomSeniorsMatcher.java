/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.ColorType;
import FreshmanCamp.freshmanCamp.RoomSenior;
import freshmancamp.RoomSeniorsMatch;
import freshmancamp.util.RoomSeniorsQuerySpecification;
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
 * Generated pattern matcher API of the freshmancamp.roomSeniors pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RoomSeniorsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern roomSeniors(roomSenior : RoomSenior, colorType : ColorType) = {
 * 	RoomSenior.color(roomSenior, colorType);
 * }
 * </pre></code>
 * 
 * @see RoomSeniorsMatch
 * @see RoomSeniorsProcessor
 * @see RoomSeniorsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RoomSeniorsMatcher extends BaseMatcher<RoomSeniorsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RoomSeniorsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    RoomSeniorsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (RoomSeniorsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static RoomSeniorsMatcher create() throws ViatraQueryException {
    return new RoomSeniorsMatcher();
  }
  
  private final static int POSITION_ROOMSENIOR = 0;
  
  private final static int POSITION_COLORTYPE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RoomSeniorsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private RoomSeniorsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return matches represented as a RoomSeniorsMatch object.
   * 
   */
  public Collection<RoomSeniorsMatch> getAllMatches(final RoomSenior pRoomSenior, final ColorType pColorType) {
    return rawGetAllMatches(new Object[]{pRoomSenior, pColorType});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return a match represented as a RoomSeniorsMatch object, or null if no match is found.
   * 
   */
  public RoomSeniorsMatch getOneArbitraryMatch(final RoomSenior pRoomSenior, final ColorType pColorType) {
    return rawGetOneArbitraryMatch(new Object[]{pRoomSenior, pColorType});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RoomSenior pRoomSenior, final ColorType pColorType) {
    return rawHasMatch(new Object[]{pRoomSenior, pColorType});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RoomSenior pRoomSenior, final ColorType pColorType) {
    return rawCountMatches(new Object[]{pRoomSenior, pColorType});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RoomSenior pRoomSenior, final ColorType pColorType, final IMatchProcessor<? super RoomSeniorsMatch> processor) {
    rawForEachMatch(new Object[]{pRoomSenior, pColorType}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RoomSenior pRoomSenior, final ColorType pColorType, final IMatchProcessor<? super RoomSeniorsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRoomSenior, pColorType}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RoomSeniorsMatch newMatch(final RoomSenior pRoomSenior, final ColorType pColorType) {
    return RoomSeniorsMatch.newMatch(pRoomSenior, pColorType);
  }
  
  /**
   * Retrieve the set of values that occur in matches for roomSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<RoomSenior> rawAccumulateAllValuesOfroomSenior(final Object[] parameters) {
    Set<RoomSenior> results = new HashSet<RoomSenior>();
    rawAccumulateAllValues(POSITION_ROOMSENIOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for roomSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RoomSenior> getAllValuesOfroomSenior() {
    return rawAccumulateAllValuesOfroomSenior(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for roomSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RoomSenior> getAllValuesOfroomSenior(final RoomSeniorsMatch partialMatch) {
    return rawAccumulateAllValuesOfroomSenior(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for roomSenior.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RoomSenior> getAllValuesOfroomSenior(final ColorType pColorType) {
    return rawAccumulateAllValuesOfroomSenior(new Object[]{
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
  public Set<ColorType> getAllValuesOfcolorType(final RoomSeniorsMatch partialMatch) {
    return rawAccumulateAllValuesOfcolorType(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for colorType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ColorType> getAllValuesOfcolorType(final RoomSenior pRoomSenior) {
    return rawAccumulateAllValuesOfcolorType(new Object[]{
    pRoomSenior, 
    null
    });
  }
  
  @Override
  protected RoomSeniorsMatch tupleToMatch(final Tuple t) {
    try {
    	return RoomSeniorsMatch.newMatch((RoomSenior) t.get(POSITION_ROOMSENIOR), (ColorType) t.get(POSITION_COLORTYPE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RoomSeniorsMatch arrayToMatch(final Object[] match) {
    try {
    	return RoomSeniorsMatch.newMatch((RoomSenior) match[POSITION_ROOMSENIOR], (ColorType) match[POSITION_COLORTYPE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RoomSeniorsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RoomSeniorsMatch.newMutableMatch((RoomSenior) match[POSITION_ROOMSENIOR], (ColorType) match[POSITION_COLORTYPE]);
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
  public static IQuerySpecification<RoomSeniorsMatcher> querySpecification() throws ViatraQueryException {
    return RoomSeniorsQuerySpecification.instance();
  }
}
