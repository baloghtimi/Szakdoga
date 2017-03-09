/**
 * Generated from platform:/resource/FreshmanCamp.queries/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.CardSenior;
import freshmancamp.util.CardSeniorsStartedIn2014QuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the freshmancamp.cardSeniorsStartedIn2014 pattern,
 * to be used in conjunction with {@link CardSeniorsStartedIn2014Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CardSeniorsStartedIn2014Matcher
 * @see CardSeniorsStartedIn2014Processor
 * 
 */
@SuppressWarnings("all")
public abstract class CardSeniorsStartedIn2014Match extends BasePatternMatch {
  private CardSenior fCardSenior;
  
  private static List<String> parameterNames = makeImmutableList("cardSenior");
  
  private CardSeniorsStartedIn2014Match(final CardSenior pCardSenior) {
    this.fCardSenior = pCardSenior;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("cardSenior".equals(parameterName)) return this.fCardSenior;
    return null;
  }
  
  public CardSenior getCardSenior() {
    return this.fCardSenior;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("cardSenior".equals(parameterName) ) {
    	this.fCardSenior = (CardSenior) newValue;
    	return true;
    }
    return false;
  }
  
  public void setCardSenior(final CardSenior pCardSenior) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCardSenior = pCardSenior;
  }
  
  @Override
  public String patternName() {
    return "freshmancamp.cardSeniorsStartedIn2014";
  }
  
  @Override
  public List<String> parameterNames() {
    return CardSeniorsStartedIn2014Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCardSenior};
  }
  
  @Override
  public CardSeniorsStartedIn2014Match toImmutable() {
    return isMutable() ? newMatch(fCardSenior) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"cardSenior\"=" + prettyPrintValue(fCardSenior)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCardSenior == null) ? 0 : fCardSenior.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CardSeniorsStartedIn2014Match)) { // this should be infrequent
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
    CardSeniorsStartedIn2014Match other = (CardSeniorsStartedIn2014Match) obj;
    if (fCardSenior == null) {if (other.fCardSenior != null) return false;}
    else if (!fCardSenior.equals(other.fCardSenior)) return false;
    return true;
  }
  
  @Override
  public CardSeniorsStartedIn2014QuerySpecification specification() {
    try {
    	return CardSeniorsStartedIn2014QuerySpecification.instance();
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
  public static CardSeniorsStartedIn2014Match newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CardSeniorsStartedIn2014Match newMutableMatch(final CardSenior pCardSenior) {
    return new Mutable(pCardSenior);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCardSenior the fixed value of pattern parameter cardSenior, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CardSeniorsStartedIn2014Match newMatch(final CardSenior pCardSenior) {
    return new Immutable(pCardSenior);
  }
  
  private static final class Mutable extends CardSeniorsStartedIn2014Match {
    Mutable(final CardSenior pCardSenior) {
      super(pCardSenior);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CardSeniorsStartedIn2014Match {
    Immutable(final CardSenior pCardSenior) {
      super(pCardSenior);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
