package test1;
import java.awt.*;
import javax.swing.*;

public class Form1 extends JFrame
{
	JButton submitBt;
	JTextField nameTf, rollnoTf, stateTf;
	JLabel nameLb, rollnoLb,stateLb;
	Form1()
	{
		nameLb=new JLabel("Name");
		rollnoLb=new JLabel("Roll NO:");
		stateLb=new JLabel("State");
		
		nameTf=new JTextField();
		rollnoTf=new JTextField();
		stateTf=new JTextField();
		
		submitBt=new JButton("submit");
		setLayout(new FlowLayout());
		add(nameLb);
		add(nameTf);
		add(rollnoLb);
		add(rollnoTf);
		add(stateLb);
		add(stateTf);
		
		
	}

	public static void main(String args[])
	{
		System.out.println("test print");
		Form1 f1=new Form1();
		f1.setSize(600,400);
		f1.setVisible(true);
	}
}
