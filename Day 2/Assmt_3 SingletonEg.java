package com.eg;

 class NotificationBar {

	private static int count = 0;
	private static NotificationBar obj1 = null;
	private static NotificationBar obj2 = null;
	private static NotificationBar obj3 = null;
	
	private NotificationBar() {
		System.out.println("NotificationBar() called");
	}
	
	static NotificationBar getInstance() {
		NotificationBar tempObj = null;
		count++;
		
		if (count%3 == 1) {
			if (obj1 == null) {
				obj1 = new NotificationBar();
			}
			tempObj = obj1;
		}
		
		if (count%3 == 2) {
			if (obj2 == null) {
				obj2 = new NotificationBar();
			}
			tempObj = obj2;
		}
		
		if (count%3 == 0) {
			if (obj3 == null) {
				obj3 = new NotificationBar();
			}
			tempObj = obj3;
		}
		
		return tempObj;
	}
	
	void showIcon() {
		System.out.println("Showing icon....");
		
	}
	
}
 
 @FunctionalInterface
 interface IXYZ {
	 public void met();
 }
 
 

public class SingletonEg {
	
	static void met9(IXYZ ixyz)  {
		 ixyz.met();
	 }
	
	public static void main(String[] args) {
		NotificationBar nBar1 = NotificationBar.getInstance();
		nBar1.showIcon();
		
		NotificationBar nBar2 = NotificationBar.getInstance();
		nBar2.showIcon();
		
		NotificationBar nBar3 = NotificationBar.getInstance();
		nBar3.showIcon();
		
		NotificationBar nBar4 = NotificationBar.getInstance();
		nBar4.showIcon();
		
		met9(() -> {System.out.println("abc");});
		
	}
}
