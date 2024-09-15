package com.grapes.consumtion;

public class GrapeConsumptionService {

	public void calculateGrapes(GrapeConsumption consumption) {
		int totalGrapes = consumption.getTotalGrapes();
		int days = consumption.getDays();
		int increment = consumption.getIncrement();
		int firstDayGrapes = (totalGrapes - (increment * (days - 1) * days / 2)) / days;
		System.out.println("The number of grapes eaten on the first day: " + firstDayGrapes);
		for (int i = 0; i < days; i++) {
			int grapes = firstDayGrapes + i * increment;
			System.out.println("Day " + (i + 1) + ": " + grapes + " grapes");
		}
	}
}
