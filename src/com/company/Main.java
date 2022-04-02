package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maths, physics, turkish, chemistry, music;
        int lesson =5;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz :");
        maths = input.nextInt();
        if (maths >= 0 && maths <= 100) {

        } else {
            maths = 0;
            lesson--;
        }
        System.out.print("Lütfen fizik notunuzu giriniz :");
        physics = input.nextInt();
        if (physics >= 0 || physics <= 100) {

        } else {
            physics = 0;
            lesson--;

        }
        System.out.print("Lütfen türkçe notunuzu giriniz :");
        turkish = input.nextInt();
        if (turkish >= 0 || turkish <= 100) {

        } else {
            turkish = 0;
            lesson--;

        }
        System.out.print("Lütfen kimya notunuzu giriniz :");
        chemistry = input.nextInt();
        if (chemistry >= 0 || chemistry <= 100) {

        } else {
            chemistry = 0;
            lesson--;

        }
        System.out.print("Lütfen müzik notunuzu giriniz :");
        music = input.nextInt();
        if (music >= 0 || music <= 100) {

        } else {
            music = 0;
            lesson--;

        }
        avarage = ((maths + physics + turkish + chemistry + music) / lesson);
        System.out.println("Ortalamanız :" + avarage);


        if (avarage <= 55) {
            System.out.println("Maalesef sınıfı geçemediniz.");

        } else {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
    }
}
