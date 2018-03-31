package model;

public class Card {
	
	private int suit;
	private int number;
	
	public Card(int s, int i) {
		setSuit(s);
		setNumber(i);
	}
	
	public void setSuit(int s) {
		suit = s;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public void setNumber(int i) {
		number = i;
	}
	
	public int getNumber() {
		return number;
	}
	
	@Override
	public boolean equals(Object c) {
		return suit == ((Card)c).getSuit() && number == ((Card)c).getNumber();
	}
	
	@Override
	public String toString() {
		try {
			return Numbers.getName(number)+" of "+Suits.getName(suit);
		} catch (Exception e) {
			return "null";
		}
	}
}
