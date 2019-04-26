import java.util.HashMap;
import java.util.Map;

public class SocksProblem {
	public static void main(String[] args) {
		int[] x = {1,2,1,2,1,3,2};
		Map<Integer, Integer> collection = new HashMap<>();

        for(int a : x) {
            if (collection.get(a) != null) {
                collection.put(a, collection.get(a)+1);
            } 
            else{
                collection.put(a, 1);
            }
        }
        int pairs = 0;
        for(int z : collection.values()) {
        	pairs += z/2;
        } 
        
        System.out.println(pairs);
	}
}
