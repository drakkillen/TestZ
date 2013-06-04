package com.Skully250.tile;

import com.Skully250.graphics.Screen;
import com.Skully250.graphics.Sprite;

public class TileGrass extends Tile {

	public TileGrass(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}	
}
