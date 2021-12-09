package com.eg;

class MyWrapper{
	String str;
	
	
}

public class NotifyWait0 {
	public static MyWrapper mw = new MyWrapper();
	
	public static void main(String[] args) {
		mw.str = "Full Stack";
		System.out.println("Actual string is: " + mw.str);
		NotifyWaitB0 b = new NotifyWaitB0();
		b.start();
		
		synchronized(mw)
		{
			try{
				System.out.println("A:waiting for b thread to complete...");
				mw.wait();
				System.out.println("after wait()....");
			}catch(Exception e) {
				System.out.println("Interrupted Exception:"+e.getMessage());
				e.printStackTrace();
			}
			
			System.out.println("Reversed String is: "+mw.str);
		}
	}

}


class NotifyWaitB0 extends Thread{
	public void run(){
		String reversedString = "";
		
		System.out.println("in run() method of Child thread");
		synchronized(NotifyWait0.mw)
		{
			try
			{
			for(int i=NotifyWait0.mw.str.length()-1;i>=0;i--)
			{
				reversedString += NotifyWait0.mw.str.charAt(i);
				Thread.sleep(100);
			}
			NotifyWait0.mw.str = reversedString;
			}
			catch(Exception e){ e.printStackTrace(); }
			NotifyWait0.mw.notify();
			System.out.println("notify() invoked from Child thread");
		}
		
	}
}
