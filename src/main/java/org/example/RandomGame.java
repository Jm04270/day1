package org.example;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        // Scanner 필요
        Scanner sc = new Scanner(System.in);

        // 당첨값 필요
        int value = (int)(Math.random() * 6);

        // 반복 처리
        for (int i = 0; i < 6; i++) {
            sc.nextLine();
            System.out.println("i------" + i);
            System.out.println("값-----" + value);
            if (i == value) {
                System.out.println("당첨");
                break;
            } else {
                System.out.println("낙첨");
            }
        } // end for
    }
}
