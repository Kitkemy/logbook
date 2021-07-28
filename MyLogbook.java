import java.util.ArrayList;

public class MyLogbook {
	ArrayList<Dive> allDives = new ArrayList<>();
	
	MyLogbook() {
		System.out.println("My Logbook application\n" +
							"foreach loop -> read allDives ArrayList\n");
		addFirstArrayList(allDives);
		readArrayList(allDives);
	}
	
	public void addFirstArrayList(ArrayList<Dive> dive) {
		allDives.add(new Dive(1, "Temple", "Egypt", 55, 19, "Bartek", "air"));
		allDives.add(new Dive(2, "Thistlegorm", "Egypt", 38, 26, "Pejsebela", "air"));
		allDives.add(new Dive(3, "Rury kopalni Wapienniki", "Poland", 59, 6, "Bartek", "nitrox"));
		allDives.add(new Dive(4, "Um el Faroud", "Malta", 45, 33, "Grzesiek", "air"));
	}
	
	public void readArrayList(ArrayList<Dive> allDives) {
		System.out.println();
		for(Dive dive : allDives) {
			System.out.println(dive);
		}
	}
}