public class HW1 {

    public static void main(String[] args) {
        SortArray();
        SumPositive();
        Average();
        Replace();
    }

    public static void SortArray() {
        System.out.print("№1: ");
        int subM;
        int ArrayM[] = {3, 2, -3, 1, -4, 4, -8, 6, 3, -5, -10, 100};
        for (int i = 0; i < ArrayM.length - 1; i++) {
            for (int j = i + 1; j < ArrayM.length; j++) {
                if (ArrayM[i] < ArrayM[j]) {
                    subM = ArrayM[i];
                    ArrayM[i] = ArrayM[j];
                    ArrayM[j] = subM;
                }
            }
        }
        for (int i : ArrayM) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void SumPositive() {
        System.out.print("№2: ");
        int ArrayM[] = {3, 2, -3, 1, -4, 2, -8, 3};
        int SUM = 0;
        for (int i = 0; i < ArrayM.length; i++) {
            if (ArrayM[i] > 0) SUM += ArrayM[i];
        }
        System.out.println(SUM);
    }

    public static void Average() {
        System.out.print("№3: ");
        int ArrayM[] = {3, 2, 3, 1, 4, 2, 8, 3};
        float AVG = 0;
        for (int i = 0; i < ArrayM.length; i++) {
            AVG += ArrayM[i];
        }
        AVG /= ArrayM.length;
        System.out.println(AVG);
    }

    public static void Replace() {
        System.out.print("№4: ");
        int M[] = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < M.length - 1; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i] == M[j]) M[j] = 0;
            }
        }
        for (int i : M) {
            System.out.print(i + " ");
        }
    }


}

