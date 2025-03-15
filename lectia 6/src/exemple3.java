import java.util.Scanner;

public class exemple3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String parolacorect= "parolacorect";
       int incercaridisponibile=3;
       boolean initialautentificat=false;
       while(incercaridisponibile>0){
           System.out.println("enter the password");
           String password=scanner.nextLine();
           if(password.equals(parolacorect)){
               initialautentificat=true;
               break;
           }else{
               incercaridisponibile--;
               System.out.println("password does not match try again");

           }
       }
       if (initialautentificat==true){
           System.out.println("password works.Congratulations!!:)");
       }else{
           System.out.println("password does not match you got blocked! ");
       }

        scanner.close();
    }
}
