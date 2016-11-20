package comments.good;

public class Informative {
	
	//It is sometimes useful to provide basic information with a comment. 
	//For example, con- sider this comment that explains the return value of an abstract method:
	
	// Returns an instance of the Responder being tested.
	protected abstract Responder responderInstance();
	
	// format matched kk:mm:ss EEE, MMM dd, yyyy 
	Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");

}
