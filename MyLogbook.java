public class MyLogbook {
	public static void main(String args[]) {
		System.out.println("My Logbook application\n" +
							"foreach loop -> read allDives ArrayList\n" +
							"1, Temple, Egypt, 55, 19, Bartek, air\n" +
							"2, Thistlegorm, Egypt, 38, 26, Pejsebela, air\n" +
							"3, Rury kopalni Wapienniki, Poland, 59, 6, Bartek, nitrox\n" +
							"4, Um el Faroud, Malta, 45, 33, Grzesiek, air\n");
							
		Dive dive1 = new Dive(1, "Temple", "Egypt", 55, 19, "Bartek", "air");
		Dive dive2 = new Dive(2, "Thistlegorm", "Egypt", 38, 26, "Pejsebela", "air");
		Dive dive3 = new Dive(3, "Rury kopalni Wapienniki", "Poland", 59, 6, "Bartek", "nitrox");
		Dive dive4 = new Dive(4, "Um el Faroud", "Malta", 45, 33, "Grzesiek", "air");
		
		System.out.println();
		System.out.println(dive1);
		System.out.println(dive2);
		System.out.println(dive3);
		System.out.println(dive4);
	}
}

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