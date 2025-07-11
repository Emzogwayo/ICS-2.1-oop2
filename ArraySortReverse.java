

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArraySortReverse {
    public static void main(String[] args) {
        String[] pallets = {"B00", "E98", "C67", "A23", "D67"};

        System.out.println("Sorted...");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println(pallet);
        }

        System.out.println("\nReversed...");
        List<String> palletlist = Arrays.asList(pallets);

        Collections.reverse(palletlist);
        for (String pallet : palletlist) {
            System.out.println(pallet);
        }

    }
}
