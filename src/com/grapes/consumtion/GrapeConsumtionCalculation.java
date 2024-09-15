package com.grapes.consumtion;

public class GrapeConsumtionCalculation {

	public static void main(String[] args) {

		GrapeConsumptionService service = new GrapeConsumptionService();
		GrapeConsumption consumption = new GrapeConsumption(100, 5, 5);
		service.calculateGrapes(consumption);
	}
}
