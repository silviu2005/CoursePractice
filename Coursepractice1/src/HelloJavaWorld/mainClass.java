package HelloJavaWorld;
import packageone.classone;
import packagetwo.classtwo;

public class mainClass {
    public static void main(String[] args) {

    System.out.printf("Hello and welcome!");
    classone classone = new classone();
    classone.printMessage();
    classtwo classtwo = new classtwo();
    classtwo.display();
}


}
