package milleborne.client;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.*;
import java.awt.GridBagConstraints; 

public class StartPanel {
	
	private JPanel			_Panel			= new JPanel(new GridBagLayout());
	private JTextField		_Username 		= new JTextField("----");
	private JTextField		_ServerIP 		= new JTextField("----");
	private JButton 		_Button			= new JButton("Connect");
	private JLabel			_ErrorMsg		= new JLabel(" ");
	
	public JPanel			getPanel() 		{ return _Panel; }
	public String 			getUsername() 	{ return _Username.getText(); }
	public String 			getServerIP() 	{ return _ServerIP.getText(); }
	public JButton			getButton()		{ return _Button; }
	public JLabel			getErrorMsg()	{ return _ErrorMsg; }
	
	public StartPanel() {
				
		GridBagConstraints c = new GridBagConstraints();
				
		JLabel 	label = new JLabel("Mille Bornes");
		label.setFont(label.getFont().deriveFont(50.0f));
		c.ipady = 20;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(-450, 0, 0, 0);
		_Panel.add(label, c);
		
		c.ipady = 20;
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(10, 10, 10, 10);
		_Username.setPreferredSize( new Dimension( 400, 30 ) );

		_Username.setFont(_Username.getFont().deriveFont(50.0f));
		_Panel.add(_Username, c);
		
		c.ipady = 20;
		c.gridx = 0;
		c.gridy = 2;
		_ServerIP.setPreferredSize( new Dimension( 400, 30 ) );
		
		_ServerIP.setFont(_ServerIP.getFont().deriveFont(50.0f));
		_Panel.add(_ServerIP, c);
		
		c.ipady = 20;
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(100, 0, 0, 0);
		_Panel.add(_Button, c);
				
		_ErrorMsg.setForeground(Color.RED);
		c.gridy = 4;
			
		_Panel.add(_ErrorMsg, c);
		
		_Panel.setVisible(true);	
	}
}
