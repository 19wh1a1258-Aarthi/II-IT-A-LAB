import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
class MyFrame extends Frame implements ActionListener
{
	Button b1,b2,b3;
	TextField tf;
	MyFrame()
	{
	   this.setVisible(true);
		this.setSize(500,500);
        this.setTitle("Login page");
		this.setLayout(new FlowLayout());
		
        b1=new Button("RED");
        b2=new Button("GREEN");
		b3=new Button("BLUE");
		b1.setBackground(Color.RED);
		b2.setBackground(Color.GREEN);
		b3.setBackground(Color.YELLOW);
		tf=new TextField();
		tf.setBounds(60,250,270,80);
        this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(tf);
	

		b1.addActionListener(this);
        b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		this.addWindowListener(new WindowAdapter()
		{
public void windowClosing(WindowEvent we)
	{
	System.out.println("Window is closing");
	System.exit(0);

    }

 } 
			
		);
		
	}

public void actionPerformed(ActionEvent ae)
		{
String button_label=ae.getActionCommand();
if(button_label.equals("RED"))
			{
tf.setText("stop");
tf.setForeground(Color.RED);
}
if(button_label.equals("GREEN"))
			{
tf.setText("go");
tf.setForeground(Color.GREEN);
}
if(button_label.equals("BLUE"))
			{
tf.setText("ready");
tf.setForeground(Color.BLUE);
}
}

		
	}

 

    class ColorFrame
	{
    
public static void main(String[] args) 
	{
		
		MyFrame d=new MyFrame();

		
	}
}