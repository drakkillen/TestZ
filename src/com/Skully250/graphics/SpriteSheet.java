package com.Skully250.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	private String path;
	public final int SIZE;
	public int[] pixels;
	
	public static SpriteSheet Over = new SpriteSheet("/textures/Spritesheet.png", 256); 
	
	public SpriteSheet(String path, int size) {
		this.path = path;
		SIZE = size;
		pixels = new int[SIZE*SIZE];
		loadImage();
	}
	
	private void loadImage() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
	
}
