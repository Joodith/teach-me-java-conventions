package powerpackage;

public class Power {
    public static int calculatePower(int base, int power) {
        int p = 1;
        for (int i = 0; i<power; i++) {
            p *= base;
        }
        return p;
    }
}
