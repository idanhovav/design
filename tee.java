public class tee{
	public static void main(String[] args){
		tris();
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