package model;

public abstract class Rule {
	
	private Game game;
	private String rule;
	private boolean enabled;
	
	public Rule(String rule, boolean enabled, Game game) {
		this.rule = rule;
		this.game = game;
		this.enabled = enabled;
	}
	
	public Rule(String rule, Game game) {
		this(rule, true, game);
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public String toString() {
		return "Δ "+rule;
	}
	
	public abstract boolean testRule();
	
}
