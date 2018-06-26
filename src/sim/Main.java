package sim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

import ext_libs.*;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Bienvenido al asistente de vuelo\nElija la opción
		// deseada:\n1)Buscar viaje con menos combinaciones\n2)Buscar viaje más
		// económico");
		// Scanner scan=new Scanner(System.in);
		// String choice=scan.nextLine();
		AdjacencyMapGraph<Vertex, Edge> planning = new AdjacencyMapGraph<>(true);
		fillMap(planning, "C:\\Users\\alang\\Dropbox\\alg_2\\eclipse-workspace\\airport_sim\\src\\sim\\airport_db.txt");
		// System.out.println("Usted ha seleccionado la opción: "+choice);
		 System.out.println(planning.toString());
		// a futuro esto va a ser el menu de seleccion
		// switch (choice) {
		// 1: searchShortestFlight(planning);
		// break;
		// 2: searchCheapestFlight(planning);
		// break;
		// }
	}
	public static void fillMap(AdjacencyMapGraph planning, String path) {
		FileReader fr = null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(fr);
		scanner.useDelimiter("	");

		String auxcity;
		String auxprovince;
		String auxIATACode;
		String auxname;
		

		while (scanner.hasNextLine()) { // mientras que no llegue al fin el archivo lee y acomoda todo
			auxcity = scanner.next();
			auxprovince = scanner.next();
			auxIATACode = scanner.next();
			auxname = scanner.next();
			SinglyLinkedList<String> destinies = new SinglyLinkedList<>(); // hace una lista para los destinos
			String dest = "";
			try {
				while (!(dest = scanner.next()).contains("\n")) {
					destinies.addLast(dest);
				}
			} catch (NoSuchElementException e) {
			} finally {
				
				planning.insertVertex(new Airport(auxcity, auxprovince, auxIATACode, auxname, destinies)); //mete todo en el vertex
			}
		}
		for (Vertex<Airport> col: planning.vertices()) {
			//recorrer vertices para agregar caminos.
		}
		
	}
}
