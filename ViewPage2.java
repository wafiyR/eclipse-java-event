import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPage2 
{
	private String message;
	private JFrame frame;
		//CENTER
		private JPanel panelCenter;
			private JTextArea taMessage;
	public ViewPage2(String message)
	{
		this.message = message;
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
				taMessage.append(message);
			panelCenter.add(taMessage);
		frame.add(panelCenter, BorderLayout.CENTER);
	}
}