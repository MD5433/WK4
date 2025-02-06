import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 17;
        arr[2] = 35;

        for (int i = 0; i < 4; i++){
            System.out.println(Arrays.toString(arr));
        }

        List<String> arList = new ArrayList<>();
        arList.add("Columbus");
        arList.add("New York");
        arList.add("Tokyo");
        System.out.println(arList);

        for(String city : arList){
            System.out.println(city);
        }

        Set<String> cities2 = new TreeSet<>();
        cities2.add("Dayton");
        cities2.add("Toledo");
        cities2.add("Columbus");

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "what");
        System.out.println(hashMap);
    }
}
