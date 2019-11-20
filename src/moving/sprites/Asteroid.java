package moving.sprites;

public class Asteroid extends Sprite {

	public Asteroid(int x, int y)
	{
		super(x,y);
		
		initAsteroid();
	}
	
	public void initAsteroid()
	{
		loadImage("src/rsrc/death-star.png");
		resizeImage(30, 30);
		getImageDimensions();
	}
}
