package az.tasks.nov14;

import java.util.Collections;
import java.util.Random;

public class ClassroomPlaceApp {
    public static void main(String[] args) {
        String[] ad = {"Yetər", "Rəvan Ə", "Rəvan A", "Lalə", "Vüsal", "Əli", "İbrahim", "Tural", "Rəna", "Dilbər", "Aynur", "Raminə", "Seyran", "Famil", "Gülər", "Ruslan", "Ella", "Nihad", "Məhəmməd", "Nigar"};
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        Random random = new Random();
        for (int i = ad.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = ad[i];
            ad[i] = ad[j];
            ad[j] = temp;
        }
        for (int i = 0; i < ad.length; i++) {
            System.out.println((i + 1) + "-cı yer — " + ad[i]);
        }
    }
}