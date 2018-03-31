package games;

public class Snap extends Game {
	
	public Snap() throws Exception {
		super(GameType.SNAP, 2, 2, Const.PACK_SIZE, 2);
		
		/**addRule(new Rule("Each Player must have the same amount of cards each", true, this) {
			public boolean testRule() {
				return game.get
			}
		});*/
	}
	
}
