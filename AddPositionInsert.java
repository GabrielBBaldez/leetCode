import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddPositionInsert {
    public static void main(String[] args) throws IOException {
        int[] nums ={1,3,5,6};
        int alvo = 2;

        System.out.println(searchInsert(nums,alvo));
    }
    public static int searchInsert(int[] nums, int target) {
        int tamanhoNums = nums.length;
       int resposta = 0;
        //Se estiver na matriz
        for(int i = 0; i < tamanhoNums; i++){
            if( nums[i] == target){
                resposta = i;
                break;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        list.add(target);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == target){
                resposta = i;
                break;
            }
        }
        return resposta;
    }


}

