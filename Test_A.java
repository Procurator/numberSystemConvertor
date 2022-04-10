
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maskNumber = scanner.nextInt();

        int masks;
        int packages;
        int boxes;

        if ((maskNumber * 0.55) <= 11) { // 20 пороговое значение
            masks = maskNumber;
            packages = 0;
            boxes = 0;
            System.out.println(masks + " " + packages + " " + boxes);
        }
        else if ((( (int) (maskNumber / 24.0)) * 11 + (maskNumber % 24 * 0.55)) < 160) { // 347 пороговое значение
            if (maskNumber < 24) {
                masks = 0;
                packages = 1;
            } else {
                masks = maskNumber % 24;
                packages = maskNumber / 24;
            }
            boxes = 0;
            System.out.println(masks + " " + packages + " " + boxes);
        } else {
            if (maskNumber < 384) {
                masks = 0;
                packages = 0;
                boxes = 1;
            } else {
                masks = (maskNumber % 384) % 24;
                packages = (maskNumber % 384) / 24;
                boxes = maskNumber / 384;
            }
            System.out.println(masks + " " + packages + " " + boxes);
        }

    }
}
