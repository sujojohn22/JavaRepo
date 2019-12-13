package com.DemoSujo.Demo1.demoSujo;

import org.springframework.stereotype.Component;

@Component("Flight")
public class PriceSort {

	public PriceSort() {
		// TODO Auto-generated constructor stub
	}
	
	private int Flight_id;
	private String FlightName;
	
	
	public int getFlight_id() {
		return Flight_id;
	}
	public void setFlight_id(int flight_id) {
		Flight_id = flight_id;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	@Override
	public String toString() {
		return "PriceSort [Flight_id=" + Flight_id + ", FlightName=" + FlightName + "]";
	}

	public void sortPrice()
{
	System.out.print("\nThis is sorted Flight price result");
}

}
