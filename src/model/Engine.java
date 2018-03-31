package model;

public class Engine {
	
	private Pack dealer;
	private Player currentPlayer, firstPlayer;
	private int currentRound;
	private Game game;
	
	public Engine(Game game, Player first) {
		this.game = game;
		this.dealer = new Pack();
		this.currentPlayer = first;
		this.firstPlayer = first;
		this.currentRound = Round.SETUP;
	}
	
	public int getNumberOfPlayers() {
		return Player.NUM;
	}
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	public Player getNextPlayer() {
		return currentPlayer.getNext();
	}
	
	public void changePlayer() {
		currentPlayer = currentPlayer.getNext();
		if(!currentPlayer.isActive()) {
			changePlayer();
		}
	}
	
	public void deal(int num) {
		Player p = firstPlayer;
		while(p.getNumberOfCards()<num&&p.getNext()==firstPlayer) {
			dealer.getCardSet().get(0);
			p = p.getNext();
		}
	}
	
	public void setup(int num) {
		CardSet pack = new CardSet(52);
		dealer.setCards(pack);
		pack.shuffle();
		deal(num);
	}
	
	public void play() throws Exception {
		setup(game.getCardsPerPlayer());
		while(!isGameOver()) {
			
		}
		throw new Exception(currentPlayer+" has won the game!");
	}
	
	public boolean testRules() {
		boolean pass = true;
		for(Rule r : game.getRules()) {
			if(r.isEnabled()) {
				pass=pass&&r.testRule();
			}
		}
		return pass;
	}
	
	public boolean isGameOver() {
		return game.getWinningCondition().testRule();
	}
	
	public int getRound() {
		return currentRound;
	}
	
	public void nextRound() throws Exception {
		if(hasNextRound()) {
			currentRound++;
			return;
		}
		throw new Exception("Out of rounds");
	}
	
	public boolean hasNextRound() {
		 return currentRound+1<game.getNumberOfRounds();
	}
	
	@Override
	public String toString() {
		return game.getName()+"\n Round "+currentRound+"\n"+currentPlayer.getName()+"'s turn.";
	}

}
