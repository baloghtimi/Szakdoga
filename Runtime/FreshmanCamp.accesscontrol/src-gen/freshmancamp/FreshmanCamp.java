/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import freshmancamp.CardSeniorsMatcher;
import freshmancamp.CardSeniorsOfColorSeniorMatcher;
import freshmancamp.CardSeniorsStartedIn2014Matcher;
import freshmancamp.ColorsMatcher;
import freshmancamp.RoomSeniorsMatcher;
import freshmancamp.util.CardSeniorsOfColorSeniorQuerySpecification;
import freshmancamp.util.CardSeniorsQuerySpecification;
import freshmancamp.util.CardSeniorsStartedIn2014QuerySpecification;
import freshmancamp.util.ColorsQuerySpecification;
import freshmancamp.util.RoomSeniorsQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * A pattern group formed of all patterns defined in FreshmanCamp.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file FreshmanCamp.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package freshmancamp, the group contains the definition of the following patterns: <ul>
 * <li>colors</li>
 * <li>cardSeniors</li>
 * <li>cardSeniorsOfColorSenior</li>
 * <li>cardSeniorsStartedIn2014</li>
 * <li>roomSeniors</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class FreshmanCamp extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static FreshmanCamp instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new FreshmanCamp();
    }
    return INSTANCE;
  }
  
  private static FreshmanCamp INSTANCE;
  
  private FreshmanCamp() throws ViatraQueryException {
    querySpecifications.add(ColorsQuerySpecification.instance());
    querySpecifications.add(CardSeniorsQuerySpecification.instance());
    querySpecifications.add(CardSeniorsOfColorSeniorQuerySpecification.instance());
    querySpecifications.add(CardSeniorsStartedIn2014QuerySpecification.instance());
    querySpecifications.add(RoomSeniorsQuerySpecification.instance());
  }
  
  public ColorsQuerySpecification getColors() throws ViatraQueryException {
    return ColorsQuerySpecification.instance();
  }
  
  public ColorsMatcher getColors(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ColorsMatcher.on(engine);
  }
  
  public CardSeniorsQuerySpecification getCardSeniors() throws ViatraQueryException {
    return CardSeniorsQuerySpecification.instance();
  }
  
  public CardSeniorsMatcher getCardSeniors(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CardSeniorsMatcher.on(engine);
  }
  
  public CardSeniorsOfColorSeniorQuerySpecification getCardSeniorsOfColorSenior() throws ViatraQueryException {
    return CardSeniorsOfColorSeniorQuerySpecification.instance();
  }
  
  public CardSeniorsOfColorSeniorMatcher getCardSeniorsOfColorSenior(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CardSeniorsOfColorSeniorMatcher.on(engine);
  }
  
  public CardSeniorsStartedIn2014QuerySpecification getCardSeniorsStartedIn2014() throws ViatraQueryException {
    return CardSeniorsStartedIn2014QuerySpecification.instance();
  }
  
  public CardSeniorsStartedIn2014Matcher getCardSeniorsStartedIn2014(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CardSeniorsStartedIn2014Matcher.on(engine);
  }
  
  public RoomSeniorsQuerySpecification getRoomSeniors() throws ViatraQueryException {
    return RoomSeniorsQuerySpecification.instance();
  }
  
  public RoomSeniorsMatcher getRoomSeniors(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RoomSeniorsMatcher.on(engine);
  }
}
