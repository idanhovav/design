public class tee{
	public static void main(String[] args){
		Turtle yertle = new Turtle(0.01,0.01,0.0);
		//corners(yertle);
		yertle.move(0.4,0.4);
		int n = 8;
		double size = 0.1;
		yertle.drawDesign(size, n);
		yertle.turnLeft(360.0/(double) n);
	}

	public static void flower(Turtle yertle, int n, double size){
		for(int i = 0; i < n; i++){
			yertle.drawDesign(size, n);
			yertle.turnLeft(360.0/(double) n);
		}
	}
	public static void corners(Turtle yertle){
		for(int i = 1; i < 4; i++){
			yertle.drawDesign(0.05 * (double) i, 2 + i);
			yertle.move(yertle.x + (0.08 * (double) i),
			 	yertle.y + (0.08 * (double) i));
		}
		yertle.move(0.01, 0.94);
		for(int i = 1; i < 4; i++){
			yertle.drawDesign(0.05 * (double) i, 2 + i);
			yertle.move(yertle.x + (0.08 * (double) i),
				(yertle.y - (0.08 * (double) i)));
		}
		yertle.turn(180.0);
		yertle.move(0.94, 0.01);
		for(int i = 1; i < 4; i++){
			yertle.drawDesignOpp(0.05 * (double) i, 2 + i);
			yertle.move(yertle.x - (0.08 * (double) i),
			 	yertle.y + (0.08 * (double) i));
		}
		yertle.move(0.94, 0.94);
		for(int i = 1; i < 4; i++){
			yertle.drawDesignOpp(0.05 * (double) i, 2 + i);
			yertle.move(yertle.x - (0.08 * (double) i),
				(yertle.y - (0.08 * (double) i)));
		}
	}
}