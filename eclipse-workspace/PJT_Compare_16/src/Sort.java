import java.util.Arrays;
import java.util.Collections;

public class Sort {
	void getSortd(Integer[] _a)
	{
		Arrays.sort(_a, Collections.reverseOrder());
		System.out.println(Arrays.toString(_a));
	}
}
