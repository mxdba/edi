package com.xpto.api.dto;

import com.xpto.api.entities.City;

public class LongesDistanceCityDTO {
	
	private City city1;
	private City city2;
	private Double distance;
	
	public LongesDistanceCityDTO(City city1, City city2, Double distance) {
		super();
		this.city1 = city1;
		this.city2 = city2;
		this.distance = distance;
	}

	public City getCity1() {
		return city1;
	}

	public void setCity1(City city1) {
		this.city1 = city1;
	}

	public City getCity2() {
		return city2;
	}

	public void setCity2(City city2) {
		this.city2 = city2;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
}