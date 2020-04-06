package music_game_11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter{
	
	@Override
	public void keyPressed (KeyEvent e) 
	{
		
		if(MusicGame.game == null) {//현재게임이 진행되지않다면 return;
			return;
			
		}
		if(e.getKeyCode()== KeyEvent.VK_S) {
			
		}
		else if(e.getKeyCode()== KeyEvent.VK_D) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_F) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_SPACE) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_J) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_K) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_L) {
			
		}
	}

	@Override
	public void keyReleased (KeyEvent e) 
	{
		if(MusicGame.game == null) {//현재게임이 진행되지않다면 return;
			return;//ㅋ보드를 누르거나 떄도 어떤 이벤트든 일어나지않음.
			
		}
		if(e.getKeyCode()== KeyEvent.VK_S) {
			
		}
		else if(e.getKeyCode()== KeyEvent.VK_D) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_F) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_SPACE) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_J) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_K) {
			
		}else if(e.getKeyCode()== KeyEvent.VK_L) {
			
		}
	}

}
