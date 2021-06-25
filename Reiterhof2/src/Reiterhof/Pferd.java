package Reiterhof;

public class Pferd {
	private String name;
	private int eigenschaft;
	private Reiterin reiterin;
	
	/**
	 * Konstruktor eines Pferdes
	 * @param String name
	 * @param int eigenschaft
	 */
	public Pferd (String name, int eigenschaft) {
		this.name=name;
		this.eigenschaft=eigenschaft;
	}

	/**
	 * Getter für den Namen
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter für den Namen
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter der Eigenschaft
	 * @return int eigenschaft
	 */
	public int getEigenschaft() {
		return eigenschaft;
	}
	
	/**
	 * Setter der Eigenschaft
	 * @param int eigenschaft
	 */
	public void setEigenschaft(int eigenschaft) {
		this.eigenschaft = eigenschaft;
	}

	/**
	 * Getter der Eigenschaft
	 * @return Reiterin
	 */
	public Reiterin getReiterin() {
		return reiterin;
	}

	/**
	 * Setter der Reiterin
	 * @param Reiterin
	 */
	public void setReiterin(Reiterin reiterin) {
		this.reiterin = reiterin;
	}
}
