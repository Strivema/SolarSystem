package ray.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import ray.util.GameUtil;

public class Planet extends Star{
	
	double a;
	double b;
	double speed;
	double degree;
	Star center;
	
	boolean satillite;
	
	
	
	
	@Override
	public void draw(Graphics g) {
				//super.draw(g);
		/*g.drawImage(img, (int)x, (int)y,null);*/
		super.draw(g);
		if(!satillite){
			drawTrace(g);
		}
		
 		move();
	}
	public void move(){
		x = (center.x+center.width/2)+a*Math.cos(degree);
		y = (center.y+center.height/2)+b*Math.sin(degree);
		degree +=speed;
	}
	public void drawTrace(Graphics g){
		double ox,oy,owidth,oheight;
		owidth = 2*a;
		oheight = 2*b;
		ox = (center.x+center.width/2)-a;
		oy = (center.y+center.height/2)-b;
		Color color =g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ox, (int)oy, (int)owidth, (int)oheight);
		g.setColor(color);
		
	}
	public Planet(String path,double a, double b, double speed, Star center) {
		//super();
		super(GameUtil.getImage(path));
		this.a = a;
		this.b = b;
		this.speed = speed;
		this.center = center;
		this.x = center.x+a;
		this.y = center.y;
		/*this.img = GameUtil.getImage(path);
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);*/
	}

	public Planet(String path,double a, double b, double speed, Star center, boolean satillite) {
		//	super();
			/*this.a = a;
			this.b = b;
			this.speed = speed;
			this.degree = degree;
			this.center = center;*/
			
			this(path, a, b, speed, center);
			
			this.satillite = satillite;
		}
	public Planet() {
		super();
		
	}

	public Planet(Image img, double x, double y) {
		super(img, x, y);
		
	}

	public Planet(String path, double x, double y) {
		super(path, x, y);
		
	}

}
