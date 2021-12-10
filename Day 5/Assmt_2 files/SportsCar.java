public class SportsCar extends Car {
 
	SportsCar() {
        super(CarType.SPORTS);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building Sports car");
        // add accessories
    }
}