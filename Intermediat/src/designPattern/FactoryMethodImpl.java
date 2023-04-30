package designPattern;

import java.util.Scanner;

public class FactoryMethodImpl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of service");
		String service =sc.next();
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createService(service);
		notification.userNotification();

	}

}