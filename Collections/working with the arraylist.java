working with the arraylist




import java.util.*;
public class Stringhandllying1 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       List<Integer>ans=new ArrayList<>();
       for(int i:arr){
           ans.add(i);
       }
        System.out.println(ans);
           }
        }

