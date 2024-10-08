package randomAlgs.GreedyTechnique;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetCoveringProblem {

    public static void main(String[] args) {

        Set<String> statesNeeded = new HashSet<>();
        statesNeeded.add("mt");
        statesNeeded.add("wa");
        statesNeeded.add("or");
        statesNeeded.add("id");
        statesNeeded.add("nv");
        statesNeeded.add("ut");
        statesNeeded.add("ca");
        statesNeeded.add("az");

        Map<String, Set<String>> stations = new HashMap<>();
        stations.put("kone", new HashSet<>(Set.of("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Set.of("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Set.of("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Set.of("nv", "ut")));
        stations.put("kfive", new HashSet<>(Set.of("ca", "az")));

        Set<String> finalStations = new HashSet<>();

        while (!statesNeeded.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
                Set<String> covered = new HashSet<>(station.getValue());
                covered.retainAll(statesNeeded);

                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
            }
            if (bestStation != null) {
                finalStations.add(bestStation);
                statesNeeded.removeAll(statesCovered);
            }
        }
        System.out.println("Selected stations: " + finalStations);
    }
}
