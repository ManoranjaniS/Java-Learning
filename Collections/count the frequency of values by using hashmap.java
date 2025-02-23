count the frequency of values by using the hashmap


import java.util.*;
class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer>val=new HashMap<>();
        for(int i:arr) {
            val.put(i, val.getOrDefault(i,0)+1);
        }
        System.out.print(val);

    }
}
