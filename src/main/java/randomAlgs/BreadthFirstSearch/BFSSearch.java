package randomAlgs.BreadthFirstSearch;

import java.util.*;

public class BFSSearch {

    Map<String, List<String>> graph = new HashMap<>();

    public boolean search(String name) {

        Queue<String> searchQueue = new LinkedList<>();
        List<String> searched = new ArrayList<>();

        if (graph.get(name) != null) {
            searchQueue.addAll(graph.get(name));
        }

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();

            if (!searched.contains(person)) {
                if (personIsSeller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    if (graph.get(person) != null) {
                        searchQueue.addAll(graph.get(person));
                    }
                    searched.add(person);
                }
            }
        }
        return false;
    }

    private boolean personIsSeller(String name) {
        return name.startsWith("M");
    }

    public void addEdge(String person, String... friends) {
        graph.putIfAbsent(person, new ArrayList<>());
        for (String friend : friends) {
            graph.get(person).add(friend);
        }
    }

    public static void main(String[] args) {
        BFSSearch bfsSearch = new BFSSearch();

        bfsSearch.addEdge("Bob", "Alice", "Can", "Phil");
        bfsSearch.addEdge("Alice", "Peggy");
        bfsSearch.addEdge("Peggy", "Phill");
        bfsSearch.addEdge("Phill", "Mary");

        bfsSearch.search("Bob");

    }

}
