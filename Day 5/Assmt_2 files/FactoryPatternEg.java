public class FactoryPatternEg {
    public static void main(String[] args) {
    	
    	Car sObj = CarFactory.buildCar(CarType.SMALL);
    	
    	Car snObj = CarFactory.buildCar(CarType.SEDAN);
    	
    	Car lObj = CarFactory.buildCar(CarType.LUXURY);
    	
    	Car spObj = CarFactory.buildCar(CarType.SPORTS);
    	
    	
    	//How to avoid printing of Class name along with hashcode
        System.out.println(sObj);
        
        System.out.println(snObj);
        
        System.out.println(lObj);
        
        System.out.println(spObj);
    }
}