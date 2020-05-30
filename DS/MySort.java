import java.util.Arrays;
import java.util.Stack;

public class MySort {
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }



    public static void insertSort(int[] arr){
        for(int i = 0; i < arr.length - 1; ++i){
            int end = i;
            int key = arr[i + 1];
            while (end >= 0 && arr[end] > key) {
                arr[end + 1] = arr[end];
                end--;
            }
            arr[end + 1] = key;
        }
    }
    public static void shallSort(int[] arr){
        int gap = arr.length;
        while(gap > 1){
            gap = gap / 3 + 1;
            for(int i = 0; i < arr.length - gap;i++){
                int end = i;
                int key = arr[i + gap];
                while(end >= 0 && key < arr[end]){
                    arr[end + gap] = arr[end];
                    end -= gap;
                }
                arr[end + gap] = key;
            }
        }
    }

    public static void selectSort(int[] arr){
        int begin = 0;
        int end = arr.length - 1;
        while(begin < end){
            int minIdx = begin;
            int maxIdx = end;
            for(int i = begin; i <= end; i++){
                if (arr[maxIdx] < arr[i]) {
                    maxIdx = i;
                }
                if(arr[minIdx] > arr[i]){
                    minIdx = i;
                }
            }
            swap(arr,maxIdx,end);
            if(minIdx == end){
                minIdx = maxIdx;
            }
            swap(arr,minIdx,begin);
            end--;
            begin++;
        }
    }

    public static void shiftDownBig(int[] arr,int parent,int size){
        int child = parent*2 + 1;
        while(child < size) {
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child++;
            }
            if (arr[child] > arr[parent]) {
                swap(arr, parent, child);
                parent = child;
                child = parent * 2 + 1;
            } else {
                break;
            }
        }
    }

    public static void heapSprt(int[] arr){
        for(int i = arr.length - 1; i >= 0;i--){
            shiftDownBig(arr,i,arr.length);
        }
        System.out.println(Arrays.toString(arr));
        for(int end = arr.length - 1;end > 0;end--){
            swap(arr,0,end);
            shiftDownBig(arr,0,end);
        }
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        while(len-- > 0){
            boolean flag = true;
            for(int i = 0; i < len;i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    //快排——三数取中法：为了让数据分组更加均衡
    public static int getMid(int[] arr, int left, int right){
        // 从 arr[left], arr[mid], arr[right],中选一个中间值
        int mid = (left + right) / 2;
        if(arr[mid] > arr[left]){
            if(arr[mid] < arr[right])
                return mid;
            else{
                // mid  > left, >= right
                if(arr[left] > arr[right])
                    return left;
                else
                    return right;
            }
        }
        else{
            // mid <= left
            if(arr[mid] > arr[right])
                return mid;
            else{
                // mid <= left, <= right
                if(arr[left] < arr[right])
                    return left;
                else
                    return right;
            }
        }
    }

    //Hoare
    public static int partion1(int[] arr, int left,int right){
        int mid = getMid(arr, left, right);
        swap(arr, left, mid);

        int key = arr[left];
        int start = left;
        while(left < right){
            while(left < right && arr[right] >= key){
                right--;
            }
            while(left < right && arr[left] <= key){
                left++;
            }
            swap(arr,left,right);
        }
        //left 和 right 相遇
        swap(arr,start,left);
        return left;
    }
    //挖坑法
    public static int partion2(int[] arr, int left,int right){
        int key = arr[left];
        while (left < right){
            while (left < right && arr[right] < key){
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] > key){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }
    //前后遍历法
    public static int partion3(int[] arr, int left,int right){
        int key = arr[left];
        int prev = left;
        int cur = left + 1;

        while(cur <= right){
            if(arr[cur] < key && ++prev != cur){
                swap(arr,prev,cur);
            }
            cur++;
        }
        swap(arr,prev,left);
        return prev;
    }
    /*
        快排递归：
        时间复杂度：O(nlogn)    最坏时间复杂度： 没有优化之前 O(n^2)
        稳定性：不稳定  基准值的位置进行交换的时候有可能改变相同元素的相对位置
        空间复杂度：logn
     */
    public static void quickSort(int[] arr,int left,int right){
        if(left < right){
            int mid = partion1(arr,left,right);
            quickSort(arr,left,mid-1);
            quickSort(arr,mid+1,right);
        }
    }

    /*
    非递归： 模拟递归过程
    1. 选基准值
    2. 根据基准值分组
    3. 给划分的小组数据进行重复1,2的过程
    */
    public static void quickSortNoR(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        Stack<Integer> st = new Stack<>();
        if(left < right){
            st.push(left);
            st.push(right);
        }
        while(!st.isEmpty()){
            int right1 = st.pop();
            int left1 = st.pop();

            int mid = partion1(arr,left1,right1);
            if(left1 < mid-1){
                st.push(left1);
                st.push(mid-1);
            }
            if(mid+1 < right1){
                st.push(mid+1);
                st.push(right1);
            }
        }
    }

    public static void test1()
    {
        int[]  arr = {120,9,3,2,10,35,89,0,3,9,9,7,12};
        int[]  copy = arr.clone();
        int[]  copy2 = arr.clone();
        int[]  copy3 = arr.clone();
        int[]  copy4 = arr.clone();
        int[]  copy5 = arr.clone();
        int[]  copy6 = arr.clone();

        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));
        shallSort(copy2);
        System.out.println(Arrays.toString(copy2));
        selectSort(copy3);
        System.out.println(Arrays.toString(copy3));
        heapSprt(copy4);
        System.out.println(Arrays.toString(copy4));
        quickSort(copy5,0,copy5.length-1);
        System.out.println("quickSort:"+Arrays.toString(copy5));
        quickSort(copy6,0,copy6.length-1);
        System.out.println("quickSortNoR:"+Arrays.toString(copy6));

    }

    public static void main(String[] args) {
        test1();
    }
}
