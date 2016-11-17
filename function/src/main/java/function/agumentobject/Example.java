package function.agumentobject;

public class Example {
	
	//When a function seems to need more than two or three arguments, it is likely that some of
	//those arguments ought to be wrapped into a class of their own
	
	//b
	Circle makeCircle(double x, double y, double radius);
	
	//good
	Circle makeCircle(Point center, double radius);
	
	
	//When we create a paramater we should think about the paramter 1,2 is enough

}
