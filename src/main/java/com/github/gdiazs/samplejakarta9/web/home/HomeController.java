package com.github.gdiazs.samplejakarta9.web.home;

import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class HomeController implements Serializable {

	private static final long serialVersionUID = 5797837027641648237L;
	
	private String welcomeMessage;

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

}
