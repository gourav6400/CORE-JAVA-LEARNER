package designPattern;

public class NotificationFactory {
	//FactoryMethod
   public Notification createService(String service){
	   if(service.equalsIgnoreCase("SMS")){
		   return new SMS();
	   }else if(service.equalsIgnoreCase("Email")){
		   return new Email();
	   }else if(service.equalsIgnoreCase("SocialMedia")){
		   return new SocialMedia();
	   }else{
		   throw new ServiceNotFoundException("Service needs to be selected...");
	   }
   }
}