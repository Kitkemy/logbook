import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MyLogbook {
	ArrayList<Dive> allDives = new ArrayList<>();
	
	public MyLogbook() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("My Logbook application\n" +
							"foreach loop -> read allDives ArrayList\n");
		
		while(true) {
			System.out.println("=======================================");
			System.out.println("MyLogbook");
			System.out.println("=======================================");
			System.out.println("1.Odczyt danych z aktualnej ArrayList");
			System.out.println("2.Wczytanie danych z pliku do ArrayList");
			System.out.println("3.Zapisanie danych z ArrayList do pliku");
			System.out.println("4.Utworzenie danych -> ArrayList");
			System.out.println("0.Zakończenie programu");
			System.out.println("=======================================");
			System.out.print("Wybierz własciwe polecenie: ");
			
			int choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
				case 1:
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Odczyt danych z aktualnej ArrayList");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					readArrayList(allDives);
					break;
				case 2:
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Wczytanie danych z pliku do ArrayList");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					break;
				case 3:
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Zapisanie danych z ArrayList do pliku");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					break;
				case 4:
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Utworzenie danych -> ArrayList");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					addFirstArrayList(allDives);
					break;
				case 0:
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Zakończenie programu");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					return;
				default:
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Wrong choice !!!");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					break;
			}
		}		
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