package Reiterhof;

import java.util.HashMap;
import java.util.Map;

public class Paar {
	private HashMap<Reiterin, Pferd> map;
	private int matches;
	
	/**
	 * Konstruktor eines Paars
	 */
	public Paar () {
		map = new HashMap<>();
		matches = 0;
	}

	/**
	 * Getter für die map
	 * @return HashMap<Reiterin, Pferd>
	 */
	public HashMap<Reiterin, Pferd> getMap() {
		return map;
	}

	/**
	 * Setter für die map
	 * @param HashMap<Reiterin, Pferd> map
	 */
	public void setMap(HashMap<Reiterin, Pferd> map) {
		this.map = map;
	}
	
	/**
	 * Getter für die matches
	 * @return int matches
	 */
	public int getMatches() {
		return matches;
	}

	/**
	 * Setter für die matches
	 * @param int matches
	 */
	public void setMatches(int matches) {
		this.matches = matches;
	}
	
	/**
	 * erhöht die anzahl der matches um 1
	 */
	public void increaseMatch() {
		matches++;
	}
	
	/**
	 * Gibt ein Paar und die Anzahl der erfüllten Wünsche + Matches aus
	 */
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
