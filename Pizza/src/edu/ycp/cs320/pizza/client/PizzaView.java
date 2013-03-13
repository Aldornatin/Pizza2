package edu.ycp.cs320.pizza.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Button;

public class PizzaView extends Composite {
	public PizzaView() {
		
		Button btnImAwesome = new Button("I'm Awesome");
		initWidget(btnImAwesome);
	}

}
