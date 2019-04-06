package demo;

import java.util.Arrays;
import java.util.Collection;

public class PPrint {
	public static String pformat(Collection<?> colls) {
		if (colls.size() == 0)
			return "[]";
		StringBuffer result = new StringBuffer("[");
		for (Object elem : colls) {
			if (colls.size() != 1) {
				result.append("\n ");
			}
			result.append(elem);
		}
		if (colls.size() != 1) {
			result.append("\n");
		}
		result.append("]");
		return result.toString();
	}

	public static void pprint(Collection<?> c) {
		System.out.println(pformat(c));
	}

	public static void pprint(Object[] o) {
		System.out.println(pformat(Arrays.asList(o)));
	}
}
