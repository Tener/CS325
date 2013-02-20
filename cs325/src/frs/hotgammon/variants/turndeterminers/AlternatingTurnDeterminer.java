package frs.hotgammon.variants.turndeterminers;

import frs.hotgammon.Color;
import frs.hotgammon.Game;
import frs.hotgammon.TurnDeterminer;

public class AlternatingTurnDeterminer implements TurnDeterminer{

	private Game game;
	
	@Override
	public Color nextTurn() {
		return (this.game.getPlayerInTurn() == Color.BLACK) ? Color.RED : Color.BLACK;
	}

	@Override
	public void setGame(Game game) {
		this.game = game;		
	}

}