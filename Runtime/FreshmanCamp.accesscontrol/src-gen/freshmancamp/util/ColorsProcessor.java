/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import FreshmanCamp.freshmanCamp.Color;
import freshmancamp.ColorsMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the freshmancamp.colors pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ColorsProcessor implements IMatchProcessor<ColorsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pColor the value of pattern parameter color in the currently processed match
   * 
   */
  public abstract void process(final Color pColor);
  
  @Override
  public void process(final ColorsMatch match) {
    process(match.getColor());
  }
}
