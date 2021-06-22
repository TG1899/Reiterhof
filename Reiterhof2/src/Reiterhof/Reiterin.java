package Reiterhof;

import java.util.ArrayList;

public class Reiterin {
	private String name;
	private int koennen;
	private ArrayList<String> wunschpferde;
	
	public Reiterin (String name, int koennen, ArrayList<String> wunschpferde) {
		this.name=name;
		this.koennen=koennen;
		this.wunschpferde=wunschpferde;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKoennen() {
		return koennen;
	}

	public void setKoennen(int koennen) {
		this.koennen = koennen;
	}

	public ArrayList<String> getWunschpferde() {
		return wunschpferde;
	}

	public void setWunschpferde(ArrayList<String> wunschpferde) {
		this.wunschpferde = wunschpferde;
	}
	
}
