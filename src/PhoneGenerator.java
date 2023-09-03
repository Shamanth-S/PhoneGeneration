import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        String name = name();
        String num = num();

        System.out.println("Random name: " + name);
        System.out.println("Random  num: " + num);
    }

    static String name() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < 6; i++) { // Generate a name of length 6
            char randomChar = (char) ('A' + random.nextInt(26));
            name.append(randomChar);
        }

        return name.toString();
    }

    static String num() {
        Random random = new Random();
        StringBuilder phonenum = new StringBuilder("9");

        for (int i = 0; i < 9; i++) {
            phonenum.append(random.nextInt(10));
        }

        return phonenum.toString();
    }
}
