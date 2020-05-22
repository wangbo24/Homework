import java.lang.reflect.Array;
import java.util.Arrays;

public class MyPriority {
    private static int[] arr;
    private static int size;

    public static void offer(int val){
        if(size == arr.length){
            arr = Arrays.copyOf(arr,arr.length*2);
        }

        arr[size++] = val;
        MyHeap.shiftUpSmall(arr,size,size - 1);
    }

    public static int poll() {
        if (size >= 0) {
            int peek = arr[0];
            MyHeap.swap(arr,0,size - 1);
            size--;
            MyHeap.shifDownSmall(arr,size,0);
            return peek;
        }
        return -1;
    }
}

