import java.util.*;

public class Problem_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = s.toLowerCase();
        int[] alp = new int[26];
        
        for(int i = 0;i<26;i++)
            alp[i] = -1;

        s.toLowerCase();
        for(int i = 0;i<t.length();i++){
            
            for(int k = 0;k<26;k++){
                if(t.charAt(i) == 'a' + k){
                    alp[k] = i;
                    break;
                }
                
            }
        }

        for(int i = 0;i<26;i++){
            if(alp[i] >= 0)
                System.out.print(alp[i]);
        }
    }
}
