package PBL_TIL.week1;

import java.util.Scanner;

public class week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        while(true) {
            System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
            cnt = scanner.nextInt();

            if (cnt >= 5) {
                break;
            }
            else {
                System.out.println("[오류] 5 이상 입력해주세요.");
                System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
                System.out.println(" ");
            }
        }

        scanner.nextLine();
        String[] names = new String[cnt];

        System.out.println("아기사자 이름을 입력해주세요.");

        for (int i = 0; i < cnt; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println(cnt + "아기사자 명단을 최종적으로 출력합니다.");

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}