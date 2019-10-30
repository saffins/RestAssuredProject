import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,6,7,9,11};

		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0;i<input.length;i++){
			
			hs.add(input[i]);
			
		}
		
		for(int j = 1;j<input.length;j++){
			
			if(!hs.contains(j)){
				
				System.out.println("missing element " + j);
				
			}
			
		}
		 
	}

	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}

	public static int findMissing(List<Integer> ls) {

		for (int i = 1; i < ls.size(); i++) {

			for (int j = 0; j < ls.size(); j++) {

				if (ls.get(j) == i) {

					break;

				}

				if (j == ls.size() - 1) {

					return i;

				}

			}

		}

		return -1;

	}

}
