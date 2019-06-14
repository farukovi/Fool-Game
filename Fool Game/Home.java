import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener
{
	private JLabel l1, imgLabel, l2;
	private JButton back,exit;
	private JPanel panel;
	private GuiIntro g;
	ImageIcon img;

	public Home(GuiIntro g)
	{
		super("Home Page");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.g=g;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		
		l2 = new JLabel("Congratulations!!!");
		l2.setBounds(150,50,200,40);
		panel.add(l2);
		
		l1 = new JLabel("Yes You are fool!");
		l1.setBounds(150,75,200,40);
		panel.add(l1);
		
		img = new ImageIcon("fool.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(100,100,300,300);
		panel.add(imgLabel);
		
		back = new JButton("Play Again");
		back.setBounds(100,350,100,40);
		back.setBackground(Color.GREEN);
		back.addActionListener(this);
		panel.add(back);
		
		exit = new JButton("Quit");
		exit.setBounds(300,350,100,40);
		exit.setBackground(Color.RED);
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		
		if(elementText.equals(back.getText()))
		{
			g.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}