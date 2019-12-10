import java.util.ArrayList;
import java.util.List;

public class ExceptionPrint {
    private static void methodD() {
        List<String> list = new ArrayList<String>();
        list.get(0);
    }

    private static void methodA() {
        try {
            methodD();
        } catch (RuntimeException e) {
            throw new MyException("我是异常", e);
        }
    }

    private static void methodB() {
        methodA();
    }

    private static void methodC() {
        methodB();
    }

    public static void main(String[] args) {
        methodC();
    }
}
