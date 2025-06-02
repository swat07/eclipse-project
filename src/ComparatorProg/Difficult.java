package ComparatorProg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Difficult {


	public static long solution(String[] queryType, int[][] query) {

		int output = 0;

		TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());

		for (int i = 0; i < queryType.length; i++) {
			String queryName = queryType[i];
			int[] qry = query[i];

			System.out.println("Query Name - " +queryName);

			if (queryName.equals("insert")){
				map.put(qry[0], qry[1]);
			}
			else if (queryName.equals("addToValue")){
				for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
					map.put(entry.getKey(), entry.getValue() + qry[0]);
				}
			}

			else if (queryName.equals("addToKey")) {
				HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
				map1.putAll(map);
				for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
					map1.put(entry.getKey() + qry[0], entry.getValue());
				}
				map.clear();
				map.putAll(map1);
			}

			else if (queryName.equals("get")) {
				output = map.get(qry[0]);
			}
		}

		return output;

	}

	public static void main (String[] args) {

		String[] queryType = {"insert", "insert", "addToValue", "addToKey", "get"};
		int[][] query = {{1, 2}, {2, 3}, {2}, {1}, {2}};

		System.out.print(solution(queryType, query));
	}
}
