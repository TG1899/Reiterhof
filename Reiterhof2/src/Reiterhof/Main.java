package Reiterhof;

import java.util.ArrayList;
import java.util.Stack;

/*
 * @author Tom Geisler
 */
public class Main {

	/**
	 * Startet das Programm. Erstellt Listen aus Reiterinnen und Pferden und gibt die optimale Kombination aus
	 * @param Konsolenparameter args
	 */
	public static void main(String[] args) {
		ArrayList<Reiterin> reiterinnen = new ArrayList<Reiterin> ();
		ArrayList<Pferd> pferde = new ArrayList<Pferd>();
		pferde = eingabePferde();
		reiterinnen = eingabeReiterinnen();
		Reiterhof reiterhof = new Reiterhof (pferde, reiterinnen);
		System.out.println(reiterhof.getReitpaar().toString());
	}
		
	/**
	 * Eingabe der Pferde mit Namen + Zahl für die Eigenschaft.
	 * @return ArrayList vom Typ Pferd
	 */
		public static ArrayList<Pferd> eingabePferde(){
			Pferd alex = new Pferd("Alex", 1);
			Pferd nicki = new Pferd("Nicki", 2);
			Pferd pucki = new Pferd("Pucki", 1);
			Pferd wittchen = new Pferd("Wittchen", 1);
			Pferd hurrikan = new Pferd ("Hurrikan", 2);
			Pferd tornado = new Pferd ("Tornado", 3);
			Pferd sturmwind = new Pferd("Sturmwind", 2);
			Pferd zausel = new Pferd("Zausel", 1);
			Pferd zackzack = new Pferd ("Zackzack", 3);
			ArrayList<Pferd> pferde = new ArrayList<Pferd>();
			pferde.add(alex);
			pferde.add(nicki);
			pferde.add(pucki);
			pferde.add(wittchen);
			pferde.add(hurrikan);
			pferde.add(tornado);
			pferde.add(sturmwind);
			pferde.add(zausel);
			pferde.add(zackzack);
			return pferde;
		}
		
		/**
		 * Eingabe der Reiterinnen mit Namen, Wunschliste und Zahl für das Können
		 * @return ArrayList vom Typ Reiterin
		 */
		public static ArrayList<Reiterin> eingabeReiterinnen(){
			ArrayList<String> anjasWuensche = new ArrayList<String>();
			anjasWuensche.add("Nicki");
			anjasWuensche.add("Pucki");
			anjasWuensche.add("Wittchen");
			anjasWuensche.add("Alex");
			Reiterin anja = new Reiterin ("Anja", 1, anjasWuensche);
			
			ArrayList<String> bertramsWuensche = new ArrayList<String>();
			bertramsWuensche.add("Alex");
			bertramsWuensche.add("Nicki");
			bertramsWuensche.add("Pucki");
			bertramsWuensche.add("Wittchen");
			bertramsWuensche.add("Hurrikan");
			bertramsWuensche.add("Tornado");
			bertramsWuensche.add("Sturmwind");
			bertramsWuensche.add("Zausel");
			bertramsWuensche.add("Zackzack");	
			Reiterin bertram = new Reiterin ("Bertram", 2, bertramsWuensche);
			
			ArrayList<String> christasWuensche = new ArrayList<String>();
			christasWuensche.add("Hurrikan");
			Reiterin christa = new Reiterin ("Christa", 3, christasWuensche);
			
			ArrayList<String> dorisWuensche = new ArrayList<String>();
			dorisWuensche.add("Alex");
			dorisWuensche.add("Wittchen");
			dorisWuensche.add("Pucki");
			Reiterin doris = new Reiterin ("Doris", 1, dorisWuensche);
			
			ArrayList<String> emilsWuensche = new ArrayList<String>();
			emilsWuensche.add("Alex");
			emilsWuensche.add("Nicki");
			emilsWuensche.add("Pucki");
			emilsWuensche.add("Wittchen");
			emilsWuensche.add("Hurrikan");
			emilsWuensche.add("Tornado");
			emilsWuensche.add("Sturmwind");
			emilsWuensche.add("Zausel");
			emilsWuensche.add("Zackzack");	
			Reiterin emil = new Reiterin ("Emil", 1, emilsWuensche);
			
			ArrayList<String> fritzWuensche = new ArrayList<String>();
			fritzWuensche.add("Sturmwind");
			fritzWuensche.add("Hurrikan");
			Reiterin fritz = new Reiterin ("Fritz", 3, fritzWuensche);
			
			ArrayList<String> gabisWuensche = new ArrayList<String>();
			gabisWuensche.add("Hurrikan");
			gabisWuensche.add("Alex");
			gabisWuensche.add("Sturmwind");
			gabisWuensche.add("Tornado");
			Reiterin gabi = new Reiterin ("Gabi", 2, gabisWuensche);
			
			ArrayList<Reiterin> reiterinnen = new ArrayList<Reiterin>();
			reiterinnen.add(anja);
			reiterinnen.add(bertram);
			reiterinnen.add(christa);
			reiterinnen.add(doris);
			reiterinnen.add(emil);
			reiterinnen.add(fritz);
			reiterinnen.add(gabi);
			
			return reiterinnen;
		}

}