import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        HashSet<String> otps = new HashSet<>();
        Random rand = new Random();

        while (otps.size() < 10) {
            String otp = String.format("%06d", rand.nextInt(1000000));
            otps.add(otp);
        }

        System.out.println("Unique OTPs:");
        for (String o : otps) System.out.println(o);
    }
}
