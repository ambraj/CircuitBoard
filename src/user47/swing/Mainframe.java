package user47.swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Mainframe extends JFrame
{
	JTextField inputField1=null;
	JTextField inputField2=null;
	JTextField inputField3=null;
	JTextField inputField4=null;
	JLabel label = null;
	JLabel label1 = null;
	JLabel label2 = null;
	JLabel label3 = null;
	JLabel label4 = null;
	ImageIcon gateIcon1=null;
	ImageIcon gateIcon2=null;
	ImageIcon gateIcon3=null;
	ImageIcon gateIcon4=null;
	ImageIcon lineIconH=null;
	ImageIcon lineIconV=null;
	JButton btn = null;
	JLabel outputLabel = null;
	
	public Mainframe()
	{
		setLayout(null);
		setBackground(Color.white);
		setTitle("Swing Application");
		setBounds(0, 0, 1000, 700);
		
		
		inputField1 = new JTextField();
		inputField1.setBounds(50, 97, 19, 17);
		add(inputField1);
		
		inputField2 = new JTextField();
		inputField2.setBounds(50, 135, 19, 17);
		add(inputField2);
		
		inputField3 = new JTextField();
		inputField3.setBounds(50, 223, 19, 17);
		add(inputField3);
		
		inputField4 = new JTextField();
		inputField4.setBounds(50, 261, 19, 17);
		add(inputField4);
		
		gateIcon1 = new ImageIcon("./images/nand_gate.PNG");
		label1 = new JLabel(gateIcon1);
		label1.setBounds(60, 80, 170, 90);
		add(label1); 
		
		gateIcon2 = new ImageIcon("./images/or_gate.PNG");
		label2 = new JLabel(gateIcon2);
		label2.setBounds(60, 205, 170, 90);
		add(label2);
		
		gateIcon3 = new ImageIcon("./images/not_gate.PNG");
		label3 = new JLabel(gateIcon3);
		label3.setBounds(247, 98, 140, 50);
		add(label3);
		
		gateIcon4 = new ImageIcon("./images/or_gate.PNG");
		label4 = new JLabel(gateIcon4);
		label4.setBounds(359, 187, 170, 90);
		add(label4);
		
		outputLabel = new JLabel("output");
		outputLabel.setBounds(520, 220, 50, 20);
		add(outputLabel);
		
		lineIconH = new ImageIcon("./images/line_h.png");
		label = new JLabel(lineIconH);
		label.setBounds(323, 205, 170, 20);
		add(label);
		
		lineIconH = new ImageIcon("./images/line_h.png");
		label = new JLabel(lineIconH);
		label.setBounds(140, 115, 170, 20);
		add(label);
		
		lineIconV = new ImageIcon("./images/line_h.png");
		label = new JLabel(lineIconV);
		label.setBounds(140, 240, 170, 20);
		add(label);
		
		lineIconV = new ImageIcon("./images/line_h.png");
		label = new JLabel(lineIconV);
		label.setBounds(235, 240, 170, 20);
		add(label);

		lineIconV = new ImageIcon("./images/line_v.png");
		label = new JLabel(lineIconV);
		label.setBounds(341, 61, 20, 220);
		add(label);
		
		btn = new JButton("Generate");
		btn.setBounds(180, 340, 150, 50);
		add(btn);
		btn.addActionListener(new Handler(this));
		
		
//		JMenuBar mb = new JMenuBar();
//		JMenu file = new JMenu("File");
//		JMenuItem saveAs = new JMenuItem("Save As"); 
//		
//		file.add(new JMenuItem("new"));
//		file.add(new JMenuItem("Open"));
//		file.add(saveAs);
//		file.add(new JMenuItem("Close"));
//		
//		saveAs.add(new PopupMenu("Hi"));
//		saveAs.add(new PopupMenu("Bye"));
//		
//		mb.add(file);
//		setJMenuBar(mb);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}