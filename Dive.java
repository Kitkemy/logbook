class Dive {
	int numberDive;
	String place;
	String country;
	int diveTime;
	int maxDeep;
	String buddy;
	String gas;
	
	Dive(int numberDive, String place, String country, int diveTime, int maxDeep, String buddy, String gas) {
		this.numberDive = numberDive;
		this.place = place;
		this.country = country;
		this.diveTime = diveTime;
		this.maxDeep = maxDeep;
		this.buddy = buddy;
		this.gas = gas;
	}
	
	public String toString() {
		return numberDive + ", " + place + ", " + country + ", " + diveTime + ", " + maxDeep + ", " + buddy + ", " + gas;
	}
}