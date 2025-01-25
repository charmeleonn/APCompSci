
import java.util.ArrayList;

public class BigInt {
    public static void math(ArrayList<Integer> ball, ArrayList<Integer> bowl) {
        ArrayList<Integer> mama = new ArrayList();
        int carry = 0;
        while (ball.size() > bowl.size()) bowl.add(0, 0);
        while (bowl.size() > ball.size()) ball.add(0, 0);
        for (int i = ball.size()-1; i >= 0; i--) {

            if (ball.get(i)+bowl.get(i)+carry > 9) {
                mama.add(0, ball.get(i)+bowl.get(i)+carry-10);
                carry = 1;
                System.out.println(mama+" "+ball.get(i)+" "+bowl.get(i)+" "+carry);
            } else {
                mama.add(0, ball.get(i)+bowl.get(i)+carry);
                carry = 0;
                System.out.println(mama+" "+ball.get(i)+" "+bowl.get(i)+" "+carry);
            }
        }
        if (carry != 0) mama.add(0, carry);
        System.out.println(mama);
    }
}