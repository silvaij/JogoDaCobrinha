package br.com.softblue.snake.core;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonGameOver extends JFrame {
	
	public static void createButton(){	
		
		JFrame frame = new JFrame("Restart");
	    JButton btn  = new JButton("RESTART");	
	    btn.setBounds(60,100,90,30);
	    btn.setFocusable(false);
		frame.setSize(250,100);
        frame.setLayout(new GridBagLayout());
        frame.add(btn, new GridBagConstraints());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        onClick(btn,frame);
        
  }
	
  public static void onClick(JButton btn , JFrame frame) {
	  
	  btn.addActionListener(new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {		
			new Game().start();
			frame.setVisible(false);
		}
	});
  }		
}
