package com.tanganaproject.helpers;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.tanganaproject.GameObjects.Player;
import com.tanganaproject.GameWorld.GameWorld;
import com.tanganaproject.MCGame.MCGame;
import com.tanganaproject.screens.ScreenHandler;

public class InputHandler implements InputProcessor {

	private ScreenHandler screener;
	private MCGame game;
	private GameWorld world;
	private Player player;

	public InputHandler(ScreenHandler screener, GameWorld world) {
		this.screener = screener;
		this.world = world;
		player = world.getPlayer();

	}

	@Override
	public boolean keyDown(int keycode) {
		switch (screener.getCurrentState()) {
		case TITLE:
			switch (keycode) {
			case Input.Keys.SPACE:
				screener.Map();
			}
			break;
		case BOSS:
			break;
		case MAP:
			switch (keycode) {
			case Input.Keys.SPACE:
				screener.Tut();
			}
			break;
		case PAUSED:
			break;
		case STG1:
			break;
		case STG2:
			break;
		case TUT:
			switch (keycode) {
			case Input.Keys.SPACE:
				break;
			case Input.Keys.LEFT:

				break;
			case Input.Keys.RIGHT:

				break;
			case Input.Keys.DOWN:
				break;
			}
			break;
		default:
			break;

		}
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		switch (screener.getCurrentState()) {
		case TITLE:
			break;
		case BOSS:
			break;
		case MAP:
			break;
		case PAUSED:
			break;
		case STG1:
			break;
		case STG2:
			break;
		case TUT:
			switch (keycode) {
			case Input.Keys.SPACE:
				break;
			case Input.Keys.LEFT:
				break;
			case Input.Keys.RIGHT:
				break;
			}
			break;
		default:
			break;

		}
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
