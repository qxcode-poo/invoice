package mcv;

import invoice.Bundle;
import invoice.DiscountedItem;
import invoice.LineItem;
import invoice.Product;

import java.util.ArrayList;

public class BD {
	ArrayList<LineItem> mostruario;

	public BD(){
		mostruario = new ArrayList<LineItem>();
		
		Product hammer = new Product("Hammer", 19.95);
		Product espada = new Product("Espada Jaspion", 100.00);
		Product ombreira = new Product("Ombreira Jaspion", 200.00);
		Product mascara = new Product("Mascara Jaspion", 300.00);
		Product nails = new Product("Assorted nails", 9.95);
		Product notebook = new Product("Notebook", 300.00);
		Product windows = new Product("Windows", 300.00);
		Bundle pc = new Bundle();
		pc.add(windows);
		pc.add(notebook);

		mostruario.add(pc);

		mostruario.add(hammer);
		mostruario.add(new DiscountedItem(espada, 99));
		mostruario.add(ombreira);
		mostruario.add(mascara);

		Bundle jaspion = new Bundle();
		jaspion.add(espada);

		jaspion.add(mascara);
		jaspion.add(ombreira);
		mostruario.add(new DiscountedItem(jaspion, 50));

		Bundle bundle = new Bundle();
		bundle.add(hammer);
		bundle.add(nails);
		mostruario.add(new DiscountedItem(bundle, 10));
	}

	public ArrayList<LineItem> loadBD(){
		return mostruario;
	}
}
