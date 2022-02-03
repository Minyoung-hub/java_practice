package ch05.ex05.home02;

public class BallMachine {
	public Ball pull() {
		Ball ball = new Ball();
		ball.setBall((int)(Math.random()*45)+1);
		return ball;
	}
}