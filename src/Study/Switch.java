package Study;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int month;
        int year;
        int days = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("일수를 알고 싶은 년을 입력하시오:");
        year = scan.nextInt();

        System.out.print("일수를 알고 싶은 달을 입력하시오:");
        month = scan.nextInt();

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    days = 29;
                else
                    days = 28;
                break;
            default:
                System.out.println("월이 잘못 입력되었습니다.");
                break;
        }
        System.out.println("해당 월의 날 수는 " + days);
    }
}
