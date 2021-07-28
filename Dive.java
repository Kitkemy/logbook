class Dive {
	int numberDive;
	String place;
	String country;
	int diveTime;
	int maxDeep;
	String buddy;
	Gas gas;
	
	Dive(int numberDive, String place, String country, int diveTime, int maxDeep, String buddy, Gas gas) {
		this.numberDive = numberDive;
		this.place = place;
		this.country = country;
		this.diveTime = diveTime;
		this.maxDeep = maxDeep;
		this.buddy = buddy;
		this.gas = gas;
	}
	
	public int getNumberDive() {
		return numberDive;
	}
	
	public String getPlace() {
		return place;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getDiveTime() {
		return diveTime;
	}
	
	public int getMaxDeep() {
		return maxDeep;
	}
	
	public String getBuddy() {
		return buddy;
	}
	
	public Gas getGas() {
		return gas;
	}
	
	public String toString() {
		return numberDive + ", " + place + ", " + country + ", " + diveTime + ", " + maxDeep + ", " + buddy + ", " + gas;
	}
}