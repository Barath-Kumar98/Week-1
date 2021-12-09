class FileSystem{

   public void readFile() {
      System.out.println("readFile() in FileSystem");
   }
}

class Network {

   public void sendData() {
      System.out.println("sendData() in Network");
   }
}


class Display {

   public void draw() {
      System.out.println("draw() in Display");
   }
}

class AppLifeCycle {

   public void startApp() {
      System.out.println("startApp() in AppLifeCycle");
   }
}

class Hardware {

	   public void getStatus() {
	      System.out.println("getData() in Hardware");
	   }
	   
	   public void sendData() {
		      System.out.println("sendData() in Hardware");
		   }
	   
	   public void recvData() {
		      System.out.println("recvData() in Hardware");
		   }
	}

interface OSAPI{
    public void readFileOS();
    public void sendDataOS();
    public void startAppOS();
    public void drawOS(); 
    public void getStatus();
    public void sendHardwareData();
    public void recvData();
}

class FacadeClass implements OSAPI{
      public void readFileOS(){
          new FileSystem().readFile();
      }
      
    public void sendDataOS(){
            new Network().sendData();
    }
    
    public void startAppOS(){
        new AppLifeCycle().startApp();
    }
    
    public void drawOS(){
        new Display().draw();
    }

	@Override
	public void getStatus() {
		new Hardware().getStatus();
		
	}

	@Override
	public void sendHardwareData() {
		new Hardware().sendData();
		
	}

	@Override
	public void recvData() {
		new Hardware().recvData();
		
	}
}

public class FacadeExample {
   public static void main(String[] args) {
      FacadeClass obj = new FacadeClass();

      obj.drawOS();
      obj.readFileOS();
      obj.sendDataOS();
      obj.startAppOS();
      obj.getStatus();
      obj.sendHardwareData();
      obj.recvData();
   }
}