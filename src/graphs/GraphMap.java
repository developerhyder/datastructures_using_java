package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphMap<T> {
	
	HashMap<T, List<T>> gMap = new HashMap<>();

	public GraphMap() {
		
	}
	
	public void addEdge(T a, T b) {
		List<T> edgeList =  gMap.get(a);
		if(edgeList != null) {
			edgeList.add(b);
			gMap.put(a, edgeList);
		}else {
			List<T> newList = new ArrayList();
			newList.add(b);
			gMap.put(a, newList);
		}
	}
	
	public void printGraph(){
		this.gMap.forEach((key, value) -> {
			System.out.println("Key "+ key);
			value.stream().forEach(System.out::print);
			System.out.println();
		});
	}
	
}
