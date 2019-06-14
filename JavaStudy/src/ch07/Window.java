package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
		
		// TODO 색상 바꾸기
		JButton btn = new JButton();
		btn.setText("버튼!");
		btn.setBackground(Color.RED);

		frame.add(btn);
		
		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
}
