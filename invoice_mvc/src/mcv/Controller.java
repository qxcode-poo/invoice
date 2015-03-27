package mcv;

import invoice.Invoice;
import invoice.InvoiceFormatter;
import invoice.LineItem;
import invoice.SimpleFormatter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller {
	private View view;
	private final Invoice invoice;
	private final InvoiceFormatter formatter;
	private BD bd;
	
	public Controller(){
		view = new View();
		invoice = new Invoice();
		formatter = new SimpleFormatter();
		bd = new BD();
		
		invoice.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event)
			{
				view.textArea.setText(invoice.format(formatter));
			}
		});

		view.addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LineItem item = (LineItem) view.combo.getSelectedItem();
				invoice.addItem(item);
			}
		});
		
		ArrayList<LineItem> itens = bd.loadBD();
		for(LineItem item : itens)
			view.combo.addItem(item);
	}
}
