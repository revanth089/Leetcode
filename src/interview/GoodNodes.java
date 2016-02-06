package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodNodes {

	static int goodNodes(int[] points_to) {

		int size = points_to.length;

		//int[] solList = new int[size]; 

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> badList = new ArrayList<Integer>();
		Map<Integer,Integer> badMap = new HashMap<Integer,Integer>();
		list.add(1);
		for(int j=0;j<size;j++){


			for(int i=1;i< size;i++){

				if(list.contains(points_to[i])){

					list.add(i+1);
					if(badMap.containsKey(points_to[i])){
						badMap.remove(points_to[i]);
					}

				}
				else{
					badList.add(i+1);
					badMap.put(points_to[i], i+1);
				}
			}
		}
		
		return badMap.size();

	}


	public static void main(String [] args){

		int[] arr = {4,6,1,2,8,7,6,1};
		


		System.out.println(goodNodes(arr));
	}
}
