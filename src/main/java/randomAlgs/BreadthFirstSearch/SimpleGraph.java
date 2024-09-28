package randomAlgs.BreadthFirstSearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SimpleGraph {

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("you", List.of("alice", "bob", "claire"));
        graph.put("bob", List.of("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", List.of("thom", "jonny"));
        graph.put("anuj", new LinkedList<>());
        graph.put("peggy", new LinkedList<>());
        graph.put("thom", new LinkedList<>());
        graph.put("jonny", new LinkedList<>());

        for (Map.Entry<String, List<String>> entry : graph.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
