package JavaProgram;

public class FindSmallestEelementInArray {

	public static void main(String[] args) {
		int ages[] = {25, 45, 10, 89};
		int lowestNum = ages[0];
		for (int i : ages) {
			if(lowestNum > i) {
				lowestNum = i;
			}
		}
		System.out.println(lowestNum);
	}

}
