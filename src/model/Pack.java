package model;

public class Pack extends Player {
	
	public Pack() {
		this("Pile", new CardSet(52));
	}
	
	public Pack(String name, CardSet cards) {
		super(name, Types.PACK, null);
		setCards(cards);
	}
}
