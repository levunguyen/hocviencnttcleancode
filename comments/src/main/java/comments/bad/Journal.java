package comments.bad;

public class Journal {
	
	/*Sometimes people add a comment to the start of a module every time they edit it. These
	comments accumulate as a kind of journal, or log, of every change that has ever been
	made. I have seen some modules with dozens of pages of these run-on journal entries*/
	
	* Changes (from 11-Oct-2001)
	* --------------------------
	* 11-Oct-2001 : Re-organised the class and moved it to new package
	* com.jrefinery.date (DG);
	* 05-Nov-2001 : Added a getDescription() method, and eliminated NotableDate
	* class (DG);
	* 12-Nov-2001 : IBD requires setDescription() method, now that NotableDate
	* class is gone (DG); Changed getPreviousDayOfWeek(),
	* getFollowingDayOfWeek() and getNearestDayOfWeek() to correct
	* bugs (DG);
	* 05-Dec-2001 : Fixed bug in SpreadsheetDate class (DG);
	* 29-May-2002 : Moved the month constants into a separate interface
	* (MonthConstants) (DG);
	* 27-Aug-2002 : Fixed bug in addMonths() method, thanks to N???levka Petr (DG);
	* 03-Oct-2002 : Fixed errors reported by Checkstyle (DG);
	* 13-Mar-2003 : Implemented Serializable (DG);
	* 29-May-2003 : Fixed bug in addMonths method (DG);
	* 04-Sep-2003 : Implemented Comparable. Updated the isInRange javadocs (DG);
	* 05-Jan-2005 : Fixed bug in addYears() method (1096282) (DG);
	
	/*Long ago there was a good reason to create and maintain these log entries at the start
	of every module. We didn’t have source code control systems that did it for us. Nowadays,
	however, these long journals are just more clutter to obfuscate the module. They should be
	completely removed.*/

}
