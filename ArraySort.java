import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraySort {
    public static void main(String [] args){
        int [] nums = {5,2,3,-1,3};
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        System.out.println("using 'EntrySet' to iterate over map");

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println("["+entry.getKey()+ "," + entry.getValue()+"]");
        }

        System.out.println("Using 'lambda expression' to iterate over map");

        mp.forEach((key,value) ->{
            System.out.println("[" +key+" "+value+"]");
        });

        int i = 0;
        for(int num = min; num <= max; num++){
            while(mp.getOrDefault(num , 0) > 0){
                nums[i] = num;
                i++;
                mp.put(num, mp.get(num) - 1);
            }
        }
        System.out.println("Sorted Array:");

        Arrays.stream(nums).forEach(n -> {
            System.out.print(n + " ");
        });

    }
}
