import java.util.ArrayList;

public class Eratosthenes {
    public static ArrayList primes(int n) {
        int p = 2;
        ArrayList<Integer> pizza = new ArrayList();
        for (int i = p; i < n; i++) pizza.add(i);
        while (p < n) {
            for (int i = 0; i < pizza.size(); i++) {
                if (pizza.get(i)%p == 0 && pizza.get(i) != p) {
                    pizza.remove(i);
                    i--;
                }
            }
            for (int a : pizza) {
                if (a > p) {
                    p = a;
                    break;
                }
                if (p == pizza.get(pizza.size()-1)) return pizza;
            }
        }
        return pizza;
    }
}