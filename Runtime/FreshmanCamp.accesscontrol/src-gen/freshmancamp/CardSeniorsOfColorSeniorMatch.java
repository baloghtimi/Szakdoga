/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.ColorSenior;
import freshmancamp.util.CardSeniorsOfColorSeniorQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the freshmancamp.cardSeniorsOfColorSenior pattern,
 * to be used in conjunction with {@link CardSeniorsOfColorSeniorMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CardSeniorsOfColorSeniorMatcher
 * @see CardSeniorsOfColorSeniorProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CardSeniorsOfColorSeniorMatch extends BasePatternMatch {
  private CardSenior fCardSenior;
  
  private ColorSenior fColorSenior;
  
  private static List<String> parameterNames = makeImmutableList("cardSenior", "colorSenior");
  
  private CardSeniorsOfColorSeniorMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    this.fCardSenior = pCardSenior;
    this.fColorSenior = pColorSenior;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("cardSenior".equals(parameterName)) return this.fCardSenior;
    if ("colorSenior".equals(parameterName)) return this.fColorSenior;
    return null;
  }
  
  public CardSenior getCardSenior() {
    return this.fCardSenior;
  }
  
  public ColorSenior getColorSenior() {
    return this.fColorSenior;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("cardSenior".equals(parameterName) ) {
    	this.fCardSenior = (CardSenior) newValue;
    	return true;
    }
    if ("colorSenior".equals(parameterName) ) {
    	this.fColorSenior = (ColorSenior) newValue;
    	return true;
    }
    return false;
  }
  
  public void setCardSenior(final CardSenior pCardSenior) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCardSenior = pCardSenior;
  }
  
  public void setColorSenior(final ColorSenior pColorSenior) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fColorSenior = pColorSenior;
  }
  
  @Override
  public String patternName() {
    return "freshmancamp.cardSeniorsOfColorSenior";
  }
  
  @Override
  public List<String> parameterNames() {
    return CardSeniorsOfColorSeniorMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCardSenior, fColorSenior};
  }
  
  @Override
  public CardSeniorsOfColorSeniorMatch toImmutable() {
    return isMutable() ? newMatch(fCardSenior, fColorSenior) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"cardSenior\"=" + prettyPrintValue(fCardSenior) + ", ");
    
    result.append("\"colorSenior\"=" + prettyPrintValue(fColorSenior)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCardSenior == null) ? 0 : fCardSenior.hashCode());
    result = prime * result + ((fColorSenior == null) ? 0 : fColorSenior.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CardSeniorsOfColorSeniorMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CardSeniorsOfColorSeniorMatch other = (CardSeniorsOfColorSeniorMatch) obj;
    if (fCardSenior == null) {if (other.fCardSenior != null) return false;}
    else if (!fCardSenior.equals(other.fCardSenior)) return false;
    if (fColorSenior == null) {if (other.fColorSenior != null) return false;}
    else if (!fColorSenior.equals(other.fColorSenior)) return false;
    return true;
  }
  
  @Override
  public CardSeniorsOfColorSeniorQuerySpecification specification() {
    try {
    	return CardSeniorsOfColorSeniorQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static CardSeniorsOfColorSeniorMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorSenior the fixed value of pattern parameter colorSenior, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CardSeniorsOfColorSeniorMatch newMutableMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    return new Mutable(pCardSenior, pColorSenior);
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
  public static CardSeniorsOfColorSeniorMatch newMatch(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
    return new Immutable(pCardSenior, pColorSenior);
  }
  
  private static final class Mutable extends CardSeniorsOfColorSeniorMatch {
    Mutable(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
      super(pCardSenior, pColorSenior);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CardSeniorsOfColorSeniorMatch {
    Immutable(final CardSenior pCardSenior, final ColorSenior pColorSenior) {
      super(pCardSenior, pColorSenior);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
