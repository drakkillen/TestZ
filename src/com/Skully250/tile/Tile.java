package com.Skully250.tile;

import com.Skully250.graphics.Screen;
import com.Skully250.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new TileGrass(Sprite.grass);
	public static Tile voidTile = new VoidTile(Sprite.VoidSprite);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		
	}
	
	public boolean solid() {
		return false;
	}
	
}
