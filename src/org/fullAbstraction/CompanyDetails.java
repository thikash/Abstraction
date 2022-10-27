package org.fullAbstraction;

public class CompanyDetails implements VehicleDetails {

	public void devdeaprt() {
		System.out.println("developer team: 50");
	}

	public void testdepart() {
		System.out.println("Test team:30");
	}

	@Override
	public void publicBus() {

		System.out.println("seat capacity:55");
	}

	@Override
	public void schoolBus() {
		System.out.println("seat capacity:50");

	}

	@Override
	public void privateBus() {
		System.out.println("seat capacity:62");
	}

	@Override
	public void factoryBus() {
		System.out.println("seat capacity:60");
	}

	@Override
	public void schoolVan() {
		System.out.println("seat capacity:23");
	}

	public static void main(String[] args) {
		CompanyDetails m = new CompanyDetails();

		m.testdepart();
		m.devdeaprt();
		m.schoolVan();
		m.factoryBus();

	}

}
