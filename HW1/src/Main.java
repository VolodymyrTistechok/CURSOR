public class Main {

    public static void main(String[] args) {
        sortArray();
        sumPositive();
        averageArray();
        replaceDuplicated();
    }

    public static void sortArray() {
        System.out.print("№1: ");
        int subM;
        int arrayM[] = {3, 2, -3, 1, -4, 4, -8, 6, 3, -5, -10, 100};
        for (int i = 0; i < arrayM.length - 1; i++) {
            for (int j = i + 1; j < arrayM.length; j++) {
                if (arrayM[i] < arrayM[j]) {
                    subM = arrayM[i];
                    arrayM[i] = arrayM[j];
                    arrayM[j] = subM;
                }
            }
        }
        for (int i : arrayM) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void sumPositive() {
        System.out.print("№2: ");
        int arrayM[] = {3, 2, -3, 1, -4, 2, -8, 3};
        int SUM = 0;
        for (int i = 0; i < arrayM.length; i++) {
            if (arrayM[i] > 0) {
                SUM += arrayM[i];
            }
        }
        System.out.println(SUM);
    }

    public static void averageArray() {
        System.out.print("№3: ");
        int arrayM[] = {3, 2, 3, 1, 4, 2, 8, 3};
        float avg = 0;
        for (int i = 0; i < arrayM.length; i++) {
            avg += arrayM[i];
        }
        avg /= arrayM.length;
        System.out.println(avg);
    }

    public static void replaceDuplicated() {
        System.out.print("№4: ");
        int arrayM[] = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < arrayM.length - 1; i++) {
            for (int j = i + 1; j < arrayM.length; j++) {
                if (arrayM[i] == arrayM[j]) {
                    arrayM[j] = 0;
                }
            }
        }
        for (int i : arrayM) {
            System.out.print(i + " ");
        }
    }


}

