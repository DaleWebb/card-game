package test;

import model.*;
import games.*;

class GameTest {

	public static Engine engine;
	public static Game snap;
	public static Player playerOne, playerTwo;
	
    static void setUp() {
    	engine = new Engine(snap, playerOne);
    	playerOne = new NormalPlayer("Dale", playerTwo);
    	playerTwo = new NormalPlayer("Alex", playerOne);
    	snap = new Snap();
    }

    static void tearDown() {
    	engine = null;
    	playerOne = null;
    	playerTwo = null;
    	snap = null;
    }

    public static void main() {
		setUp();
		assertEquals(2, engine.getNumberOfPlayers());
		assertEquals(playerOne, engine.getCurrentPlayer());
		assertEquals(playerTwo, engine.getNextPlayer());
		assertTrue(playerOne.isActive());
		assertTrue(playerTwo.isActive());
		engine.changePlayer();
		assertEquals(playerTwo, engine.getCurrentPlayer());
		assertEquals(playerOne, engine.getNextPlayer());
		tearDown();
    }
    
    static void assertEquals(Object o, Object p) {
    	System.out.println(o==p);
    }
    
    static void assertTrue(boolean b) {
    	System.out.println(b);
    }
    
    static void assertEquals(int a, int b) {
    	System.out.println(a==b);
    }
}

