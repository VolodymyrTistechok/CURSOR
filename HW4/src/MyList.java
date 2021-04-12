import java.util.Arrays;
import java.util.Collections;

public class MyList<T extends Number> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public MyList() {
         this.array = (T[]) new Number[0];
    }

    public int sizeArray() {
        return array.length;
    }

    public T[] addElementInTheEnd(T element) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        array = newArray;
        array[array.length - 1] = element;
        return array;
    }

    public T[] removeElementInTheEnd() {
        T[] newArray = Arrays.copyOf(array, array.length - 1);
        array = newArray;
        return array;
    }

    public T getElement(int index){
        return array[index];
    }

    public void showArray(){
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public T smallest() {
        T[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        return newArray[0];
    }

    public T largest() {
        T[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray, Collections.reverseOrder());
        return newArray[0];
    }
}
