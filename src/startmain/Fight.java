package startmain;

import java.util.InputMismatchException;
import java.util.Scanner;

import animal.Animal;
import monster.Brown_bear;
import monster.Leopard;
import monster.Monster;
import monster.Mouse;
import monster.Pig;

public class Fight extends Go_Raising_animals {
	Animal ani = new Animal();
	Evolution evo = new Evolution();
	Scanner sc = new Scanner(System.in);
	Scanner sv = new Scanner(System.in);
	static int point_ = 0;

	public int fighting(int num) {

		while (true) {
			if(ani.experience>=200) {
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("최대 경험치를 쌓았습니다.");
				System.out.println("게임을 종료합니다.");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.exit(0);
			}
			
			if ((ani.experience >= 20 && ani.experience <= 59)
					&& (ani.name == "개" || ani.name == "고양이" || ani.name == "말")) {
				ani = evo.evolu(ani);
			} else if ((ani.experience >= 60 && ani.experience <= 99)
					&& (ani.name == "여우" || ani.name == "거대한고양이" || ani.name == "당나귀")) {
				ani = evo.evolu(ani);
			} else if ((ani.experience >= 100 && ani.experience <= 199)
					&& (ani.name == "늑대" || ani.name == "호랑이" || ani.name == "백마")) {
				ani = evo.evolu(ani);
			}
			
			
			System.out.println("━━━━━━━━━━━━━━━━━━━━현재 정보━━━━━━━━━━━━━━━━━━━━");
			System.out.println("현재 " + ani.name + "의 현재 진화단계는 " + ani.level + " 단계 입니다.");
			System.out.println(ani.name + "의 현재 공격력은 " + ani.power + " 입니다.");
			System.out.println(ani.name + "의 현재 체력은 " + ani.hp + " 입니다.");
			System.out.println("현재 경험치는 " + ani.experience + " 입니다.");
			System.out.println("현재 포인트는 " + point_ + " 입니다.");
			// 사냥
			System.out.println("━━━━━━━━━━━━━━━━━━━━육성 시작━━━━━━━━━━━━━━━━━━━━");
			System.out.println("1.사냥하기");
			System.out.println("2.휴식하기(HP회복)");
			System.out.println("3.선택 화면으로 돌아가기");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.print("번호를 입력해 주세요 : ");
			try {
				Scanner sc = new Scanner(System.in);
				num = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("***********************************");
				System.out.println("           잘못된 입력값입니다.");
				System.out.println("           숫자를 입력해 주세요.");
				System.out.println("           다시 입력해 주세요.");
				System.out.println("***********************************");
				continue;

			}

			if (num == 1) {
				Monster monster = new Monster();
				System.out.println("━━━━━━━━━━━━━━━━━━━몬스터 목록━━━━━━━━━━━━━━━━━━━━");
				System.out.println("      1.쥐(공격력3 체력15 경험치10) - 1단계 권장  ");
				System.out.println("      2.돼지(공격력6 체력30 경험치15) - 2단계 권장");
				System.out.println("      3.표범(공격력9 체력70 경험치25) - 3단계 권장");
				System.out.println("      4.불곰(공격력20 체력130 경험치40) - 4단계 권장");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.print("사냥할 몬스터의 번호를 입력해 주세요 : ");

				try {
					Scanner sc = new Scanner(System.in);
					num = sc.nextInt();

				} catch (InputMismatchException e) {
					System.out.println("***********************************");
					System.out.println("           잘못된 입력값입니다.");
					System.out.println("           숫자를 입력해 주세요.");
					System.out.println("           육성 화면으로 돌아갑니다.");
					System.out.println("***********************************");
					continue;
				}
				switch (num) {
				case 1:
					monster = new Mouse();
					break;
				case 2:
					monster = new Pig();
					break;
				case 3:
					monster = new Leopard();
					break;
				case 4:
					monster = new Brown_bear();
					break;
				default:
					System.out.println("잘못된 입력 값 입니다.");
					System.out.println("육성 화면으로 돌아갑니다. ");
					continue;
				}
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("===============================================");
				System.out.println(monster.name + "와 전투를 시작합니다.");
				System.out.println(monster.name + "의 현재 체력은 " + monster.hp + "입니다.");
				System.out.println("===============================================");

				while (true) { // 1번 사냥
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("도망치고 싶으면 y(Y) 입력 \n진행하고 싶으면 아무 키 입력해 주세요.");
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.print("입력해 주세요 : ");
					String runrun = sv.nextLine();

					if (runrun.equals("y") || runrun.equals("Y")) {
						System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println("                싸움에서 도망쳤습니다!");
						System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						break;
					}
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

					monster.attackted(ani.attack());

					if (monster.hp <= 0) {
						System.out.println("몬스터를 처치했습니다.");
						ani.experience += monster.experience;
						System.out.println("경험치 " + monster.experience + "획득");
						point_ += monster.point;
						System.out.println("포인트가 " + monster.point + "점 적립되었습니다.");
						break;
					}

					ani.attackted(monster.attack());
					if (ani.hp <= 0) {
						System.out.println("1. 5 포인트를 소모하여 부활하기(hp는 100%인 상태로 부활 합니다)");
						System.out.println("2. 도망가기(hp가 5로 부활합니다)");
						System.out.println("===============================================");
						System.out.print("행동을 선택해 주세요 : ");
						num = sc.nextInt();
						if (num == 1) { // 1번 경우
							if (point_ < 5) {
								System.out.println("===============================================");
								System.out.println("포인트가 부족합니다. 현재포인트는 : " + point_ + "점 입니다.");
								System.out.println("===============================================");
								System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
								System.out.println("hp가 5로 자동부활 됩니다.");
								ani.hp = 5;
								break;
							} else if (point_ >= 5) {
								if (ani.name == "개" || ani.name == "고양이" || ani.name == "말") {
									ani.hp = 10;
								} else if (ani.name == "여우" || ani.name == "거대한고양이" || ani.name == "당나귀") {
									ani.hp = 20;
								} else if (ani.name == "늑대" || ani.name == "호랑이" || ani.name == "백마") {
									ani.hp = 30;
								} else if (ani.name == "구미호" || ani.name == "백호" || ani.name == "유니콘") {
									ani.hp = 50;
								}

								point_ -= 5;
								System.out.println("hp가 100%인 상태로 부활합니다.");
								System.out.println("===============================================");
								monster.attackted(ani.attack());
							}
						} else if (num == 2) {// 2번 경우
							ani.hp = 5;
							System.out.println("hp가 5로 부활합니다.");
							System.out.println("===============================================");
							break;
						}
					}
					
				}
			}

			else if (num == 2) { // 2번 물약마시기
				if (ani.name == "개" || ani.name == "고양이" || ani.name == "말") {
					if (ani.hp >= 10) {
						System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println("이미 체력이 가득찼습니다.");
						continue;
					} else if (ani.hp < 10) {
						for (int i = ani.hp; ani.hp < 10; i++) {
							ani.hp += 1;
						}
						System.out.println("hp가 100% 회복되었습니다.");
					}
				} else if (ani.name == "여우" || ani.name == "거대한고양이" || ani.name == "당나귀") {
					if (ani.hp >= 20) {
						System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println("이미 체력이 가득찼습니다.");
						continue;
					} else if (ani.hp < 20) {
						for (int i = ani.hp; ani.hp < 20; i++) {
							ani.hp += 1;
						}
						System.out.println("hp가 100% 회복되었습니다.");
					}
				} else if (ani.name == "늑대" || ani.name == "호랑이" || ani.name == "백마") {
					if (ani.hp >= 30) {
						System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println("이미 체력이 가득찼습니다.");
						continue;
					} else if (ani.hp < 30) {
						for (int i = ani.hp; ani.hp < 30; i++) {
							ani.hp += 1;
						}
						System.out.println("hp가 100% 회복되었습니다.");
					}
				} else if (ani.name == "구미호" || ani.name == "백호" || ani.name == "유니콘") {
					if (ani.hp >= 50) {
						System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println("이미 체력이 가득찼습니다.");
						continue;
					} else if (ani.hp < 50) {
						for (int i = ani.hp; ani.hp < 50; i++) {
							ani.hp += 1;
						}
						System.out.println("hp가 100% 회복되었습니다.");
					}
				}
			} else if (num == 3) {
				System.out.println("===============================================");
				System.out.println("선택 화면으로 돌아갑니다.");
				run();
			} else {
				System.out.println("===============================================");
				System.out.println("잘못된 입력값 입니다.");
				continue;
			}
		}
	}

}