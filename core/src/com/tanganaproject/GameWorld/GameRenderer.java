package com.tanganaproject.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.tanganaproject.GameObjects.Player;
import com.tanganaproject.screens.ScreenHandler;

public class GameRenderer {

	private ShapeRenderer shapeRenderer;
	private ScreenHandler screener;
	private Player player;
	private GameWorld world;

	public GameRenderer(ScreenHandler screener, GameWorld world) {
		this.screener = screener;
		shapeRenderer = new ShapeRenderer();
		this.world = world;
		player = world.getPlayer();
	}

	public void render() {

		if (screener.isTitle()) {
			Gdx.gl.glClearColor(162 / 255.0f, 144 / 255.0f, 212 / 255.0f,
					0 / 255.0f);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			shapeRenderer.begin(ShapeType.Filled);
			shapeRenderer.setColor(Color.RED);
			shapeRenderer.rect(200, 200, 200, 200);
			shapeRenderer.end();

		} else if (screener.isMap()) {
			Gdx.gl.glClearColor(212 / 255.0f, 144 / 255.0f, 160 / 255.0f,
					0 / 255.0f);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			shapeRenderer.begin(ShapeType.Filled);
			shapeRenderer.setColor(Color.GREEN);
			shapeRenderer.rect(400, 200, 200, 200);
			shapeRenderer.end();
		}

		else if (screener.isTut()) {
			Gdx.gl.glClearColor(212 / 255.0f, 144 / 255.0f, 160 / 255.0f,
					0 / 255.0f);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			shapeRenderer.begin(ShapeType.Filled);
			shapeRenderer.setColor(Color.BLACK);
			shapeRenderer.rect(player.getPosition().x, player.getPosition().y,
					player.getWidth(), player.getHeight());
			shapeRenderer.end();
		}

	}
}
