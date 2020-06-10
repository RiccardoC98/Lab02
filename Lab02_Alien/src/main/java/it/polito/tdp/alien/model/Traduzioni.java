package it.polito.tdp.alien.model;
import java.util.*;

public class Traduzioni {
	ArrayList<String> t;

	public Traduzioni() {
		this.t	= new ArrayList<String>();
	}
	
	public void aggiungi(String x) {
		t.add(x);
	}
	
	public String getAll() {
		String res = "";
		for (int i = 0; i < t.size(); i++) {
			res += t.get(i) + "\n";
		}
		return res;
	}
}
