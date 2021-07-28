import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.lang.StringBuilder;

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
					updateArrayListFromFile(allDives, "MyLogbook.dat");
					break;
				case 3:
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Zapisanie danych z ArrayList do pliku");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					writeFileFromArrayList(allDives, "MyLogbook.dat");
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
		allDives.add(new Dive(1, "Temple", "Egypt", 55, 19, "Bartek", Gas.AIR));
		allDives.add(new Dive(2, "Thistlegorm", "Egypt", 38, 26, "Pejsebela", Gas.AIR));
		allDives.add(new Dive(3, "Rury kopalni Wapienniki", "Poland", 59, 6, "Bartek", Gas.NITROX));
		allDives.add(new Dive(4, "Um el Faroud", "Malta", 45, 33, "Grzesiek", Gas.AIR));
	}
	
	public void readArrayList(ArrayList<Dive> allDives) {
		System.out.println();
		for(Dive dive : allDives) {
			System.out.println(dive);
		}
	}
	
	private void writeFileFromArrayList(ArrayList<Dive> allDives, String fileName) throws IOException {
		PrintWriter writer = new PrintWriter(fileName, "UTF-8");
		
		for(int i = 0;i < allDives.size();i++) {
			Dive dive = allDives.get(i);
			StringBuffer sb = new StringBuffer();
			sb.append(dive.getNumberDive());
			sb.append(", ");
			sb.append(dive.getPlace());
			sb.append(", ");
			sb.append(dive.getCountry());
			sb.append(", ");
			sb.append(dive.getDiveTime());
			sb.append(", ");
			sb.append(dive.getMaxDeep());
			sb.append(", ");
			sb.append(dive.getBuddy());
			sb.append(", ");
			sb.append(dive.getGas());
			writer.println(sb);
		}
		writer.close();
	}
	
	private void updateArrayListFromFile(ArrayList<Dive> allDives, String fileName) throws IOException  {
		allDives.clear();
		StringBuilder contentBuilder = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String currentLine;
		System.out.println("\nRead data from file to write ArrayList");
		int inNumberDive = 0;
		String inPlace = "";
		String inCountry = "";
		int inDiveTime = 0;
		int inMaxDeep = 0;
		String inBuddy = "";
		String inGas = "";
		
		while((currentLine = br.readLine()) != null) {
			String[] arrSplit = currentLine.split(", ");
			
			
			for(int i = 0;i < arrSplit.length;i++) {
				
				if(i == 0) {
					inNumberDive = Integer.parseInt(arrSplit[i]);
				} else if(i == 1) {
					inPlace = arrSplit[i];
				} else if(i == 2) {
					inCountry = arrSplit[i];
				} else if(i == 3) {
					inDiveTime = Integer.parseInt(arrSplit[i]);
				} else if(i == 4) {
					inMaxDeep = Integer.parseInt(arrSplit[i]);
				} else if(i == 5) {
					inBuddy = arrSplit[i];
				} else if(i == 6) {
					inGas = arrSplit[i];
				}
			}
			
			allDives.add(new Dive(inNumberDive, inPlace, inCountry, inDiveTime, inMaxDeep, inBuddy, Gas.valueOfString(inGas)));
			contentBuilder.append(currentLine).append("\n");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}