import java.io.IOException;
import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) throws IOException {
        int[]nums = {1,1,1,2,2,3};
        int k = 2;

         Arrays.stream(topKFrequent(nums,k)).forEach((System.out::println));
    }
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> contadorMap = new HashMap<>();
        for (int num : nums) {
            contadorMap.put(num, contadorMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> prioridade = new PriorityQueue<>((a, b) -> contadorMap.get(b) - contadorMap.get(a));
        prioridade.addAll(contadorMap.keySet());

        int[] arrayK = new int[k];
        for (int i = 0; i < k; i++) {
            arrayK[i] = prioridade.poll();
        }
        return arrayK;
    }
}

