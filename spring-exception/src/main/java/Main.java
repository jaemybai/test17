
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	
	public static void main(String[] args) throws Exception {
//		ApplicationContext applicationContext1 =
//				new ClassPathXmlApplicationContext("spring-webservice-service.xml");
//		
		ApplicationContext applicationContext2 =
				new ClassPathXmlApplicationContext("spring-webservice-client.xml");
		
		Object object = applicationContext2.getBean("httpInvokeServiceTestClient");
//		Object object = applicationContext2.getBean("rmiServiceTestClient");

		RmiServiceTest rmiServiceTest = (RmiServiceTest)object;
		rmiServiceTest.printLog("test webservice client sucessfuuly.");
//		handlerMapping.m
		
	}
}
