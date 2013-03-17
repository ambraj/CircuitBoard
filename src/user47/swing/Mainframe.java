package user47.swing;

import java.awt.PopupMenu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Mainframe extends JFrame
{
	private static final long serialVersionUID = 1L;

	public Mainframe()
	{
		setLayout(null);
		setTitle("Swing Application");
		setBounds(0, 0, 1000, 800);
		
		ImageIcon icon = new ImageIcon("./images/java.jpg");
		JButton btn = new JButton(icon);
		btn.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		add(btn);
		
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem saveAs = new JMenuItem("Save As"); 
		
		file.add(new JMenuItem("new"));
		file.add(new JMenuItem("Open"));
		file.add(saveAs);
		file.add(new JMenuItem("Close"));
		
		saveAs.add(new PopupMenu("Hi"));
		saveAs.add(new PopupMenu("Bye"));
		
		mb.add(file);
		setJMenuBar(mb);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}