
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("ENTER A NUMBER "));
         int number = scanner.nextInt();
         if (number<0){
             System.out.println("number should be positive");
         }else {
             int sum=0;
             while (number>0){
                 sum+=number%10;
                 number/=10;
             }
             System.out.println("sum is "+sum);
         }
        scanner.close();
    }
}