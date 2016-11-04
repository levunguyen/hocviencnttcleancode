package function.flagagurment;

public class Example {

	//not good to pass boolean as parameter. If we pass true it will do
	// 2 things. First it checks if the flag is true or not then it decide to do 
	
	public void renderTest(boolean flag) {
		
		if (true) {
			do someting
		} else {
			do something
		}
		
	}
	
	
	///we should have 2 seperate methods
	
	public void renderForSuite() {
		
	}
	
	public void renderForSingleTest() {
		
	}
}
