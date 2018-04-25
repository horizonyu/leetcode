package two_sum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class two_sum {

	public static void main(String[] args) {
		// two sum
		int temp[] = new int[100];
		Scanner scanner = new Scanner(System.in);
		String read = scanner.nextLine();
		String[] numbers = read.split(" ");
		for(int i1=0; i1 < numbers.length; i1++){
			temp[i1] = Integer.parseInt(numbers[i1]);
		}
		
		for(int j = 0; j < numbers.length; j++)
			System.out.println(temp[j]);
		
		//数据已经存储在temp数组中
		//接下来输入目标和
		int target = scanner.nextInt();
		int result[] =  twoSum(temp, target);
		for(int i=0; i<2; i++){
			System.out.println(result[i]);
		}
		
		scanner.close();
		
	}

	private static int[] twoSum(int[] temp, int target) {
		for (int i=0; i<temp.length; i++){
			int sub = target - temp[i];
			for(int j=i+1; j < temp.length; j++){
				if(sub == temp[j]){
					return new int[]{i,j};
				}
			}
			
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	//One-pass Hash Table
	private static int[] twoSum1(int[] temp, int target){
		Map<Integer,Integer> map = new HashMap<>();
		for (int i=0; i<temp.length;i++){
			int sub = target - temp[i];
			if(map.containsKey(sub)){
				return new int[]{i, map.get(sub)};
			}
			map.put(temp[i], i);
		}
		
		  throw new IllegalArgumentException("No two sum solution");
		
		
	}
}
