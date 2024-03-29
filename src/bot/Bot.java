/**
 * Warlight AI Game Bot
 *
 * Last update: January 29, 2015
 *
 * @author Jim van Eeden
 * @version 1.1
 * @License MIT License (http://opensource.org/Licenses/MIT)
 */

package bot;

import java.util.ArrayList;
import java.util.List;

import map.Region;
import move.AttackTransferMove;
import move.PlaceArmiesMove;

public interface Bot {

  public Region getStartingRegion(BotState state, Long timeOut); // warlight 2

  public List<Region> getStartingRegions(BotState state, Long timeOut); // warlight 1

  public ArrayList<PlaceArmiesMove> getPlaceArmiesMoves(BotState state, Long timeOut);

  public ArrayList<AttackTransferMove> getAttackTransferMoves(BotState state, Long timeOut);


}
