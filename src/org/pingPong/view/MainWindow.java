package org.pingPong.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import org.pingPong.enums.Key;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 400;

	// JPanel panel;
	// Circle circle;

	Board board;

	public MainWindow() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		// panel = new JPanel();
		// panel.setBackground(Color.BLACK);
		// add(panel);

		// circle = new Circle();
		// circle.setOpaque(true);
		// add(circle);

		board = new Board();
		add(board);
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == 38) {// UP
//					System.out.println(e);
					board.keyPressed(Key.UP);
				} else if (e.getKeyCode() == 40) {// Down
//					System.out.println(e);
					board.keyPressed(Key.DOWN);
				} else if (e.getKeyCode() == 87) {// W
//					System.out.println(e);
					board.keyPressed(Key.W);
				} else if (e.getKeyCode() == 83) {// S
//					System.out.println(e);
					board.keyPressed(Key.S);
				}else if (e.getKeyCode() == 32) {// S
					board.keyPressed(Key.SPACE);
				}
				
			}
		});

	}

}
