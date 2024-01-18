import java.util.Arrays;
import java.util.Scanner;

public class maximumOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int len = 0;
        int ch[] = new int[129];
        Arrays.fill(ch, 0);

        while (len != str.length()) {
            ch[(int) str.charAt(len)]++;
            len++;
        }
        int mini=100,maxi=0;
        int maxPos=0,minPos=0;
        // for(int i=94;i<129;i++){
        //     System.out.print(ch[i]+",");
        // }
        
        for(int i=64;i<129;i++){
            if(ch[i]==0) continue;
            if (ch[i]>maxi) {
                maxi=ch[i];
                maxPos=i;
            }
            if(ch[i]<mini){
                mini=ch[i];
                minPos=i;
            }

        }

        System.out.println("Maximum: " + (char)maxPos);
        System.out.println("Minimum: " + (char)minPos);

        sc.close();
    }
}