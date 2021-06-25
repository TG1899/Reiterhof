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
	 * Getter f�r die map
	 * @return HashMap<Reiterin, Pferd>
	 */
	public HashMap<Reiterin, Pferd> getMap() {
		return map;
	}

	/**
	 * Setter f�r die map
	 * @param HashMap<Reiterin, Pferd> map
	 */
	public void setMap(HashMap<Reiterin, Pferd> map) {
		this.map = map;
	}
	
	/**
	 * Getter f�r die matches
	 * @return int matches
	 */
	public int getMatches() {
		return matches;
	}

	/**
	 * Setter f�r die matches
	 * @param int matches
	 */
	public void setMatches(int matches) {
		this.matches = matches;
	}
	
	/**
	 * erh�ht die anzahl der matches um 1
	 */
	public void increaseMatch() {
		matches++;
	}
	
	/**
	 * Gibt ein Paar und die Anzahl der erf�llten W�nsche + Matches aus
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
