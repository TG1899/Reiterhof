package Reiterhof;

import java.util.ArrayList;

public class Reiterin {
	private String name;
	private int koennen;
	private ArrayList<String> wunschpferde;
	
	/**
	 * Konstruktor einer Reiterin
	 * @param name
	 * @param koennen
	 * @param wunschpferde
	 */
	public Reiterin (String name, int koennen, ArrayList<String> wunschpferde) {
		this.name=name;
		this.koennen=koennen;
		this.wunschpferde=wunschpferde;
	}
	
	/**
	 * Getter f�r den Namen einer Reiterin
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter f�r den Namen einer Reiterin
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter f�r das K�nnen
	 * @return int koennen
	 */
	public int getKoennen() {
		return koennen;
	}

	/**
	 * Setter f�r das K�nnen
	 * @param koennen
	 */
	public void setKoennen(int koennen) {
		this.koennen = koennen;
	}

	/**
	 * Getter f�r die Liste aus Wunschpferden
	 * @return ArrayList<String> wunschpferde
	 */
	public ArrayList<String> getWunschpferde() {
		return wunschpferde;
	}

	/**
	 * Setter f�r die Wunschpferde
	 * @param ArrayList<String> wunschpferde
	 */
	public void setWunschpferde(ArrayList<String> wunschpferde) {
		this.wunschpferde = wunschpferde;
	}
	
}
