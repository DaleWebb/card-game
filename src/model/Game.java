package model;

import java.util.*;

public class Game {
	
	private final int MIN_NUM_OF_PLAYERS, MAX_NUM_OF_PLAYERS, NUM_OF_CARDS_PER_PLAYER, NUM_OF_ROUNDS;
	private final int gameType;
	private final String gameName;
	private final String gameDesc;
	private ArrayList<Rule> rules;
	private Rule winningCondition;
		
	public Game(int gameType, int minPlayers, int maxPlayers, int numOfPlayerCards, int numOfRounds) throws Exception {
		this.gameType = gameType;
		this.gameName = GameType.getName(gameType);
		this.gameDesc = GameType.getDesc(gameType);
		this.MIN_NUM_OF_PLAYERS = minPlayers;
		this.MAX_NUM_OF_PLAYERS = maxPlayers;
		this.NUM_OF_CARDS_PER_PLAYER = numOfPlayerCards;
		this.NUM_OF_ROUNDS = numOfRounds;
	}
	
	public String getName() {
		return gameName;
	}
	
	public String getDesc() {
		return gameDesc;
	}
	
	public void addRule(Rule r) {
		rules.add(r);
	}
	
	public ArrayList<Rule> getRules() {
		return rules;
	}
	
	public Rule getRule(int i) {
		return rules.get(i);
	}
	
	public String getGameType() throws Exception {
		return GameType.getName(gameType);
	}
	
	public void setWinningCondition(Rule winningCondition) {
		this.winningCondition = winningCondition;
	}
	
	public Rule getWinningCondition() {
		return winningCondition;
	}
	
	public int getNumberOfRounds() {
		return NUM_OF_ROUNDS;
	}
	
	public int getCardsPerPlayer() {
		return NUM_OF_CARDS_PER_PLAYER;
	}
	@Override
	public String toString() {
		return gameName+": "+gameDesc;
	}
	
}
