sort the array by the frequency of the values


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
            val.put(i, val.getOrDefault(i, 0) + 1);
        }
       List<Integer>val2=new ArrayList<>();
        for(int j:arr){
                val2.add(j);
        }
        val2.sort((a,b)->{
            int fa=val.get(a);
            int fb=val.get(b);
            if(fa==fb) {
                return b - a;
            }
            return fa-fb;
        });
        int ans[]=new int[val2.size()];
        for(int i=0;i<val2.size();i++){
          ans[i]=val2.get(i);
        }
        System.out.print(Arrays.toString(ans));
    }
}
