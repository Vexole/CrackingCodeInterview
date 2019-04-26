import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoteCounting {

	public static void main(String[] args) {
		VoteCounting obj = new VoteCounting();
		List<String> votes = new ArrayList<>();
		votes.add("Adam");
		votes.add("Jill");
		votes.add("Hall");
		votes.add("Hall");
		votes.add("Jill");
		System.out.println(obj.getResult(votes));
	}
	
	public String getResult(List<String> votes) {		
		Map<String, Integer> record = new HashMap<String, Integer>();
		int max = 0;
		String winner = "";
		
		for(String vote: votes) {
			if(record.get(vote) == null) {
				record.put(vote, 1);
			} else {
				int temp = record.get(vote)+1;
				record.remove(vote);
				record.put(vote, temp);
			}
		}
		
		for(String key: record.keySet()) {
			if(record.get(key) >= max) {
				max = record.get(key);
				winner = key;
			}
		}
		return winner;
	}
}
