package com.tanganaproject.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.tanganaproject.GameWorld.GameRenderer;
import com.tanganaproject.GameWorld.GameWorld;
import com.tanganaproject.MCGame.MCGame;
import com.tanganaproject.helpers.InputHandler;

public class ScreenHandler implements Screen {

	protected ShapeRenderer shapeRenderer;
	protected GameWorld world;
	protected GameRenderer renderer;
	private GameScreen gameScreen;
	private TitleScreen titleScreen;
	private MapScreen mapScreen;
	private Stg1Screen stg1Screen;
	private Stg2Screen stg2Screen;
	private BossScreen bossScreen;
	private PausedScreen pausedScreen;
	private MCGame game;

	private ScreenState currentState;

	public enum ScreenState {
		TITLE, MAP, TUT, STG1, STG2, BOSS, PAUSED
	}

	public ScreenHandler() {
		currentState = ScreenState.TITLE;
		world = new GameWorld();
		renderer = new GameRenderer(this, world);

		Gdx.input.setInputProcessor(new InputHandler(this, world));
	}

	public void updateTitle() {

	}

	public void update(float delta) {
		switch (currentState) {

		case TITLE:
			game.setScreen(titleScreen);
		case MAP:
			game.setScreen(mapScreen);
			break;
		case TUT:
			game.setScreen(gameScreen);
			break;
		case STG1:
			game.setScreen(stg1Screen);
			break;
		case STG2:
			game.setScreen(stg2Screen);
			break;
		case BOSS:
			game.setScreen(bossScreen);
			break;
		case PAUSED:
			game.setScreen(pausedScreen);
			break;

		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		world.update(delta);
		renderer.render();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {

	}

	public void Title() {
		currentState = ScreenState.TITLE;
	}

	public void Map() {
		currentState = ScreenState.MAP;
	}

	public void Tut() {
		currentState = ScreenState.TUT;
	}

	public void Stg1() {
		currentState = ScreenState.STG1;
	}

	public void Stg2() {
		currentState = ScreenState.STG2;
	}

	public void Boss() {
		currentState = ScreenState.BOSS;
	}

	public void Paused() {
		currentState = ScreenState.PAUSED;
	}

	public boolean isTitle() {
		return currentState == ScreenState.TITLE;
	}

	public boolean isMap() {
		return currentState == ScreenState.MAP;
	}

	public boolean isTut() {
		return currentState == ScreenState.TUT;
	}

	public boolean isStg1() {
		return currentState == ScreenState.STG1;
	}

	public boolean isStg2() {
		return currentState == ScreenState.STG2;
	}

	public boolean isBoss() {
		return currentState == ScreenState.BOSS;
	}

	public boolean isPaused() {
		return currentState == ScreenState.PAUSED;
	}

	public ScreenState getCurrentState() {
		return currentState;

	}

}
