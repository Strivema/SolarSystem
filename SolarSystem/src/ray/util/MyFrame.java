package ray.util;

import java.awt.event.*;

import javax.swing.JFrame;

import java.awt.*;
public class MyFrame extends JFrame{
	public void launchFrame(){
		setTitle("SolarSystem");
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		setLocation(100, 100);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//new PaintThread().start();  //启动重画线程
	/*	addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		*/
		while(true){
			repaint();
			try {
				Thread.sleep(100); //1s = 1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   
		}
	}
	
}
