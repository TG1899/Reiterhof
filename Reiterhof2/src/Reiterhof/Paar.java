package Reiterhof;

import java.util.HashMap;
import java.util.Map;

public class Paar {
	private HashMap<Reiterin, Pferd> map;
	private int matches;
	
	public Paar () {
		map = new HashMap<>();
		matches = 0;
	}

	public HashMap<Reiterin, Pferd> getMap() {
		return map;
	}

	public void setMap(HashMap<Reiterin, Pferd> map) {
		this.map = map;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}
	
	public void increaseMatch() {
		matches++;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Bestes Ergebnis: \n");
		for (Map.Entry<Reiterin, Pferd> paar: map.entrySet()) {
			sb.append(paar.getKey().getName() + " -> " + paar.getValue().getName() + "\n");
		}
		sb.append("Erfuellte Wuensche + Paare: " + matches);
		return sb.toString();
	} 
}
