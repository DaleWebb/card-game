package model;

public class Player {
	
	private String name;
	private int type;
	private Player next;
	private CardSet cards;
	private int points;
	private boolean active;
	public static int NUM = 0;
	
	public Player() {
		setName("Player "+NUM++);
		setType(Types.NORMAL);
	}
	
	public Player(String n, int playerType, Player next) {
		setName(n);
		setType(playerType);
		setNext(next);
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCards(CardSet c) {
		cards = c;
	}
	
	public CardSet getCardSet() {
		return cards;
	}
	
	public int getNumberOfCards() {
		return cards.size();
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getPoints() {
		return points;
	}
	
	public Card giveCard(int suit, int number) {
		return cards.getCard(suit, number);
	}
	
	public void takeCard(Card c) {
		cards.putCard(c);
	}
	
	public Player getNext() {
		return next;
	}
	
	public void setNext(Player next) {
		this.next = next;
	}
	
	public boolean hasNext() {
		return next!=null;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object p) {
		return name.equals(((Player)p).getName());
	}
	
	@Override
	public String toString() {
		try {
			return getName()+" - "+Types.getName(type)+" | Points:"+points;
		} catch(Exception e) {
			return "null";
		}
	}
}
