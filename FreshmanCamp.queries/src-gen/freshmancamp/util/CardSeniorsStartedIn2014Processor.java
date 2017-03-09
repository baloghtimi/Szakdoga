/**
 * Generated from platform:/resource/FreshmanCamp.queries/src/freshmancamp/FreshmanCamp.vql
 */
package freshmancamp.util;

import FreshmanCamp.freshmanCamp.CardSenior;
import freshmancamp.CardSeniorsStartedIn2014Match;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the freshmancamp.cardSeniorsStartedIn2014 pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CardSeniorsStartedIn2014Processor implements IMatchProcessor<CardSeniorsStartedIn2014Match> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCardSenior the value of pattern parameter cardSenior in the currently processed match
   * 
   */
  public abstract void process(final CardSenior pCardSenior);
  
  @Override
  public void process(final CardSeniorsStartedIn2014Match match) {
    process(match.getCardSenior());
  }
}
