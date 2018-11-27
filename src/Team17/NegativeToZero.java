package Team17;

public class NegativeToZero {

    public NegativeToZero(int[] arr) {
    }

    public int[]  NegativeToZero(int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < 0 ? 0 : array[i];
        }
        return array;
    }
}
