package function.arguments;

public class FlagArgument {

	//Flag arguments are ugly. Passing a boolean into a function is a truly terrible practice
	// It does one thing if the flag is true and another if the flag is false
	//My general dislike of flag arguments does have some subtleties and consequences, 
	//the first of which is how to deal with a tangled (roi) implementation
	
	public Booking book (Customer aCustomer, boolean isPremium) {
	      if(isPremium) 
	       // logic for premium book
	      else
	       // logic for regular booking
	}
	
	we should remove isPremium

	
	//good practise
   public void setOn() {}
    void setOff(){}
  

    rather than us 
    void setSwitch(boolean on){};
  
	//good practise
	
}
