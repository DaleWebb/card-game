package model;

import java.util.*;

public class CardSet extends ArrayList<Card>{

	public CardSet(int i) {
		super(i);
		if(i==52) {
			for(int num=1, suit=1;suit<6;num++) {
				add(new Card(suit, num));
				if(num==13) {
					suit++;
					num=1;
				}
			}
		}
	}
	
	public Card getCard(int suit, int number) {
		return get(indexOf(new Card(suit, number)));
	}
	
	public void putCard(Card c) {
		add(c);
	}
	
	public void shuffle() {
	}
	
	@Override
	public String toString() {
		String cards ="";
		for(Card c : this) {
			cards+=" ,"+c;
		}
		return cards.substring(0, cards.length()-2);
	}
	
}
