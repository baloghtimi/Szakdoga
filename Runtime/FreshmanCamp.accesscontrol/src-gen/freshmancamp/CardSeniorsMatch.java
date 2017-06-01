/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.ColorType;
import freshmancamp.util.CardSeniorsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the freshmancamp.cardSeniors pattern,
 * to be used in conjunction with {@link CardSeniorsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CardSeniorsMatcher
 * @see CardSeniorsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CardSeniorsMatch extends BasePatternMatch {
  private CardSenior fCardSenior;
  
  private ColorType fColorType;
  
  private static List<String> parameterNames = makeImmutableList("cardSenior", "colorType");
  
  private CardSeniorsMatch(final CardSenior pCardSenior, final ColorType pColorType) {
    this.fCardSenior = pCardSenior;
    this.fColorType = pColorType;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("cardSenior".equals(parameterName)) return this.fCardSenior;
    if ("colorType".equals(parameterName)) return this.fColorType;
    return null;
  }
  
  public CardSenior getCardSenior() {
    return this.fCardSenior;
  }
  
  public ColorType getColorType() {
    return this.fColorType;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("cardSenior".equals(parameterName) ) {
    	this.fCardSenior = (CardSenior) newValue;
    	return true;
    }
    if ("colorType".equals(parameterName) ) {
    	this.fColorType = (ColorType) newValue;
    	return true;
    }
    return false;
  }
  
  public void setCardSenior(final CardSenior pCardSenior) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCardSenior = pCardSenior;
  }
  
  public void setColorType(final ColorType pColorType) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fColorType = pColorType;
  }
  
  @Override
  public String patternName() {
    return "freshmancamp.cardSeniors";
  }
  
  @Override
  public List<String> parameterNames() {
    return CardSeniorsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCardSenior, fColorType};
  }
  
  @Override
  public CardSeniorsMatch toImmutable() {
    return isMutable() ? newMatch(fCardSenior, fColorType) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"cardSenior\"=" + prettyPrintValue(fCardSenior) + ", ");
    
    result.append("\"colorType\"=" + prettyPrintValue(fColorType)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCardSenior == null) ? 0 : fCardSenior.hashCode());
    result = prime * result + ((fColorType == null) ? 0 : fColorType.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CardSeniorsMatch)) { // this should be infrequent
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
    CardSeniorsMatch other = (CardSeniorsMatch) obj;
    if (fCardSenior == null) {if (other.fCardSenior != null) return false;}
    else if (!fCardSenior.equals(other.fCardSenior)) return false;
    if (fColorType == null) {if (other.fColorType != null) return false;}
    else if (!fColorType.equals(other.fColorType)) return false;
    return true;
  }
  
  @Override
  public CardSeniorsQuerySpecification specification() {
    try {
    	return CardSeniorsQuerySpecification.instance();
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
  public static CardSeniorsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CardSeniorsMatch newMutableMatch(final CardSenior pCardSenior, final ColorType pColorType) {
    return new Mutable(pCardSenior, pColorType);
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
  public static CardSeniorsMatch newMatch(final CardSenior pCardSenior, final ColorType pColorType) {
    return new Immutable(pCardSenior, pColorType);
  }
  
  private static final class Mutable extends CardSeniorsMatch {
    Mutable(final CardSenior pCardSenior, final ColorType pColorType) {
      super(pCardSenior, pColorType);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CardSeniorsMatch {
    Immutable(final CardSenior pCardSenior, final ColorType pColorType) {
      super(pCardSenior, pColorType);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
