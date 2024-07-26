package rent_a_car;

public abstract class Car {

		private String brand;
		private String model;
		private String segment;
		private String transmissionType;
		private long trunkCapacity;
		private String color;
		private long age;
		private String fuelType;
		private double dailyRentalPrice;
		
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public void setSegment(String segment) {
			this.segment = segment;
		}
		public String getSegment() {
			return segment;
		}		
		public String getTransmissionType() {
			return transmissionType;
		}
		public void setTransmissionType(String transmissionType) {
			this.transmissionType = transmissionType;
		}
		public long getTrunkCapacity() {
			return trunkCapacity;
		}
		public void setTrunkCapacity(long trunkCapacity) {
			this.trunkCapacity = trunkCapacity;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public long getAge() {
			return age;
		}
		public void setAge(long age) {
			this.age = age;
		}
		public String getFuelType() {
			return fuelType;
		}
		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}
		public double getDailyRentalPrice() {
			return dailyRentalPrice;
		}
		public void setDailyRentalPrice(double dailyRentalPrice) {
			this.dailyRentalPrice = dailyRentalPrice;
		}
		
}
