package com.tanganproject.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tanganaproject.MCGame.MCGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "MegaCat";
		config.width = 1920;
		config.height = 1080;
		new LwjglApplication(new MCGame(), config);
	}
}
