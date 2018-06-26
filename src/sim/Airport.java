package sim;

import ext_libs.*;

public class Airport {
	private String city;
	private String province;
	private String IATACode;
	private String name;
	private SinglyLinkedList<String> destinies;
	
	public Airport(String city, String province,String faaCode, String name,SinglyLinkedList<String> destinies) {
		this.city = city;
		this.province = province;
		this.IATACode = faaCode;
		this.name = name;
		this.destinies=destinies;
	}

	public String getCity() {return city;}
	public String getProvince() {return province;}
	public String getFaaCode() {return IATACode;}
	public String getName() {return name;}

	@Override
	public String toString() {
		return "Ciudad: " + city + " Provincia: " + province + " FAA: " + IATACode + " Nombre: " + name;
	}
	
	
}
