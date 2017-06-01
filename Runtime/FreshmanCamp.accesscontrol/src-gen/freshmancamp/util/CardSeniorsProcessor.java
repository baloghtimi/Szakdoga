/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.ColorType;
import freshmancamp.CardSeniorsMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the freshmancamp.cardSeniors pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CardSeniorsProcessor implements IMatchProcessor<CardSeniorsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCardSenior the value of pattern parameter cardSenior in the currently processed match
   * @param pColorType the value of pattern parameter colorType in the currently processed match
   * 
   */
  public abstract void process(final CardSenior pCardSenior, final ColorType pColorType);
  
  @Override
  public void process(final CardSeniorsMatch match) {
    process(match.getCardSenior(), match.getColorType());
  }
}
