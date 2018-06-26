package sim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import ext_libs.*;

public class AirportList {
	SinglyLinkedList<Airport> airportList = new SinglyLinkedList<>();

	public AirportList(SinglyLinkedList<Airport> airportList) {
		this.airportList = airportList;
	}

	

	@Override
	public String toString() {
		return airportList.toString();
	}

}
