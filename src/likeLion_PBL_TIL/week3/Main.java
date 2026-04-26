package likeLion_PBL_TIL.week3;

import likeLion_PBL_TIL.week3.role.Lion;
import likeLion_PBL_TIL.week3.role.Person;
import likeLion_PBL_TIL.week3.role.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 아기사자 입력
        System.out.println("======== 🦁 아기사자 정보 입력 ========");
        System.out.print("👤 이름: ");
        String name1 = sc.nextLine();
        System.out.print("🎓 전공: ");
        String major1 = sc.nextLine();
        System.out.print("📌 기수: ");
        int gen1 = sc.nextInt();
        sc.nextLine();
        System.out.print("💻 파트: ");
        String part1 = sc.nextLine();
        System.out.print("🆔 학번: ");
        String id = sc.nextLine();

        Person lion = new Lion(name1, major1, gen1, part1, id);

        // 운영진 입력
        System.out.println("======== 🧑‍💼 운영진 정보 입력 ========");
        System.out.print("👤 이름: ");
        String name2 = sc.nextLine();
        System.out.print("🎓 전공: ");
        String major2 = sc.nextLine();
        System.out.print("📌 기수: ");
        int gen2 = sc.nextInt();
        sc.nextLine();
        System.out.print("💻 파트: ");
        String part2 = sc.nextLine();
        System.out.print("⭐ 직책: ");
        String position = sc.nextLine();

        Person staff = new Staff(name2, major2, gen2, part2, position);

        // 출력
        printResult(lion);
        printResult(staff);
    }

    private static void printResult(Person p) {
        System.out.println(p.getInfo());
        System.out.println("📝 과제 제출 가능 여부: " +
                (p.canSubmit() ? "✅ 가능" : "❌ 불가능"));
        System.out.println("----------------------");
    }
}
