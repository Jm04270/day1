package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사용자 값 0,1,2
        int user = Integer.parseInt(br.readLine());*/
        Scanner sc = new Scanner(System.in);

        System.out.println("가위0, 바위1, 보자기2 입력하세요 :");

        String str = sc.nextLine(); // 키보드에서 입력한 문자열
        System.out.println(str);

        int user = Integer.parseInt(str);
        // com 값 0,1,2
        int com = (int)(Math.random() * 3);

        /*user = user < com ? user + 3 : user*/;
        if (user < com) {
            user = user + 3;
        } // end if

        int result = user - com; // 0,1,2

        System.out.println("USER: " + user);
        System.out.println("COM: " + com);

        switch (result) {
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("이김");
                break;
            case 2:
                System.out.println("졌다");
                break;
        } // end switch

    }
}
