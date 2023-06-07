// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 59.42;
        double heightM = 1.70;
        int index = service.calculate(weightKg, heightM);
        System.out.print(index);

    }
}