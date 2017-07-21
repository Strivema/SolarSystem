package ray.solar;

import java.awt.Graphics;
import java.awt.Image;

import ray.util.Constant;
import ray.util.GameUtil;
import ray.util.MyFrame;

public class SolarFrame extends MyFrame{
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Star sun = new Star("images/sun.jpg", 
			Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	
	Planet mercury = new Planet("images/Mercury.jpg", 60, 30, 0.2,sun);
	Planet venus = new Planet("images/Venus.jpg", 100, 50, 0.18,sun);
	Planet earth = new Planet("images/Earth.jpg", 150, 100, 0.15,sun);
	
	Planet mars = new Planet("images/Mars.jpg", 180, 120, 0.13,sun);
	Planet jupiter = new Planet("images/Jupiter.jpg", 210, 140, 0.11,sun);
	Planet saturn = new Planet("images/Saturn.jpg", 270, 180, 0.09,sun);
	Planet uranus = new Planet("images/Uranus.jpg", 300, 200, 0.08,sun);
	Planet neptune = new Planet("images/Neptune.jpg", 320, 220, 0.05,sun);
	
	Planet moon = new Planet("images/moon.jpg", 30, 20, 0.2,earth,true);
	
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		/*sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
		mercury.draw(g);
		venus.draw(g);
		jupiter.draw(g);
		saturn.draw(g);
		neptune.draw(g);*/
		
		sun.draw(g);
		showPlanet(g, jupiter);
		//showPlanet(g, sun);
		showPlanet(g, earth);
		showPlanet(g, mars);
		showPlanet(g, venus);
		showPlanet(g, saturn);
		showPlanet(g, moon);
		showPlanet(g, mercury);
		showPlanet(g, neptune);
		
		showPlanet(g, uranus);
	}
	public void showPlanet(Graphics g,Planet p){
		p.draw(g);
		
	}
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
