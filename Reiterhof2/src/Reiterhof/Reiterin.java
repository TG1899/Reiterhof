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
	 * Getter für den Namen einer Reiterin
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter für den Namen einer Reiterin
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter für das Können
	 * @return int koennen
	 */
	public int getKoennen() {
		return koennen;
	}

	/**
	 * Setter für das Können
	 * @param koennen
	 */
	public void setKoennen(int koennen) {
		this.koennen = koennen;
	}

	/**
	 * Getter für die Liste aus Wunschpferden
	 * @return ArrayList<String> wunschpferde
	 */
	public ArrayList<String> getWunschpferde() {
		return wunschpferde;
	}

	/**
	 * Setter für die Wunschpferde
	 * @param ArrayList<String> wunschpferde
	 */
	public void setWunschpferde(ArrayList<String> wunschpferde) {
		this.wunschpferde = wunschpferde;
	}
	
}
