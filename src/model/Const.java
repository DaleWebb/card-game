package model;

public class Const {

	public static final int PACK_SIZE = 52;
}

	class Numbers extends Const {
		
		public static final int JOKER = 0;
		public static final int ACE = 1;
		public static final int TWO = 2;
		public static final int THREE = 3;
		public static final int FOUR = 4;
		public static final int FIVE = 5;
		public static final int SIX = 6;
		public static final int SEVEN = 7;
		public static final int EIGHT = 8;
		public static final int NINE = 9;
		public static final int TEN = 10;
		public static final int JACK = 11;
		public static final int QUEEN = 12;
		public static final int KING = 13;
		
		public static String getName(int i) throws Exception {
			switch(i) {
				case JOKER:
					return "Joker";
				case ACE :
					return "Ace";
				case TWO :
					return "Two";
				case THREE :
					return "Three";
				case FOUR :
					return "Four";
				case FIVE :
					return "Five";
				case SIX :
					return "Six";
				case SEVEN :
					return "Seven";
				case EIGHT :
					return "Eight";
				case NINE :
					return "Nine";
				case TEN :
					return "Ten";
				case JACK :
					return "Jack";
				case QUEEN :
					return "Queen";
				case KING :
					return "King";
			 default :
					throw new Exception("This Type does not Exist");
			}
		}
	}
	
	class Suits extends Const {
	
		public static final int JOKER = 0;
		public static final int CLUBS = 1;
		public static final int SPADES = 2;
		public static final int DIAMONDS = 3;
		public static final int HEARTS = 4;
		
		 public static String getName(int i) throws Exception {
			switch(i) {
				case JOKER :
					return "Jokers";
				case CLUBS :
					return "Clubs";
				case SPADES :
					return "Spades";
				case DIAMONDS :
					return "Diamonds";
				case HEARTS :
					return "Hearts";
				default :
					throw new Exception("This Type does not Exist");
			}
		}
	}
	
	class Types extends Const {
	 
	 public static final int PACK = 1;
	 public static final int NORMAL = 2;
	 public static final int AI = 3;
	 
	 public static final String[] names = new String[] {"Dale", "Leigh", "Dan", "Jack"};
	 
	 public static String getName(int i) throws Exception {
			switch(i) {
				case PACK :
					return "Pile";
				case NORMAL :
					return "Human";
				case AI :
					return "AI";
				default :
					throw new Exception("This type of opponent does not Exist");
			}
	 }
	}
	
	class GameType extends Const {
		
		public static final int CHASE_THE_ACE = 1;
		public static final int STRIP_JACK_NAKED = 2;
		public static final int RUMMEY = 3;
		public static final int CHEAT = 4;
	 	public static final int SNAP = 5;
	 	public static final int GO_FISH = 6;
	 	
	 	public static String getName(int i) throws Exception {
			switch(i) {
				case CHASE_THE_ACE :
					return "Chase the Ace";
				case STRIP_JACK_NAKED :
					return "Strip Jack Naked";
				case RUMMEY :
					return "Rummey";
			 	case CHEAT :
					return "Cheat";
			 	case SNAP :
					return "Snap";
				case GO_FISH :
					return "Go Fish";
				default :
					throw new Exception("This GameType does not Exist");
			}
	 	}
	 	
	 	public static String getDesc(int i) throws Exception {
	 		switch(i) {
	 			case CHASE_THE_ACE :
					return "Chase the Ace";
				case STRIP_JACK_NAKED :
					return "Strip Jack Naked";
				case RUMMEY :
					return "Rummey";
			 	case CHEAT :
					return "Cheat";
			 	case SNAP :
					return "Snap";
				case GO_FISH :
					return "Go Fish";
				default :
					throw new Exception("This GameType does not Exist");
	 		}
		}
	}
	
	class Round extends Const {
		
		public static final int SETUP = 0;
		public static final int PUT_CARD = 1;
		public static final int TAKE_CARD = 2;
	}
