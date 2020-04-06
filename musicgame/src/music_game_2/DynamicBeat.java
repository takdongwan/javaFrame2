package music_game_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackGround;
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	
		introBackGround = new ImageIcon(Main.class.getResource("../images/introBackGround.jpg")).getImage();
		
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
	
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic= screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,0,0,null);
		
	}


	private void screenDraw(Graphics g) {
		g.drawImage(introBackGround,0,0,null);//0,0 ��ǥ 
		this.repaint();//��üȭ�� �̹����� �ż������� �׷���. 
	}

}
