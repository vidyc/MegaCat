package com.tanganaproject.GameObjects;

import com.badlogic.gdx.math.Vector2;

public class Player {

	private float height, width;
	private Vector2 position, velocity, acceleration;
	private final float GRAVITY = 0.25f;
	private final int MOVESPEEDX = 10;
	private boolean movingLeft, movingRight, jumped;

	public Player(float height, float width, float x, float y) {
		this.height = height;
		this.width = width;
		position = new Vector2(x, y);
		velocity = new Vector2(0, 0);
		acceleration = new Vector2(0, GRAVITY);
		movingLeft = false;
		movingRight = false;
		jumped = false;

	}

	public void update(float delta) {
		velocity.add(acceleration.cpy().scl(delta));

		if (position.y <= 80)
			position.y = 80;

		if (velocity.y <= -300)
			velocity.y = -300;

		position.add(velocity.cpy().scl(delta));
	}

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	public Vector2 getPosition() {
		return position;
	}

	public Vector2 getVelocity() {
		return velocity;
	}

}
