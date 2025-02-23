To change each of the word into capital


import java.util.Scanner;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String val[]=s.split(" ");
        String v="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<val.length;i++){
            if(val[i].length()>0){
               val[i]=val[i].substring(0,1).toUpperCase()+val[i].substring(1);
            }
            sb.append(val[i]).append(" ");
        }
        sb.toString().trim();
        System.out.print(sb);

    }
}

