/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import FreshmanCamp.freshmanCamp.ColorType;
import FreshmanCamp.freshmanCamp.RoomSenior;
import freshmancamp.RoomSeniorsMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the freshmancamp.roomSeniors pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RoomSeniorsProcessor implements IMatchProcessor<RoomSeniorsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRoomSenior the value of pattern parameter roomSenior in the currently processed match
   * @param pColorType the value of pattern parameter colorType in the currently processed match
   * 
   */
  public abstract void process(final RoomSenior pRoomSenior, final ColorType pColorType);
  
  @Override
  public void process(final RoomSeniorsMatch match) {
    process(match.getRoomSenior(), match.getColorType());
  }
}
