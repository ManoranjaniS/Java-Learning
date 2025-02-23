to find the missing num

import java.util.*;

public class Problem452 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=129344445;
       int arr[]=new int[10];
       arr[0]=1;
       while(n>0){
           int index=n%10;
           arr[index]=index;
           n=n/10;
       }
       for(int i=0;i<10;i++){
           if(i==arr[i]){
               System.out.println(arr[i]+" ");
           }
           else{
               System.err.println(i);
           }
       }
    }
}