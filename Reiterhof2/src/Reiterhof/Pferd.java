package Reiterhof;

public class Pferd {
	private String name;
	private int eigenschaft;
	private Reiterin reiterin;
	
	public Pferd (String name, int eigenschaft) {
		this.name=name;
		this.eigenschaft=eigenschaft;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEigenschaft() {
		return eigenschaft;
	}

	public void setEigenschaft(int eigenschaft) {
		this.eigenschaft = eigenschaft;
	}

	public Reiterin getReiterin() {
		return reiterin;
	}

	public void setReiterin(Reiterin reiterin) {
		this.reiterin = reiterin;
	}
	
	public boolean hatReiterin() {
		if (this.getReiterin() != null) {
			return true;
		} else {
			return false;
		}
	}
}
