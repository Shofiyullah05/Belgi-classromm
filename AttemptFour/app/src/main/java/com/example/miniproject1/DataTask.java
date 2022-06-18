package com.example.miniproject1;

import java.util.ArrayList;

public class DataTask {
    private static String[] taskTitle = {
            "Task 1= Taaruf",
            "Task 2= Khabar Muqaddam",
            "Task 3= Mubtada Muakhor",
            "Task 4 = Isim Fail",
            "Task 5 = Maful bih",
            "Task 6 = Isim Maful",
            "Task 7 = Isim Dhomir",
            "Task 8 = Isim Isyarah",
            "Task 9 = Isim zaman",
            "Task 10 = Isim Makan"


    };
    private static String[] taskDetail = {
            "Buatlah sebuah teks percakapan mengenai ta'aruf (perkenalan) dengan 2/3 orang dan kumpulkan sebelum 20 Juni 2022 23.59 wib",
            "Jelaskan secara terperinci mengenai apa itu khabar muqaddam dan buatlah contoh kalimatnya, kumpulkan sebelum 27 Juni 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai apa itu Mubtada' Muakhor dan buatlah contoh kalimatnya, kumpulkan sebelum 29 Juni 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai Jenis isim Fail dan buatlah contoh kalimatnya, kumpulkan sebelum 30 Juni 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai Jenis Maful bih dan buatlah contoh kalimatnya, kumpulkan sebelum 9 Juli 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai Jenis isim Maful dan buatlah contoh kalimatnya, kumpulkan sebelum 14 Juli 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai apa itu Isim Dhamir dan buatlah contoh kalimatnya, kumpulkan sebelum 20 Juli 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai apa itu Isim isyarah dan buatlah contoh kalimatnya, kumpulkan sebelum 25 Juli 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai apa itu Isim Zaman dan buatlah contoh kalimatnya, kumpulkan sebelum 30 Juli 2022 23.59 WIB",
            "Jelaskan secara terperinci mengenai apa itu Isim Makan dan buatlah contoh kalimatnya, kumpulkan sebelum 5 Agustus 2022 23.59 WIB"

    };

    private static int[] taskImage = {
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop,
            R.drawable.prop
    };

    static ArrayList<Task> getListData () {
        ArrayList<Task> list = new ArrayList<>();
        for (int position=0; position<taskTitle.length;position++ ) {
            Task task = new Task();
            task.setName(taskTitle[position]);
            task.setDetail(taskDetail[position]);
            task.setPhoto(taskImage[position]);
            list.add(task);

        };
        return list;
    };
}
