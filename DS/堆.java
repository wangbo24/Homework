import java.util.Arrays;

public class MyHeap {
    public static void shiftDownBig(int[] arr, int size, int parent) {
        int child = 2 * parent + 1;
        while(child < size) {
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child++;
            }
            if (arr[parent] < arr[child]) {
                swap(arr,parent,child);

            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void shifDownSmall(int[] arr, int size, int parent) {
        int child = 2 * parent + 1;
        while(child < size) {
            if (child + 1 < size && arr[child + 1] < arr[child]) {
                child++;
            }
            if (arr[parent] > arr[child]) {
                swap(arr,parent,child);

            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void shiftUpBig(int[] arr, int sz, int child){
        int parent = (child - 1) / 2;
        while(child > 0){
            if(arr[child] > arr[parent]){
                swap(arr, child, parent);
                //继续向上更新
                child = parent;
                parent = (child - 1) / 2;
            }
            else{
                break;
            }
        }
    }

    public static void shiftUpSmall(int[] arr, int sz, int child){
        int parent = (child - 1) / 2;
        while(child > 0){
            if(arr[child] < arr[parent]){
                swap(arr, child, parent);
                //继续向上更新
                child = parent;
                parent = (child - 1) / 2;
            }
            else{
                break;
            }
        }
    }

    public static void swap(int[] arr,int parent , int child) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }

    public static void creatHeapBig(int[] arr){
        //从最后U一个非叶子节点开始向下调整
        for(int i = (arr.length - 2) / 2; i >= 0; --i){
            shiftDownBig(arr, arr.length, i);

        }
    }

    public static void creatHeapSmall(int[] arr){
        //从最后U一个非叶子节点开始向下调整
        for(int i = (arr.length - 2) / 2; i >= 0; --i){
            shifDownSmall(arr, arr.length, i);

        }
    }

    public static void main(String[] args) {
        int[]  arr =  {9, 2, 10, 15, 3, 1, 7, 8, 0};
        int[] copy = arr.clone();  // clone 复制数组内容
        int[] copy1 = arr.clone();  // clone 复制数组内容

        int[] copy2 = arr.clone();  // clone 复制数组内容


        System.out.println(Arrays.toString(arr));
        creatHeapBig(arr);
        System.out.println(Arrays.toString(arr));
        creatHeapSmall(copy);
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.toString(copy1));

        System.out.println(Arrays.toString(copy2));
    }
}
