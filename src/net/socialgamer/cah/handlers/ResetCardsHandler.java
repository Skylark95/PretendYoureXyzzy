package net.socialgamer.cah.handlers;

import com.google.inject.Inject;

import net.socialgamer.cah.Constants.AjaxOperation;
import net.socialgamer.cah.Constants.ReturnableData;
import net.socialgamer.cah.RequestWrapper;
import net.socialgamer.cah.data.Game;
import net.socialgamer.cah.data.GameManager;
import net.socialgamer.cah.data.User;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;


public class ResetCardsHandler extends GameWithPlayerHandler {

  public static final String OP = AjaxOperation.RESET_CARDS.toString();

  @Inject
  public ResetCardsHandler(final GameManager gameManager) {
    super(gameManager);
  }

  @Override
  public Map<ReturnableData, Object> handleWithUserInGame(final RequestWrapper request,
      final HttpSession session, final User user, final Game game) {
    final Map<ReturnableData, Object> data = new HashMap<ReturnableData, Object>();

    game.resetCardsForUser(user);

    return data;
  }

}
