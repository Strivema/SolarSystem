package ray.solar;

import java.awt.Graphics;
import java.awt.Image;

import ray.util.GameUtil;

public class Star {
	Image img;
	double x,y;
	int width,height;
	
	public void draw(Graphics g){
		g.drawImage(img, (int)x, (int)y, null);
	}

	public Star() {
		
	}

	public Star(Image img){
		this.img = img;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	public Star(Image img, double x, double y) {
		//super();
		this(img);
		this.x = x;
		this.y = y;
		
	}
	public Star(String path, double x, double y) {
		//super();
		/*this.img = GameUtil.getImage(path);
		this.x = x;
		this.y = y;*/
		this(GameUtil.getImage(path),x,y);
	}
}
