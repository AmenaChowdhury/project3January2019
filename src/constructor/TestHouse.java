package constructor;

public class TestHouse {

	public static void main(String[] args) {
		House house1 = new House();
        house1.setAddress("32-72 steinway street");
        house1.displayAdress();
        
        House house2 = new House("31-10 37 ave");
        House house3 = new House(37);
        
	}

}
