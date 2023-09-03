import java.util.Random;

public class PhoneGenerator {
    public static void main(String[] args) {
        String Name = Name();
        String PhoneNumber = PhoneNumber();

        System.out.println("Random Name: " + Name);
        System.out.println("Random Phone Number: " + PhoneNumber);
    }

    static String Name() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < 6; i++) { // Generate a name of length 6
            char randomChar = (char) ('A' + random.nextInt(26));
            name.append(randomChar);
        }

        return name.toString();
    }

    static String PhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("9");

        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        return phoneNumber.toString();
    }
}
