package Methods;

import java.util.ArrayList;

public class Q182 {

	public static int sum(ArrayList<Integer> ints) {
		// write code here
		int sum = 0;
		for (int i = 0; i < ints.size(); i++)
			sum += ints.get(i);

		return sum;

	}

}
