import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ViewPage1 implements ActionListener, KeyListener
{
	private JFrame frame;
		//CENTER
		private JPanel panelCenter;
			private JTextArea taMessage;
			
		
		//SOUTH
		private JPanel panel;
			private JTextField txtMessage;
			private JButton btnSave;
			private JButton btnCancel;
	public ViewPage1()
	{
		init();
		frame.setVisible(true);
	}
	public void init()
	{
		frame = new JFrame();
		frame.setSize(500,400);
			//CENTER
			panelCenter = new JPanel();
				taMessage = new JTextArea(20,30);
			panelCenter.add(taMessage);
		frame.add(panelCenter, BorderLayout.CENTER);
			//SOUTH
			panel = new JPanel();
				txtMessage = new JTextField(20);
				txtMessage.addKeyListener(this);
				btnSave = new JButton("Save");
				btnSave.addActionListener(this);
				btnCancel = new JButton("Next");
				btnCancel.addActionListener(this);
			panel.add(txtMessage);
			panel.add(btnSave);
			panel.add(btnCancel);
		frame.add(panel, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="Save")
		{
			System.out.println("Hai");
			String message = txtMessage.getText();
			taMessage.append(message+"\n");
			txtMessage.setText("");
		}
		else
		{
			new ViewPage2(txtMessage.getText());
			frame.dispose();
		}
	}
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			String message = txtMessage.getText();
			taMessage.append(message+"\n");
			txtMessage.setText("");
		}
	}
	public void keyReleased(KeyEvent e)
	{}
	public void keyTyped(KeyEvent e)
	{}

}