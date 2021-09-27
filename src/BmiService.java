public class BmiService {
    public  int calculate (int weightInKg, int heightInCm) {
        int bodyMassIndex = weightInKg * 10_000 / heightInCm / heightInCm;
        return bodyMassIndex;

    }
}
