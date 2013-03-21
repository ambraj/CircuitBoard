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
		if(e.getActionCommand().equals("Generate"))
		{
			boolean flagA = false;
			boolean flagB = false;
			boolean flagC = false;
			boolean flagD = false;
			boolean tempFlag = false;
			String outputText = null;
			
			String textA = this.frm.inputField1.getText();
			String textB = this.frm.inputField2.getText();
			String textC = this.frm.inputField3.getText();
			String textD = this.frm.inputField4.getText();
//			System.out.println(textA+"  "+textB+"  "+textC+"  "+textD);
			
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
			
			tempFlag = getORGate(getNOTGate(getNANDGate(flagA, flagB)), getORGate(flagC, flagD));
			
			if(tempFlag == true)
				outputText = "1";
			else
				outputText = "0";
			
			this.frm.outputLabel.setText(outputText);
			
			
			System.out.println( getORGate(getNOTGate(getNANDGate(flagA, flagB)), getORGate(flagC, flagD)) );
			
			
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






