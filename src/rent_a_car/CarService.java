package rent_a_car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
	
private List<Car> cars;
	
	public CarService() {
		cars = new ArrayList<>();
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public List<Car> getAllCars() {
		return cars;
	}
	
	public String getCarInfo(Car car) {
        for (Car c : cars) {
            if (c.equals(car) && !c.getSegment().equals("SUV")) {
            	String info = "Marka: " + c.getBrand() +
            			"\nModel: " + c.getModel() +
                        "\nYıl: " + c.getAge() +
                        "\nSegment: " + c.getSegment() +
                        "\nVites: " + c.getTransmissionType() + 
                        "\nYakıt: " + c.getFuelType() +
                        "\nGünlük kiralama ücreti: " + c.getDailyRentalPrice()+" tl" +
                        "\nAylık kiralama ücreti: " + c.getMonthlyRentalPrice()+" tl"+ "(indirim: %" + c.getMonthlyDiscount()+")"+
                        "\nbagaj hacmi: " + c.getTrunkCapacity();
                return info ;
            }else if(c.equals(car) && c.getSegment().equals("SUV")) {
            	String info = "Marka: " + c.getBrand() +
            			"\nModel: " + c.getModel() +
                        "\nYıl: " + c.getAge() +
                        "\nSegment: " + c.getSegment() +
                        "\nVites: " + c.getTransmissionType() + 
                        "\nYakıt: " + c.getFuelType() +
                        "\nGünlük kiralama ücreti: " + c.getDailyRentalPrice()+" tl" +
                        "\n(Araç aylık kiralamaya uygun değildir.)" + 
                        "\nbagaj hacmi: " + c.getTrunkCapacity();
                return info ;
            }
        }return "girdiğiniz araç bulunamadı"; // Eğer araba bulunamazsa null döndür
        
    }
	
}
