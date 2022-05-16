package startmain;
import java.util.InputMismatchException;
import java.util.Scanner;
import animal.Cat;
import animal.Dog;
import animal.Horse;

public class Go_Raising_animals {
	int point_;
	int experience_;

	public void run() {
		int num = 0;
		Fight fight = new Fight();

		System.out.println("===================동물 키우기===================");
		System.out.println("                   1. 개             ");
		System.out.println("                   2. 고양이          ");
		System.out.println("                   3. 말             ");
		System.out.println("                   4. 게임종료하기             ");
		System.out.println("==============================================");
		System.out.print("키우고 싶은 동물번호를 입력해 주세요 : ");

		try {	
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("***********************************");
			System.out.println("           잘못된 입력값입니다.");
			System.out.println("           숫자를 입력해 주세요.");
			System.out.println("           다시 입력해 주세요.");
			System.out.println("***********************************");
			run();
		}
		switch (num) {
		case 1:
			fight.ani = new Dog();
			break;
		case 2:
			fight.ani = new Cat();
			break;
		case 3:
			fight.ani = new Horse();
			break;
		case 4:
			System.out.println("게임을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("***********************************");
			System.out.println("           잘못된 입력값입니다.");
			System.out.println("           다시 입력해 주세요.");
			System.out.println("***********************************");
			run();
		}

		System.out.println("==============================================");
		System.out.printf("               %s를 선택하셨습니다.       \n", fight.ani.name);
		System.out.println();
		System.out.println("               동물 키우기를 시작합니다.");
		System.out.println("==============================================");
		fight.fighting(num);
	}
}
