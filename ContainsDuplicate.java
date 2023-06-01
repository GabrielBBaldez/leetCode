import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) throws IOException {
        int[] nums ={1,2,3,4};
        System.out.println( containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> contadorRepeticaoMap = new HashMap<>();
        for (int num : nums) {
            contadorRepeticaoMap.put(num, contadorRepeticaoMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (contadorRepeticaoMap.get(num) > 1) {
                return true;
            }
        }
            return false;
    }
}

