import java.util.ArrayList;

public class MyLogbook {
	MyLogbook() {
		System.out.println("My Logbook application\n" +
							"foreach loop -> read allDives ArrayList\n" +
							"1, Temple, Egypt, 55, 19, Bartek, air\n" +
							"2, Thistlegorm, Egypt, 38, 26, Pejsebela, air\n" +
							"3, Rury kopalni Wapienniki, Poland, 59, 6, Bartek, nitrox\n" +
							"4, Um el Faroud, Malta, 45, 33, Grzesiek, air\n");
		
		ArrayList<Dive> allDives = new ArrayList<>();
		allDives.add(new Dive(1, "Temple", "Egypt", 55, 19, "Bartek", "air"));
		allDives.add(new Dive(2, "Thistlegorm", "Egypt", 38, 26, "Pejsebela", "air"));
		allDives.add(new Dive(3, "Rury kopalni Wapienniki", "Poland", 59, 6, "Bartek", "nitrox"));
		allDives.add(new Dive(4, "Um el Faroud", "Malta", 45, 33, "Grzesiek", "air"));		
	
		System.out.println();
		for(Dive dive : allDives) {
			System.out.println(dive);
		}
	}
}