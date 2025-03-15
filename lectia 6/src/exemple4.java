public class exemple4 {
    public static void main(String[] args) {
        int celsius = 0;
        System.out.print("CELSIUS\t\tFARINHEIT");
        for (; celsius < 100; celsius += 10)
        {
            double farinheit = (celsius * 9 / 5) + 32;
            System.out.printf("%d\t\t%.2f\n",celsius,farinheit);
        }
    }
}