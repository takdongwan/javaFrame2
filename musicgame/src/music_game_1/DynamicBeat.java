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
		JLabel label = new JLabel("���弳�� �� �� ");
		label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 10));
		label.setForeground(Color.red);											// cgv ���ڸ� red�� �ٲ���
		
		label.setBounds(160,60,200,80);											// widget�� ������ǥ ��������
		panel.add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);				 // ũ�� ���� �Ұ�
		add(panel);
		
		
		
	}

}
