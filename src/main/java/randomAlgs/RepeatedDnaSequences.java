package randomAlgs;

import java.util.HashSet;
import java.util.Set;

public class RepeatedDnaSequences {

    public static Set<String> findRepeatedSequences(String dna, int k) {

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i =0; i <= dna.length() - k; i++){
            String sequence = dna.substring(i,i+k);
            if(seen.contains(sequence)){
                repeated.add(sequence);
            }
            else {
                seen.add(sequence);
            }
        }


        return repeated;
    }

    public static void main(String[] args) {
        findRepeatedSequences("ATATATATATATATAT",6);
    }

}
