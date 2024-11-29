import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {
    public static void main(String[] args) {
        String str ="this test this is only a test this is a of the emergency broadcast system";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        String str1="";

        HashMap<String,Integer> mp = new HashMap<>();
        for(String i : arr){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        String[] s = {null}; // Mutable holder for the key
        int[] count = {0};
//       for(Map.Entry<String,Integer> entry: mp.entrySet()){
//           if(entry.getValue() > count){
//              s = entry.getKey();
//              count = entry.getValue();
//           }
//       }
        mp.forEach((key,value)-> {
            if (value > count[0]){
                s[0] = key;
                count[0] = value;
            }
        });
        System.out.println(s + " " + Arrays.toString(count));
    }
}
