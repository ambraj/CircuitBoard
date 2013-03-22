package user47.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
	JLabel labelDev = null;
	JLabel labelLogo = null;
	ImageIcon gateIconAND=null;
	ImageIcon gateIconNAND=null;
	ImageIcon gateIconOR=null;
	ImageIcon gateIconNOR=null;
	ImageIcon gateIconNOT=null;
	ImageIcon lineIconH=null;
	ImageIcon lineIconV=null;
	ImageIcon logoIcon = null;
	JButton btn = null;
	JLabel outputLabel = null;
	JComboBox comboBox1 = null;
	JComboBox comboBox2 = null;
	JComboBox comboBox3 = null;
	
	public Mainframe()
	{
		setLayout(null);
		setBackground(Color.white);
		setTitle("Swing Application");
		setBounds(0, 0, 700, 500);
		
		String []gateList = {"AND","OR","NAND","NOR"};
		
		logoIcon = new ImageIcon("./images/java.jpg");
		gateIconAND = new ImageIcon("./images/and_gate.PNG");
		gateIconNAND = new ImageIcon("./images/nand_gate.PNG");
		gateIconOR = new ImageIcon("./images/or_gate.PNG");
		gateIconNOR = new ImageIcon("./images/nor_gate.PNG");
		gateIconNOT = new ImageIcon("./images/not_gate.PNG");

		
		inputField1 = new JTextField();
		inputField1.setBounds(50, 97, 19, 17);
		add(inputField1);
		inputField1.addKeyListener(new KeyListener() {
			
			public void keyReleased(KeyEvent e) {
				if(!((e.getKeyCode() == 48) || (e.getKeyCode() == 49) ))
					Mainframe.this.inputField1.setText("");				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		inputField2 = new JTextField();
		inputField2.setBounds(50, 135, 19, 17);
		add(inputField2);
		inputField2.addKeyListener(new KeyListener() {
			
			public void keyReleased(KeyEvent e) {
				if(!((e.getKeyCode() == 48) || (e.getKeyCode() == 49) ))
					Mainframe.this.inputField2.setText("");				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		inputField3 = new JTextField();
		inputField3.setBounds(50, 223, 19, 17);
		add(inputField3);
		inputField3.addKeyListener(new KeyListener() {
			
			public void keyReleased(KeyEvent e) {
				if(!((e.getKeyCode() == 48) || (e.getKeyCode() == 49) ))
					Mainframe.this.inputField3.setText("");				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		inputField4 = new JTextField();
		inputField4.setBounds(50, 261, 19, 17);
		add(inputField4);
		inputField4.addKeyListener(new KeyListener() {
			
			public void keyReleased(KeyEvent e) {
				if(!((e.getKeyCode() == 48) || (e.getKeyCode() == 49) ))
					Mainframe.this.inputField4.setText("");				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		labelLogo = new JLabel(logoIcon);
		labelLogo.setBounds(490, 5, 170, 170);
		add(labelLogo);
		 
		label1 = new JLabel(gateIconNAND);
		label1.setBounds(60, 80, 170, 90);
		add(label1); 
		
		comboBox1 = new JComboBox(gateList);
		comboBox1.setSelectedIndex(2);
		comboBox1.setBounds(100, 160, 75, 20);
		add(comboBox1);
		comboBox1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String selectedValue = null;

				JComboBox jc = (JComboBox) arg0.getSource();
				selectedValue = (String)jc.getSelectedItem();
				

				if(selectedValue.equalsIgnoreCase("and"))
					Mainframe.this.label1.setIcon(gateIconAND);
				else if(selectedValue.equalsIgnoreCase("nand"))
					Mainframe.this.label1.setIcon(gateIconNAND);
				else if(selectedValue.equalsIgnoreCase("or"))
					Mainframe.this.label1.setIcon(gateIconOR);
				else if(selectedValue.equalsIgnoreCase("nor"))
					Mainframe.this.label1.setIcon(gateIconNOR);
				
			}
		});
		
		label2 = new JLabel(gateIconOR);
		label2.setBounds(60, 205, 170, 90);
		add(label2);
		
		comboBox2 = new JComboBox(gateList);
		comboBox2.setSelectedIndex(1);
		comboBox2.setBounds(100,290, 75, 20);
		add(comboBox2);
		comboBox2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String selectedValue = null;

				JComboBox jc = (JComboBox) arg0.getSource();
				selectedValue = (String)jc.getSelectedItem();
				

				if(selectedValue.equalsIgnoreCase("and"))
					Mainframe.this.label2.setIcon(gateIconAND);
				else if(selectedValue.equalsIgnoreCase("nand"))
					Mainframe.this.label2.setIcon(gateIconNAND);
				else if(selectedValue.equalsIgnoreCase("or"))
					Mainframe.this.label2.setIcon(gateIconOR);
				else if(selectedValue.equalsIgnoreCase("nor"))
					Mainframe.this.label2.setIcon(gateIconNOR);
				
			}
		});
		
		
		label3 = new JLabel(gateIconNOT);
		label3.setBounds(247, 98, 140, 50);
		add(label3);
		
		label4 = new JLabel(gateIconOR);
		label4.setBounds(359, 187, 170, 90);
		add(label4);
		
		comboBox3 = new JComboBox(gateList);
		comboBox3.setSelectedIndex(1);
		comboBox3.setBounds(400,275, 75, 20);
		add(comboBox3);
		comboBox3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String selectedValue = null;

				JComboBox jc = (JComboBox) arg0.getSource();
				selectedValue = (String)jc.getSelectedItem();
				

				if(selectedValue.equalsIgnoreCase("and"))
					Mainframe.this.label4.setIcon(gateIconAND);
				else if(selectedValue.equalsIgnoreCase("nand"))
					Mainframe.this.label4.setIcon(gateIconNAND);
				else if(selectedValue.equalsIgnoreCase("or"))
					Mainframe.this.label4.setIcon(gateIconOR);
				else if(selectedValue.equalsIgnoreCase("nor"))
					Mainframe.this.label4.setIcon(gateIconNOR);
				
			}
		});
		
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
		
		btn = new JButton("Run Sequence");
		btn.setBounds(200, 350, 150, 50);
		add(btn);
		btn.addActionListener(new Handler(this));
		
		labelDev = new JLabel("Developed By ______");
		labelDev.setBounds(20, 430, 150, 20);
		add(labelDev);
		

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
