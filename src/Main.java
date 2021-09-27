public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg  = 58;
        int heightInCm = 168;
        int bodyMassIndex = service.calculate(weightInKg, heightInCm);
        System.out.println(bodyMassIndex);
    }
}
