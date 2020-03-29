package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
		
		Music introMusic = new Music("introMusic.mp3",true);
		introMusic.start();
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
