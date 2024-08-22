package Gun01;

public class sefa_Yukleme {
    public static void main(String[] args) throws InterruptedException {
        String[] yuklemeAnimasyonu = {"/", "-", "\\", "|"};
        int animationLength = yuklemeAnimasyonu.length;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < animationLength; j++) {
                System.out.print("\r" + yuklemeAnimasyonu[j] + " Yükleme animasyonu ");
                Thread.sleep(100);
            }
        }
        System.out.println("Red edilecek alan");

    }
}
