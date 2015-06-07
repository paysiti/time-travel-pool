package edu.ncsu;

import java.util.ArrayList;

import org.dyn4j.dynamics.World;

import org.dyn4j.geometry.Vector2;

public class BilliardsWorld extends World {
	private ArrayList<PoolBall> currentBalls;
	private ArrayList<PoolBall> futureBalls;
	private ArrayList<Pocket> pockets;
	private ArrayList<Cushion> cushions;



	public BilliardsWorld() {
		currentBalls = new ArrayList<PoolBall>();
		futureBalls = new ArrayList<PoolBall>();
		pockets = new ArrayList<Pocket>();
		cushions = new ArrayList<Cushion>();

		this.setGravity(new Vector2(0, 0));
		this.getSettings().setSleepAngularVelocity(Double.MAX_VALUE);
		this.getSettings().setRestitutionVelocity(0);
	}



	public void addBall(PoolBall ball) {
		currentBalls.add(ball);
		this.addBody(ball);
	}

	public void addPocket(Pocket pocket) {
		pockets.add(pocket);
		this.addBody(pocket);
	}

	public void addCushion(Cushion cushion) {
		cushions.add(cushion);
		this.addBody(cushion);
	}



	public ArrayList<Pocket> getPockets() {
		return pockets;
	}

	public ArrayList<Cushion> getCushions() {
		return cushions;
	}

	public ArrayList<PoolBall> getBalls() {
		return currentBalls;
	}
}