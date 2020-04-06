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
		JLabel label = new JLabel("농장설명 들어갈 곳 ");
		label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 10));
		label.setForeground(Color.red);											// cgv 글자를 red로 바꿔줌
		
		label.setBounds(160,60,200,80);											// widget들 절대좌표 지정해줌
		panel.add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);				 // 크기 조절 불가
		add(panel);
		
		
		
	}
	
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic= screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,0,0,null);
		
	}


	private void screenDraw(Graphics g) {
		g.drawImage(introBackGround,0,0,null);//0,0 좌표 
		this.repaint();//전체화면 이미지를 매순간마다 그려줌. 
	}

}
