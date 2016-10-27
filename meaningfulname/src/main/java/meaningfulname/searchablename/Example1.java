package meaningfulname.searchablename;

public class Example1 {

	private static final int NUMBER_OF_TASKS = 0;

	public static void bad() {
		String s = null;
		int[] t = null;
		for (int j = 0; j < 34; j++) {
			s += (t[j] * 4) / 5;
		}
	}

	public static void good() {
		int realDaysPerIdealDay = 4;
		int WORK_DAYS_PER_WEEK = 5;
		int sum = 0;
		for (int j=0; j < NUMBER_OF_TASKS; j++) {
			int[] taskEstimate = null;
			int realTaskDays = taskEstimate[j] * realDaysPerIdealDay; 
				int realdays = 0;
				int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
				sum += realTaskWeeks;
		}
		
	}
}
