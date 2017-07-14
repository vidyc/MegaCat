package com.tanganaproject.GameWorld;

import com.tanganaproject.GameObjects.Player;

public class GameWorld {

	private Player player;

	public GameWorld() {
		player = new Player(12, 8, 300, 80);
	}

	public void update(float delta) {
		player.update(delta);
	}

	public Player getPlayer() {
		return player;
	}
}
