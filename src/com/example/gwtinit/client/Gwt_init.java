package com.example.gwtinit.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;


public class Gwt_init implements EntryPoint {

	
	public void onModuleLoad() {
		HorizontalPanel hp = new HorizontalPanel();
		Button helloButton = new Button("Say Hello");
		final Label helloLabel = new Label("Waiting to say Hello");
		
		hp.add(helloButton);
		hp.add(helloLabel);
		
		final TextBox inputTB = new TextBox();
		
		hp.add(inputTB);
		
		RootPanel.get("maincontainer").add(hp);
		
		helloButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				helloLabel.setText(inputTB.getText());
				
			}
		});
	}
}
