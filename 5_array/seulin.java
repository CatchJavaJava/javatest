import java.util.Scanner;
public class seulin {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int arr1[] = new int[10];
    double avg=0.0;
    int sum=0;
    for (int i=0; i<10; i++){
      arr1[i] = scanner.nextInt();
      sum += arr1[i];
    }
    avg = sum / 10.0;
    System.out.println(avg);
    System.out.println(sum);
    
    scanner.close();
}
}
