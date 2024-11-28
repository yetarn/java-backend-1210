package az.tasks.nov14;

import java.util.Random;

public class ClassroomPlaceApp {
    public static void main(String[] args) {
        String[] ad = {"Rəvan Agayev",
                "Gülər Əbilova",
                "Yetər Nəbiyeva",
                "Mirzəyeva Dilbər",
                "Ruslan Çərkəzov",
                "Sənubər Abbasova",
                "Fəxri Babayev",
                "Lalə Həmidova",
                "Günay İskəndərova",
                "Ramina Səlimova",
                "Tural Nəzərov",
                "Rəvan Əliyev",
                "İbrahim Ələkbərov",
                "Ella Piriyeva",
                "Aynur Məmmədova",
                "Ömər Ələkbərov",
                "Famil Məmmədov",
                "Rena Mehdiyeva",
                "ƏliMurad",
                "Seyran Xəlilzadə",
                "Hüseynov Məhəmməd",
                "Pərvin Bədəlova",
                "Nicat Məcidov"};
        int[] num = new int[23];
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