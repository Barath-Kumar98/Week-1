public class CarFactory {
    public static Car buildCar(CarType model) {
        Car obj = null;
        switch (model) {
        case SMALL:
            obj = new SmallCar();
            break;
 
        case SEDAN:
            obj = new SedanCar();
            break;
 
        case LUXURY:
            obj = new LuxuryCar();
            break;
            
        case SPORTS:
            obj = new SportsCar();
            break;
 
        default:
            // throw some exception
            break;
        }
        return obj;
    }
}