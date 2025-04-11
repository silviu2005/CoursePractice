package org.library;

import java.util.Scanner;

public class Library {
    public static void main (String[] args) {
        Library library=new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("culege o actiune");
        int option;
        boolean exit=false;
        do{
            System.out.println("ADAUGA ARTICOL\n+" +
                    "2.Reserve Article\n+" +
                    "3.Intoarce articol\n+" +
                    "4. Verifica disponibilitTEA\n" +
                    "5.Afiseaza toate articolele"+
                    "6.Cauta articol dupa titlu"+
                    "7.Cauta articol dupa titlu si autor"+
                    "8. EXIT"
                    );

            option=scanner.nextInt();
            switch (option) {
                case 1:
                    exit=true;
                    break;
                    case 2:
                        System.out.println("Alege tipul articol:" +
                                "1.");
            }


        }while(true);
    }
}
