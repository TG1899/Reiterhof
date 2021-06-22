package Reiterhof;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Reiterhof {
	private ArrayList<Pferd> pferde;
	private ArrayList<Reiterin> reiterinnen;
	private Paar reitpaar;
	
	public Reiterhof (ArrayList<Pferd> pferde, ArrayList<Reiterin> reiterinnen) {
		this.pferde=pferde;
		this.reiterinnen=reiterinnen;
		this.reitpaar = zuordnenWunsch (pferde, reiterinnen);
		if (reitpaar.getMatches() < reiterinnen.size() * 2) {
			System.out.println("Hier muss nachgebessert werden!");
		}
//		System.out.println("Reiterinnen: ");
//		for (int i =0; i<reiterinnen.size();i++) {
//			System.out.print(reiterinnen.get(i).getName() + ", ");
//		}
//		System.out.println();
//		
//		System.out.println("Pferde: ");
//		for (int j =0; j<pferde.size();j++) {
//			System.out.print(pferde.get(j).getName()+ ", ");
//		}
//		System.out.println("\n");
	}
	
	public Paar zuordnenWunsch(List<Pferd> pferde, List<Reiterin> reiterinnen) {
		Paar paar = new Paar ();
		for (Reiterin reiterin: reiterinnen) {
			for (Pferd pferd: pferde) {
				if ((reiterin.getKoennen() >= pferd.getEigenschaft())&&(reiterin.getWunschpferde().contains(pferd.getName()))) {
					
					List<Reiterin> reiterinnenNeu = new ArrayList<>(reiterinnen.size());
					reiterinnenNeu.addAll(reiterinnen);
					reiterinnenNeu.remove(reiterin);
					
					List<Pferd> pferdeNeu = new ArrayList<>(pferde.size());
					pferdeNeu.addAll(pferde);
					pferdeNeu.remove(pferd);
					
					Paar neuesPaar = zuordnenWunsch (pferdeNeu, reiterinnenNeu);
					
					neuesPaar.getMap().put(reiterin, pferd);
					neuesPaar.increaseMatch();
					if(reiterin.getWunschpferde().contains(pferd.getName())) {
						neuesPaar.increaseMatch();
					}
					
					if (neuesPaar.getMatches() > paar.getMatches()) {
						paar = neuesPaar;
					}
				}
			}
		}
		return paar;
	}
	
	public Paar zuordnen(List<Pferd> pferde, List<Reiterin> reiterinnen) {
		Paar paar = new Paar ();
		for (Reiterin reiterin: reiterinnen) {
			for (Pferd pferd: pferde) {
				if ((reiterin.getKoennen() >= pferd.getEigenschaft())) {
					
					List<Reiterin> reiterinnenNeu = new ArrayList<>(reiterinnen.size());
					reiterinnenNeu.addAll(reiterinnen);
					reiterinnenNeu.remove(reiterin);
					
					List<Pferd> pferdeNeu = new ArrayList<>(pferde.size());
					pferdeNeu.addAll(pferde);
					pferdeNeu.remove(pferd);
					
					Paar neuesPaar = zuordnen(pferdeNeu, reiterinnenNeu);
					
					neuesPaar.getMap().put(reiterin, pferd);
					neuesPaar.increaseMatch();
					if(reiterin.getWunschpferde().contains(pferd.getName())) {
						neuesPaar.increaseMatch();
					}
					
					if (neuesPaar.getMatches() > paar.getMatches()) {
						paar = neuesPaar;
					}
				}
			}
		}
		return paar;
	}

	public ArrayList<Pferd> getPferde() {
		return pferde;
	}

	public ArrayList<Reiterin> getReiterinnen() {
		return reiterinnen;
	}

	public Paar getReitpaar() {
		return reitpaar;
	}
}
