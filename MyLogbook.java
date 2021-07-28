public class MyLogbook {
	public static void main(String args[]) {
		System.out.println("My Logbook application\n" +
							"foreach loop -> read allDives ArrayList\n" +
							"1, Temple, Egypt, 55, 19, Bartek, air\n" +
							"2, Thistlegorm, Egypt, 38, 26, Pejsebela, air\n" +
							"3, Rury kopalni Wapienniki, Poland, 59, 6, Bartek, nitrox\n" +
							"4, Um el Faroud, Malta, 45, 33, Grzesiek, air\n");
							
		Dive dive1 = new Dive();
		dive1.numberDive = 1;
		dive1.place = "Temple";
		dive1.country = "Egypt";
		dive1.diveTime = 55;
		dive1.maxDeep = 19;
		dive1.buddy = "Bartek";
		dive1.gas = "air";
		
		Dive dive2 = new Dive();
		dive2.numberDive = 2;
		dive2.place = "Thistlegorm";
		dive2.country = "Egypt";
		dive2.diveTime = 38;
		dive2.maxDeep = 26;
		dive2.buddy = "Pejsebela";
		dive2.gas = "air";
		
		Dive dive3 = new Dive();
		dive3.numberDive = 3;
		dive3.place = "Rury kopalni Wapienniki";
		dive3.country = "Poland";
		dive3.diveTime = 59;
		dive3.maxDeep = 6;
		dive3.buddy = "Bartek";
		dive3.gas = "nitrox";
		
		Dive dive4 = new Dive();
		dive4.numberDive = 4;
		dive4.place = "Um el Faroud";
		dive4.country = "Malta";
		dive4.diveTime = 45;
		dive4.maxDeep = 33;
		dive4.buddy = "Grzesiek";
		dive4.gas = "air";
		
		System.out.println(dive1.numberDive + ", " + dive1.place + ", " + dive1.country + ", " + dive1.diveTime + ", " + dive1.maxDeep + ", " + dive1.buddy + ", " + dive1.gas);
		System.out.println(dive2.numberDive + ", " + dive2.place + ", " + dive2.country + ", " + dive2.diveTime + ", " + dive2.maxDeep + ", " + dive2.buddy + ", " + dive2.gas);
		System.out.println(dive3.numberDive + ", " + dive3.place + ", " + dive3.country + ", " + dive3.diveTime + ", " + dive3.maxDeep + ", " + dive3.buddy + ", " + dive3.gas);
		System.out.println(dive4.numberDive + ", " + dive4.place + ", " + dive4.country + ", " + dive4.diveTime + ", " + dive4.maxDeep + ", " + dive4.buddy + ", " + dive4.gas);
	}
	
	static class Dive {
		int numberDive;
		String place;
		String country;
		int diveTime;
		int maxDeep;
		String buddy;
		String gas;
	}
}