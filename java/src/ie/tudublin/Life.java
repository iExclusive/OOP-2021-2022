package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

	
	boolean [][] board;

	public void settings() {
<<<<<<< HEAD
		size(500, 500);
		board = new LifeBoard(100, this);
		
=======
		size(1000, 1000);
		board = new LifeBoard(200, this);
		board.randomise();
		println(board.countCellsAround(1, 1));

>>>>>>> dc357a64c821c14298f45d4d5842a46225bfadd3
	}

	public void setup() {
		colorMode(RGB);

	}
	
	public void draw() {
		board.render();
<<<<<<< HEAD

=======
		board.update();
>>>>>>> dc357a64c821c14298f45d4d5842a46225bfadd3
	}
}
