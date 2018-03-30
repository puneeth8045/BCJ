package com.crmindz.bcjMay2017.tsunamialerts.service;

import java.util.Map;

public class TsunamiAlertService {
    AlertMessages am = new AlertMessages();
	public Map<String,String> processTsunamiData(String country){
		if(country.equalsIgnoreCase("india")){
			am.addMessage("I1", "tsunami alert");
			am.addMessage("I2", "Waterlevel increase");
		}
		else if(country.equalsIgnoreCase("usa")){
			am.addMessage("USA1", "Land alert");
			am.addMessage("USA2", "Wind Alert");
			
		}
		else if(country.equalsIgnoreCase("uk")){
			am.addMessage("UK1", "No threat");
			am.addMessage("UK2", "land alert");
		}
		return am.getSm();
		
	}

	
		
	}


