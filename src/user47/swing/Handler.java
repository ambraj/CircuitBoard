package user47.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler implements ActionListener
{
	Mainframe frm = null;
	public Handler(Mainframe frm) 
	{
		this.frm = frm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Run Sequence"))
		{
			boolean flagA = false;
			boolean flagB = false;
			boolean flagC = false;
			boolean flagD = false;
			boolean firstGate = false;
			boolean secondGate = false;
			boolean thirdGate = false;
			
			String outputText = null;
			String comboBoxValue1 = null;
			String comboBoxValue2 = null;
			String comboBoxValue3 = null;
			
			String textA = this.frm.inputField1.getText();
			String textB = this.frm.inputField2.getText();
			String textC = this.frm.inputField3.getText();
			String textD = this.frm.inputField4.getText();
			
			
			if((textA!=null && textA.equals("")) && (textB!=null && textB.equals(""))
					&& (textC!=null && textC.equals("")) && (textD!=null && textD.equals("")))
			{
				System.out.println(" blank field ");
				return;
			}
			
			if(textA.equals("0"))
				flagA = false;
			else
				flagA = true;
			
			if(textB.equals("0"))
				flagB = false;
			else
				flagB = true;
			
			if(textC.equals("0"))
				flagC = false;
			else
				flagC = true;
			
			if(textD.equals("0"))
				flagD = false;
			else
				flagD = true;
			
			comboBoxValue1 = (String) this.frm.comboBox1.getSelectedItem();
			comboBoxValue2 = (String) this.frm.comboBox2.getSelectedItem();
			comboBoxValue3 = (String) this.frm.comboBox3.getSelectedItem();
			
//			System.out.println("hello "+comboBoxValue1+"\n"+comboBoxValue2+"\n"+comboBoxValue3);
			
	/////////////////////for first gate
			if(comboBoxValue1.equalsIgnoreCase("AND"))
				firstGate = getANDGate(flagA, flagB);
			else if(comboBoxValue1.equalsIgnoreCase("NAND"))
				firstGate = getNANDGate(flagA, flagB);
			else if(comboBoxValue1.equalsIgnoreCase("OR"))
				firstGate = getORGate(flagA, flagB);
			else
				firstGate = getNORGate(flagA, flagB);
			
	/////////////// apply NOT gate
			firstGate = !firstGate;
				
			
	////////////////for second gate
			if(comboBoxValue2.equalsIgnoreCase("AND"))
				secondGate = getANDGate(flagC, flagD);
			else if(comboBoxValue2.equalsIgnoreCase("NAND"))
				secondGate = getNANDGate(flagC, flagD);
			else if(comboBoxValue2.equalsIgnoreCase("OR"))
				secondGate = getORGate(flagC, flagD);
			else
				secondGate = getNORGate(flagC, flagD);			
			
			
	////////////////for third gate
			if(comboBoxValue3.equalsIgnoreCase("AND"))
				thirdGate = getANDGate(firstGate, secondGate);
			else if(comboBoxValue3.equalsIgnoreCase("NAND"))
				thirdGate = getNANDGate(firstGate, secondGate);
			else if(comboBoxValue3.equalsIgnoreCase("OR"))
				thirdGate = getORGate(firstGate, secondGate);
			else
				thirdGate = getNORGate(firstGate, secondGate);			
			
			if(thirdGate == true)
				outputText = "1";
			else
				outputText = "0";
			
			this.frm.outputLabel.setText(outputText);

			System.out.println(outputText+"##"+thirdGate);
		}
		
	}
	public boolean getANDGate(boolean b1, boolean b2)
	{
		return b1 & b2;
	}
	public boolean getORGate(boolean b1, boolean b2)
	{
		return b1 | b2;
	}
	public boolean getNANDGate(boolean b1, boolean b2)
	{
		return !(b1 & b2);
	}
	public boolean getNORGate(boolean b1, boolean b2)
	{
		return !(b1 | b2);
	}
	public boolean getNOTGate(boolean b1)
	{
		return !b1;
	}
	
}

