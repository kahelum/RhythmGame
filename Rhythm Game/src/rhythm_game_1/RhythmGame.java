package rhythm_game_1;

import javax.swing.JFrame;

public class RhythmGame extends JFrame {
	
	public RhythmGame() {
		setTitle("Rhythm Game");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
}
