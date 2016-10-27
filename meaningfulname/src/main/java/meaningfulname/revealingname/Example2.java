package meaningfulname.revealingname;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	//problem
	
	public List<int[]> getThem() {
		List<int[]> list1 = new ArrayList<int[]>();
		for (int[] x : theList)
			if (x[0] == 4)
				list1.add(x);
		return list1;
	}
	
//	question
//
//1. What kinds of things are in theList?
//2. What is the significance of the zeroth subscript of an item in theList?
//3. What is the significance of the value 4?
//4. How would I use the list being returned?

}
