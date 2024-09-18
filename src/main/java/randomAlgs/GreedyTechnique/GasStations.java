package randomAlgs.GreedyTechnique;

public class GasStations {

    //Time Complexity O(n)
    public static int gasStationJourney(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];

        }
        if (totalGas < totalCost) {
            return -1;
        }

        int currentGas = 0;
        int position = 0;
        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                position = i + 1;
                currentGas = 0;
            }

        }
        return position;
    }

    public static void main(String[] args) {
        int[] gas = {1, 1, 1, 1, 10};
        int[] cost = {2, 2, 1, 3, 1};
        int result = gasStationJourney(gas, cost);
        System.out.println(result);

    }
}
