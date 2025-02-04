package edu.mu.vehicles;

import java.time.Year;

import edu.mu.vehicleAttributes.FuelType;
import edu.mu.vehicleAttributes.StartMechanism;
import edu.mu.vehicleAttributes.VehicleColor;

public class MotorBike extends Vehicle{

	public MotorBike(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		
	}

	@Override
	public double calculateMaintenaceCost(double distance) {
		int currentYear = Year.now().getValue();
		
		double maintenanceCost = distance *mass*(currentYear-modelYear)*cylinders*0.002;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = cylinders * gasTankCapacity * fuelPrice/distance * 0.001;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting the engine using KICKSTART.");
	}

}
