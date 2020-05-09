package cs_utec.cs2901;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChocolateBoilerSingletonMultiThreadTest {

    public static class CreateInstance implements Runnable {
        public void run() {
            ChocolateBoilerSingleton instance = ChocolateBoilerSingleton.getInstance();
            System.out.println("Instance ID: " + System.identityHashCode(instance));
        }
    }

    @Test
    public void test() {
        System.out.println("Instances:");
        CreateInstance i1 = new CreateInstance();
        CreateInstance i2 = new CreateInstance();
        CreateInstance i3 = new CreateInstance();
        CreateInstance i4 = new CreateInstance();
        CreateInstance i5 = new CreateInstance();
        CreateInstance i6 = new CreateInstance();
        CreateInstance i7 = new CreateInstance();
        CreateInstance i8 = new CreateInstance();
        CreateInstance i9 = new CreateInstance();
        CreateInstance i10 = new CreateInstance();

        new Thread(i1).start();
        new Thread(i2).start();
        new Thread(i3).start();
        new Thread(i4).start();
        new Thread(i5).start();
        new Thread(i6).start();
        new Thread(i7).start();
        new Thread(i8).start();
        new Thread(i9).start();
        new Thread(i10).start();
    }
}