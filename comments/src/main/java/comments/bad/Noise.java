package comments.bad;

public class Noise {

/*	Sometimes you see comments that are nothing but noise. They restate the obvious and
	provide no new information.*/
	
	/**
	* Default constructor.
	*/
	protected AnnualDateRule() {
	}
	No, really? Or how about this:
	/** The day of the month. */
	private int dayOfMonth;
	And then there’s this paragon of redundancy:
	/**
	* Returns the day of the month.
	*
	* @return the day of the month.
	*/
	public int getDayOfMonth() {
	return dayOfMonth;
	}
}
