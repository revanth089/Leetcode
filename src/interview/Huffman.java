package interview;

import java.util.HashMap;
import java.util.Map;

public class Huffman {
	
	public static String decoding(String[] encodings,String encodedString){
		
		Map<String,String> map = new HashMap<String,String>();
		
		for(int i=0;i<encodings.length;i++){
			
			String[] arr = encodings[i].split("\t");
			map.put(arr[0], arr[1]);
			
		}
		int start =0;
		StringBuilder ret = new StringBuilder();
		for(int i=1;i<encodedString.length();i++){
			
			String str = encodedString.substring(start, i);
			
			if(map.containsKey(str)){
				start = i;
				ret.append(map.get(str));
			}
		}
		
		return ret.toString();
	}

}
