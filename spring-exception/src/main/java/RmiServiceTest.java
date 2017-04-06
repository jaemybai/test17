import java.util.Date;



public interface RmiServiceTest {

	public void printLog(String context);
	
	Thread runThreadTask(String name);
	
	Date getCurrentDate();
}
