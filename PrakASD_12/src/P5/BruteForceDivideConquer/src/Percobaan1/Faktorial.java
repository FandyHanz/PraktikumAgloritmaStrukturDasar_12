package P5.BruteForceDivideConquer.src.Percobaan1;

public class Faktorial {
    public int nilai;

    public Faktorial() {

    }

    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (n >= i) {
            fakto = fakto * i;
            i = i + 1;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

}
