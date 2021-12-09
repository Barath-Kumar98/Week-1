

import com.err.InvalidDataException;
import com.proc.StockLogic;

public class MainApp {
	 public static void main(String[] args) {
	        try{
	            StockLogic slobj = new StockLogic();
	            slobj.compute_avg("abcd.xls");
	        }catch(InvalidDataException ide){
	            System.out.println(ide.getMessage());
	        }
	    }
}

