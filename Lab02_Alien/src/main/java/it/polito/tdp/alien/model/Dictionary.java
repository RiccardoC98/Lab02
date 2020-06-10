package it.polito.tdp.alien.model;
import java.util.*;
import it.polito.tdp.alien.model.Traduzioni;

public class Dictionary {
	HashMap<String, Traduzioni> dict = new HashMap<String,Traduzioni>() ;
	
	public Dictionary() {
	
	}
	
	public String translate(String input) {
		Boolean space = false;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				return "Testo inserito non valido\n";
			} else if (input.charAt(i) == ' ') {
				space = true;
			}
		}

	    if (!space) {
	   		try {
	   			return dict.get(input.toLowerCase()).getAll();
	   		} catch (NullPointerException npe) {
	   			return "Parola non presente\n";
	   		}	    	
	   	} else {
	   		String split[] = input.toLowerCase().split(" ");
    		Traduzioni t = dict.get(split[0]);
    		if (t == null) {
    			t = new Traduzioni();
    		}
    		t.aggiungi(split[1]);
    		dict.put(split[0], t);
    		return "Parola aggiunta\n";
	    }
	}
	
}
