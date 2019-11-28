package CXK;

public class CXK implements Star, Basket {
    @Override
    public void basket() {
        System.out.println("会打球");
    }

    @Override
    public void handsome() {
        System.out.println("有颜值");
    }

    @Override
    public void dance() {
        System.out.println("爱跳舞");
    }

    @Override
    public void hiphop() {
        System.out.println("爱唱歌");
    }
}
