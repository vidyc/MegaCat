package com.tanganaproject.MCGame;

import com.badlogic.gdx.Game;
import com.tanganaproject.screens.ScreenHandler;

public class MCGame extends Game {

	@Override
	public void create() {
		setScreen(new ScreenHandler());
	}

}
