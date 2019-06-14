import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GuiIntro extends JFrame implements MouseListener, ActionListener
{
	 JLabel title, ques;
	 JButton yes, exit;
	 JPanel panel;
	
	public GuiIntro()
	{
		super("Fool Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 700);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		
		title = new JLabel("Fool Game");
		title.setBounds(175,100,200,50);
		panel.add(title);
		
		ques = new JLabel("Are you a Fool?");
		ques.setBounds(175,100,200,200);
		panel.add(ques);
		
		
		yes = new JButton("Yes");
		yes.setBounds(100, 300, 100, 50);
		yes.setBackground(Color.GREEN);
		yes.addMouseListener(this);
		yes.addActionListener(this);
		panel.add(yes);
		
		exit = new JButton("No");
		exit.setBounds(250, 300, 100, 50);
		exit.setBackground(Color.RED);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
		
		this.add(panel);
	}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource().equals(exit))
		{
			Random p = new Random();
		    Random q = new Random();
			int x,y;
			x= p.nextInt(400);
			y= q.nextInt(600);
			exit.setBounds(x,y,100,50);
		}
		else{}
	}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		if(elementText.equals(yes.getText()))
		{
			Home h = new Home(this);
			h.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(exit.getText()))
		{
			Hoem h = new Hoem(this);
			h.setVisible(true);
			this.setVisible(false);
		}
		else{}
	}	
}