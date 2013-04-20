package frs.hotgammon.view;

import java.awt.event.MouseEvent;
import java.util.HashMap;

import frs.hotgammon.framework.Game;

import minidraw.framework.Drawing;
import minidraw.framework.DrawingEditor;
import minidraw.framework.Figure;
import minidraw.framework.Tool;
import minidraw.standard.AbstractTool;

public class HotGammonTool extends AbstractTool{

	private Tool currentTool;
	private Game game;
	final public static String DIE_ROLL_TOOL = "DIE_ROLL_TOOL";
	final public static String MOVE_TOOL = "MOVE_TOOL";
	private HashMap<String, Tool> states;
		
	public HotGammonTool( DrawingEditor editor, Game game, String initialState, HashMap<String,Tool> states) {
		super(editor);
		this.game = game;		
		this.states = states;
		setState(initialState);
	}

	public void mouseUp(MouseEvent e, int x, int y) { 
		
	    this.currentTool.mouseUp(e,x,y);
	    
	    //editor.showStatus(game.getPlayerInTurn().toString() + " has " + game.getNumberOfMovesLeft() + " moves left..");
	}
	
	public void mouseDrag(MouseEvent e, int x, int y) {

	    this.currentTool.mouseDrag(e,x,y);
	}
	
	public void mouseDown(MouseEvent e, int x, int y) {

	    this.currentTool.mouseDown(e,x,y);
	}
		
	public void setState(String toolKey){
		this.currentTool = states.get(toolKey);
	}
	
}
