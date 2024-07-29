package rent_a_car;

public abstract class Car {
		
		private boolean isMonthlyRentable;
		private boolean isDailyRentable;
		private String brand;
		private String model;
		private String segment;
		private String transmissionType;
		private long trunkCapacity;
		private String color;
		private long age;
		private String fuelType;
		private double dailyRentalPrice;
		private double monthlyRentalPrice;
		private double monthlyDiscount;
		
		public Car(boolean isMonthlyRentable, boolean isDailyRentable, String brand, String model, String segment,
	               String transmissionType, long trunkCapacity, String color, long age, String fuelType,
	               double dailyRentalPrice, double monthlyDiscount) {
	        this.isMonthlyRentable = isMonthlyRentable;
	        this.isDailyRentable = isDailyRentable;
	        this.brand = brand;
	        this.model = model;
	        this.segment = segment;
	        this.transmissionType = transmissionType;
	        this.trunkCapacity = trunkCapacity;
	        this.color = color;
	        this.age = age;
	        this.fuelType = fuelType;
	        this.dailyRentalPrice = dailyRentalPrice;
	        this.monthlyDiscount = monthlyDiscount;
	        this.monthlyRentalPrice = (dailyRentalPrice * 30) * (1 - (monthlyDiscount / 100));
	    }
		
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
		public void setMonthlyDiscount(double monthlyDiscount) {
			this.monthlyDiscount = monthlyDiscount;
		}
		
		public void setDailyRentalPrice(double dailyRentalPrice) {
			this.dailyRentalPrice = dailyRentalPrice;
		}
		public void setMonthlyRentalPrice() {
			this.monthlyRentalPrice = (dailyRentalPrice * 30) * (1 - (monthlyDiscount / 100));
		}
		
		public double getMonthlyRentalPrice() {
			return monthlyRentalPrice = (dailyRentalPrice * 30) * (1 - (monthlyDiscount / 100));
		}
				
		public double getMonthlyDiscount() {
			return monthlyDiscount;
		}
		
		public boolean getIsMonthlyRentable() {
			return isMonthlyRentable;
		}
		public void setIsMonthlyRentable(boolean isMonthlyRentable) {
			this.isMonthlyRentable = isMonthlyRentable;
		}
		public boolean getIsDailyRentable() {
			return isDailyRentable;
		}
		public void setIsDailyRentable(boolean isDailyRentable) {
			this.isDailyRentable = isDailyRentable;
		}
		
}
