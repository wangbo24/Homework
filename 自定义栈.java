public class Mystack {
    private int[] array = new int[100];
    private int size;

    public void push(int val){
        array[size++] = val;
    }

    public int pop(){
        return array[--size];
    }
    public int peak(){
        return array[size-1];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
}