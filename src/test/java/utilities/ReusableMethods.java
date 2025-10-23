package utilities;

public class ReusableMethods {

    public static void wait (int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep don't run");
            throw new RuntimeException(e);
        }

    }
}
