
public class FindPI {
    public static void main (String[] args) {
        Fraction MILU = new Fraction(355, 113);
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble() );
        Fraction pi = new Fraction(22, 7);
        double diff = Math.abs(pi.toDouble()-Math.PI);
        while (diff >= EPSILON) {
            if (pi.toDouble() > Math.PI) {
                pi.setDenom(pi.GetDenom() + 1);
            } else {
                pi.setNum(pi.GetNum() + 1);
            }
            System.out.println(pi.toString());
            diff = Math.abs(pi.toDouble()-Math.PI);
        }
    }
}
