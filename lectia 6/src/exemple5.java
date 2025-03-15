
import java.sql.SQLOutput;
import java.util.Scanner;

public class exemple5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
            System.out.println("menu");
            System.out.println("(1) Suma a doua numere");
            System.out.println("(2) Diferenta a doua numere");
            System.out.println("(3) Produsul a doua numere");
            System.out.println("(4) Catul a doua numere");
            System.out.println("(5) Exit");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter first number");
                    double a = scanner.nextInt();
                    System.out.println("Enter second number");
                    double b = scanner.nextInt();
                    System.out.println("Suma="+(a+b));break;
                    case 2:
                        System.out.println("Enter first number");
                        double c = scanner.nextInt();
                        System.out.println("Enter second number");
                        double d = scanner.nextInt();
                        System.out.println("Diferenta="+(c-d));break;
                        case 3:
                            System.out.println("Enter first number");
                            double e = scanner.nextInt();
                            System.out.println("Enter second number");
                            double f = scanner.nextInt();
                            System.out.println("Produsul="+(e*f));break;
                            case 4:
                                System.out.println("Enter first number");
                                double g = scanner.nextInt();
                                System.out.println("Enter second number");
                                double h = scanner.nextInt();
                                System.out.println("Catul="+(g/h));break;
                                case 5:
                                    System.out.println("EXIT");;break;
                                    default:
                                        System.out.println("Invalid option");

            }
        }while(option!=5);
        scanner.close(); }

}
