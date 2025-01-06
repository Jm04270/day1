package org.example;

import java.util.Scanner;

public class Calculator4U {
    public static void main(String[] args) {
        // Scnner필요
        Scanner sc = new Scanner(System.in);
        // 계속 유지되어야하는 데이터
        int sum = 0;

        // 몇 번 돌지 몰라
        while(true) {
            System.out.println("값을 입력해주세요 : ");
            String str = sc.nextLine();

            // 값이 END가 나오면 break
            if (str.equals("END")) {
                break;
            }

            int value = Integer.parseInt(str);
            sum += value;
        } // end while
        System.out.println(sum);
    }
}
