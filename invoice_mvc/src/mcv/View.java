package mcv;

import invoice.LineItem;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View{
	public final JTextArea textArea;
	public final JComboBox<LineItem> combo;
	public final JButton addButton;

	public View(){
		textArea = new JTextArea(20, 40);
		combo = new JComboBox<LineItem>();
		//combo.setSize(300, 20);
		addButton = new JButton("Add");
		JPanel panel = new JPanel();
		panel.add(combo);
		panel.add(addButton);

		// Add the text area and panel to the frame
		JFrame frame = new JFrame();
		frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
		
		frame.add(panel, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(800, 300);
		frame.setVisible(true);
	}
}
