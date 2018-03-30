package com.crmindz.bcjMay2017.tsunamialerts.service;

import java.util.HashMap;
import java.util.Map;

public class AlertMessages {
private static Map<String,String> sm = new HashMap<String,String>();

public static Map<String, String> getSm() {
	return sm;
}

public static void setSm(Map<String, String> sm) {
	AlertMessages.sm = sm;
}

public static void addMessage(String key,String message){
	sm.put(key, message);
}
public static boolean isMessagePresent(String key){
	return sm.containsKey(key);
}
}
