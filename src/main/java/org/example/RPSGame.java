package org.example;

public class RPSGame {

    public static void main(String[] args) {
        // 사용자 값
        int user = 2;
        // com 값
        int com = 0;

        /*user = user < com ? user + 3 : user*/;
        if (user < com) {
            user = user + 3;
        } // end if

        int result = user - com; // 0,1,2

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
