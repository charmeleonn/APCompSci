
import java.util.ArrayList;

public class Goldbach {
    public static void main(int jesus) {
        ArrayList<Integer> papa = new ArrayList();
        papa = Eratosthenes.primes((jesus));
        for (int i = 0; i < papa.size(); i++) {
            if (papa.contains(jesus-papa.get(i))) {
                System.out.println("ki");
                System.out.println(papa.get(i) + ", " + (jesus-papa.get(i)));
            }
        }
    }
}