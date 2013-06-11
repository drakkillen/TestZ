package rltest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import rltest.screens.Screen;
import rltest.screens.StartScreen;
import asciiPanel.AsciiPanel;

public class ApplicationMain extends JFrame implements KeyListener {

	private AsciiPanel terminal;
	private Screen screen;

	public ApplicationMain() {
		super();
		terminal = new AsciiPanel();
		terminal.write("Welcome", 1, 1);
		add(terminal);
		pack();
		screen = new StartScreen();
		addKeyListener(this);
		repaint();
	}
	
	public void repaint() {
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}
	
	public void keyPressed(KeyEvent e) {
		screen = screen.respondToUserInput(e);
		repaint();
	}
	
	public void keyReleased(KeyEvent e) { 
		
	}
	
	public void keyTyped(KeyEvent e) { 
		
	}

	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
