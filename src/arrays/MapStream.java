package arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapStream {

	public static void main(String[] args)
	{
		Map<String,String> linkedHash = new LinkedHashMap<>();
		linkedHash.put("Rith", "scwddw");
		linkedHash.put("Rith2", "scwddw");
		linkedHash.put("Rith3", "scwddw");
		linkedHash.put("Rith4", "scwddw");
		
		System.out.println(linkedHash.entrySet().toString());
		
		linkedHash.entrySet().stream().map((Entry<String,String> entry,) -> ).
		
	}
}
