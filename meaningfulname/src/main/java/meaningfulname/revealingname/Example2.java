package meaningfulname.revealingname;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	// problem

	public List<int[]> getThem() {
		List<int[]> list1 = new ArrayList<int[]>();
		for (int[] x : theList)
			if (x[0] == 4)
				list1.add(x);
		return list1;
	}

	// question
	//
	// 1. What kinds of things are in theList?
	// 2. What is the significance of the zeroth subscript of an item in
	// theList?
	// 3. What is the significance of the value 4?
	// 4. How would I use the list being returned?

	// good
	public List<int[]> getFlaggedCells() {
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for (int[] cell : gameBoard)
			if (cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(cell);
		return flaggedCells;
	}

	// more better
	public List<Cell> getFlaggedCells() {
		List<Cell> flaggedCells = new ArrayList<Cell>();
		for (Cell cell : gameBoard)
			if (cell.isFlagged())
				flaggedCells.add(cell);
		return flaggedCells;
	}
}
