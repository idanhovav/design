/*
	Range of Turtle angle is -90 to 90.
	Range of dx of graph is -infinite to infinite.
	0 of angle == 0 of dx.
	We need some function that approaches 90 as x
	approaches infinite, -90 as x approaches -infinite
	and == 0 when x = 0.


*/

public class tee{
	public static void main(String[] args){
		Turtle yertle = new Turtle(0.4, 0.4, 0.0);
		yertle.drawDesign(0.035, 20);
		yertle.locate(0.4, 0.46);
		yertle.drawDesign(0.025, 12);
		arc();
		flippedArc();

	}
	public static void flippedArc(){
		Turtle yertle = new Turtle(0.01, 0.5, 0.0);
		for(int i = 0; i < 138; i++){
			yertle.turn(yertle.toAngle(150.0*(-0.45 + yertle.x)));
			yertle.goForward(0.01);
		}
		yertle = new Turtle(0.01, 0.5, 0.0);
		for(int i = 0; i < 109; i++){
			yertle.turn(yertle.toAngle(100.0*(-0.4 + yertle.x)));
			yertle.goForward(0.01);
		}
	}
	public static void arc(){
		Turtle yertle = new Turtle(0.01, 0.5, 0.0);
		for(int i = 0; i < 138; i++){
			yertle.turn(yertle.toAngle(-150.0*(-0.45 + yertle.x)));
			yertle.goForward(0.01);
		}
		yertle = new Turtle(0.01, 0.5, 0.0);
		for(int i = 0; i < 109; i++){
			yertle.turn(yertle.toAngle(-100.0*(-0.4 + yertle.x)));
			yertle.goForward(0.01);
		}
	}
	public static void log(){
		Turtle yertle = new Turtle(0.01, 0.01, 0.01);
		double golden = (1.61803398875)*2.5;
		double len = 0.98;
		yertle.goForward(len);
		yertle.turnLeft(90);
		yertle.goForward(len/golden);
		yertle.turnLeft(90);
		yertle.goForward(len);
		yertle.turnLeft(90);
		yertle.goForward(len/golden);
		yertle.turnLeft(90);
	}
	public static void longTri(){
		Turtle yertle = new Turtle(0.01,0.01, 0.0);
		double x = 0.56;
		yertle.goForward(x);
		yertle.turnLeft(90.0);
		yertle.goForward(x * Math.sqrt(3));
		yertle.turnLeft(150.0);
		yertle.goForward(2*x);
		yertle.turnLeft(120.0);
		yertle.goForward(0.02);
	}
	public static void longTriOpp(){
		Turtle yertle = new Turtle(0.99,0.01, 180.0);
		double x = 0.56;
		yertle.goForward(x);
		yertle.turnRight(90.0);
		yertle.goForward(x * Math.sqrt(3));
		yertle.turnRight(150.0);
		yertle.goForward(2*x);
		yertle.turnRight(120.0);
		yertle.goForward(0.02);
	}
	public static void shapes(){
		Turtle yertle = new Turtle(0.4, 0.9, 0.0);
		for(int i = 0; i < 5; i++){
			yertle.drawDesign(0.05, 5+i);
			yertle.move(0, (-0.1+(-0.02*i)));
		}
	}
	public static void tris(){
		Turtle yertle = new Turtle(0.01, 0.01, 0.0);
		double dist = 0.055;
		double len = 0.05;
		for(int i = 1; i < 8; i++){
			yertle.drawDesign(len*i, 3);
			yertle.move(dist*i*Math.cos(Math.PI/3),
				dist*i*Math.sin(Math.PI/3));
		}
	}
	public static void flower(){
		Turtle yertle = new Turtle(0.5,0.5, 0.0);
		int n = 8;
		double size = 0.2;
		for(int i = 0; i < n; i++){
			yertle.drawDesign(size, n);
			yertle.turnLeft(360.0/(double) n);
		}
	}
	public static void corners(){
		Turtle yertle = new Turtle(0.01, 0.01, 0.0);
		double dist = 0.08;
		double len = 0.05;
		for(int i = 1; i < 4; i++){
			yertle.drawDesign(len * (double) i, 2 + i);
			yertle.move(dist * (double) i, dist * (double) i);
		}
		yertle.locate(0.01, 0.99 - len);
		for(int i = 1; i < 4; i++){
			yertle.drawDesign(len * (double) i, 2 + i);
			yertle.move(dist * (double) i, -(dist * (double) i));
		}
		yertle.turn(180.0);
		yertle.locate(0.99 - len, 0.01);
		for(int i = 1; i < 4; i++){
			yertle.drawDesignOpp(len * (double) i, 2 + i);
			yertle.move(-(dist * (double) i), 0.08 * (double) i);
		}
		yertle.locate(0.99 - len, 0.99 - len);
		for(int i = 1; i < 4; i++){
			yertle.drawDesignOpp(len * (double) i, 2 + i);
			yertle.move(-(dist * (double) i), -(dist * (double) i));
		}
	}
	public static void octo(){
		Turtle yertle = new Turtle(0.01,0.01,0.0);
		int n = 8;
		double size = 0.1;
		yertle.locate(0.1,0.1);
		yertle.drawDesign(size, n);
		yertle.locate(0.4, 0.1);
		yertle.drawDesign(size, n);
		yertle.locate(0.7, 0.1);
		yertle.drawDesign(size, n);
		yertle.locate(0.7, 0.4);
		yertle.drawDesign(size, n);
		yertle.locate(0.7, 0.7);
		yertle.drawDesign(size, n);
		yertle.locate(0.4, 0.7);
		yertle.drawDesign(size, n);
		yertle.locate(0.1, 0.7);
		yertle.drawDesign(size, n);
		yertle.locate(0.1, 0.4);
		yertle.drawDesign(size, n);
		yertle.locate(0.4, 0.4);
		yertle.drawDesign(size, n);

	}
}