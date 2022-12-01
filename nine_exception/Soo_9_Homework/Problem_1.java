import java.applet.Applet;
import java.util.*;

public class Problem_1{
    public static void main(String args[]){
        String[] words = {"apple", "sigma", "java", "node", "beta", "apple pie", "java.lang.Math"};

        for(int i = 0;i<words.length;i++) {
            if(words[i].contains("apple") || words[i].contains("java"))
                System.out.println(words[i]);
        }
    }   
}