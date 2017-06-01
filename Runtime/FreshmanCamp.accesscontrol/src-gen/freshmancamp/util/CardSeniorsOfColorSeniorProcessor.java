/**
 * Generated from platform:/resource/FreshmanCamp.accesscontrol/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import FreshmanCamp.freshmanCamp.CardSenior;
import FreshmanCamp.freshmanCamp.ColorSenior;
import freshmancamp.CardSeniorsOfColorSeniorMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the freshmancamp.cardSeniorsOfColorSenior pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CardSeniorsOfColorSeniorProcessor implements IMatchProcessor<CardSeniorsOfColorSeniorMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCardSenior the value of pattern parameter cardSenior in the currently processed match
   * @param pColorSenior the value of pattern parameter colorSenior in the currently processed match
   * 
   */
  public abstract void process(final CardSenior pCardSenior, final ColorSenior pColorSenior);
  
  @Override
  public void process(final CardSeniorsOfColorSeniorMatch match) {
    process(match.getCardSenior(), match.getColorSenior());
  }
}
