package org.pingPong.main;

import javax.swing.JFrame;

import org.pingPong.view.MainWindow;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Test");
		MainWindow mainWindow = new MainWindow();
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
	}

}
