package music_game_1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DynamicBeat extends JFrame {
	
	public DynamicBeat() {
		setTitle("tycoon");
		setSize(Main.SCREEN_HEIGHT,Main.SCREEN_WIDTH);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel = new JPanel(null);
		JLabel label = new JLabel("농장설명 들어갈 곳 ");
		label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 10));
		label.setForeground(Color.red);											// cgv 글자를 red로 바꿔줌
		
		label.setBounds(160,60,200,80);											// widget들 절대좌표 지정해줌
		panel.add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);				 // 크기 조절 불가
		add(panel);
		
		
		
	}

}
