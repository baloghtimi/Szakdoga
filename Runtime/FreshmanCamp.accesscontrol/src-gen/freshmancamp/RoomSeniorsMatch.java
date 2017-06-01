/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp;

import FreshmanCamp.freshmanCamp.ColorType;
import FreshmanCamp.freshmanCamp.RoomSenior;
import freshmancamp.util.RoomSeniorsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * Pattern-specific match representation of the freshmancamp.roomSeniors pattern,
 * to be used in conjunction with {@link RoomSeniorsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RoomSeniorsMatcher
 * @see RoomSeniorsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RoomSeniorsMatch extends BasePatternMatch {
  private RoomSenior fRoomSenior;
  
  private ColorType fColorType;
  
  private static List<String> parameterNames = makeImmutableList("roomSenior", "colorType");
  
  private RoomSeniorsMatch(final RoomSenior pRoomSenior, final ColorType pColorType) {
    this.fRoomSenior = pRoomSenior;
    this.fColorType = pColorType;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("roomSenior".equals(parameterName)) return this.fRoomSenior;
    if ("colorType".equals(parameterName)) return this.fColorType;
    return null;
  }
  
  public RoomSenior getRoomSenior() {
    return this.fRoomSenior;
  }
  
  public ColorType getColorType() {
    return this.fColorType;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("roomSenior".equals(parameterName) ) {
    	this.fRoomSenior = (RoomSenior) newValue;
    	return true;
    }
    if ("colorType".equals(parameterName) ) {
    	this.fColorType = (ColorType) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRoomSenior(final RoomSenior pRoomSenior) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRoomSenior = pRoomSenior;
  }
  
  public void setColorType(final ColorType pColorType) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fColorType = pColorType;
  }
  
  @Override
  public String patternName() {
    return "freshmancamp.roomSeniors";
  }
  
  @Override
  public List<String> parameterNames() {
    return RoomSeniorsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRoomSenior, fColorType};
  }
  
  @Override
  public RoomSeniorsMatch toImmutable() {
    return isMutable() ? newMatch(fRoomSenior, fColorType) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"roomSenior\"=" + prettyPrintValue(fRoomSenior) + ", ");
    
    result.append("\"colorType\"=" + prettyPrintValue(fColorType)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRoomSenior == null) ? 0 : fRoomSenior.hashCode());
    result = prime * result + ((fColorType == null) ? 0 : fColorType.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RoomSeniorsMatch)) { // this should be infrequent
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
    RoomSeniorsMatch other = (RoomSeniorsMatch) obj;
    if (fRoomSenior == null) {if (other.fRoomSenior != null) return false;}
    else if (!fRoomSenior.equals(other.fRoomSenior)) return false;
    if (fColorType == null) {if (other.fColorType != null) return false;}
    else if (!fColorType.equals(other.fColorType)) return false;
    return true;
  }
  
  @Override
  public RoomSeniorsQuerySpecification specification() {
    try {
    	return RoomSeniorsQuerySpecification.instance();
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
  public static RoomSeniorsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRoomSenior the fixed value of pattern parameter roomSenior, or null if not bound.
   * @param pColorType the fixed value of pattern parameter colorType, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RoomSeniorsMatch newMutableMatch(final RoomSenior pRoomSenior, final ColorType pColorType) {
    return new Mutable(pRoomSenior, pColorType);
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
  public static RoomSeniorsMatch newMatch(final RoomSenior pRoomSenior, final ColorType pColorType) {
    return new Immutable(pRoomSenior, pColorType);
  }
  
  private static final class Mutable extends RoomSeniorsMatch {
    Mutable(final RoomSenior pRoomSenior, final ColorType pColorType) {
      super(pRoomSenior, pColorType);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RoomSeniorsMatch {
    Immutable(final RoomSenior pRoomSenior, final ColorType pColorType) {
      super(pRoomSenior, pColorType);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
