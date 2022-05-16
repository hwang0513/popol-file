package animal;

import java.util.Scanner;

public class Animal {
	public String name; // 동물의 이름
	public int level; // 동물의 진화단계(3단계까지)
	public int power; // 동물의 공격력
	public int hp; // 동물의 체력
	public int point; // 몬스터 처치시 포인트적립 1점
	public int experience; // 경험치
	Scanner sc = new Scanner(System.in);
	Scanner sv = new Scanner(System.in);

	public int attack() {
		System.out.println();
		System.out.print("━━━━━━━━━━━━━━━━당신의 차례입니다.━━━━━━━━━━━━━━━━━");
		System.out.println();
		System.out.println("1.공격");
		System.out.println("2.숨어서 체력 회복하기(hp가 100%일 경우 이어서 자동 공격합니다.)");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("원하는 행동을 선택하여 입력해 주세요 : ");
		int num = sc.nextInt();
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		if (num == 2) {
			hide();
		}
		return power;
	}

	public void attackted(int damage) {
		hp -= damage;
		if (hp > 0) {
			System.out.println("당신의 " + name + "의 체력이 " + hp + " 남았습니다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		} else if (hp <= 0) {
			hp = 0;
			experience -= 5;
			System.out.println("당신의 " + name + "가 죽었습니다.");
			if (experience <= 0) {
				experience = 0;
				System.out.println("경험치는 0미만으로 떨어지지 않습니다.");
			} else if (experience > 0) {
				System.out.println("경험치가 5 감소했습니다.");
			}
		}
	}

	public void hide() {

		if (name == "개" || name == "고양이" || name == "말") {
			if (hp >= 10) {
				hp = 10;
				System.out.println("이미 체력이 가득 찼습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("이어서 공격합니다.");
				return;
			} else if (hp >= 1 && hp < 10) {
				hp += 5;
				if (hp >= 10)
					hp = 10;
				System.out.println(name + "가 회복을 하고 체력이 " + hp + "가 되었습니다.");
				if (hp >= 10) {
					hp = 10;
					System.out.println("체력이 가득 찼습니다.");
					System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");
					return;
				}
				System.out.println("최대 체력의 50%가 회복되었습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("=====================================================");
				System.out.println("포션을 더 마시겠습니까? : y(마신다) 싫다면 아무 키를 입력해 주세요");
				String c = sv.nextLine();

				if ((c.equals("y") || c.equals("Y")) && hp < 10) {
					hide();
				} else {
					System.out.println("이미 체력이 가득 찼습니다.");
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");
					return;
				}
			}
		} else if (name == "여우" || name == "거대한고양이" || name == "당나귀") {
			if (hp == 20) {
				System.out.println("체력이 가득 찼습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("이어서 공격합니다.");

			} else if (hp >= 20) {
				hp = 20;
				System.out.println("체력이 가득 찼습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("이어서 공격합니다.");
			} else if (hp >= 1 && hp < 20) {
				hp += 10;
				if (hp >= 20) {
					hp = 20;
					System.out.println("체력이 가득 찼습니다.");
					System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");
					return;
				}
				System.out.println("최대 체력의 50%가 회복되었습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("=====================================================");
				System.out.println("포션을 더 마시겠습니까? : y(마신다) 싫다면 아무 키를 입력해 주세요");
				String c = sv.nextLine();

				if (c.equals("y") || c.equals("Y")) {
					hide();
				} else {
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");
					return;
				}
			}
		} else if (name == "늑대" || name == "호랑이" || name == "백마") {
			if (hp == 30) {
				System.out.println("체력이 가득 찼습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("이어서 공격합니다.");

			} else if (hp >= 30) {
				hp = 30;
				System.out.println("체력이 가득 찼습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("이어서 공격합니다.");
			} else if (hp >= 1 && hp < 30) {

				hp += 15;
				if (hp >= 30) {
					hp = 30;
					System.out.println("체력이 가득 찼습니다.");
					System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");
					return;
				}
				System.out.println("최대 체력의 50%가 회복되었습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("=====================================================");
				System.out.println("포션을 더 마시겠습니까? : y(마신다) 싫다면 아무 키를 입력해 주세요");
				String c = sv.nextLine();

				if (c.equals("y") || c.equals("Y")) {
					hide();
				} else {
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");
					return;
				}
			}
		} else if (name == "구미호" || name == "백호" || name == "유니콘") {

			if (hp == 50) {
				System.out.println("체력이 가득 찼습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("이어서 공격합니다.");

			} else if (hp >= 50) {
				hp = 50;
				System.out.println("체력이 가득 찼습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("이어서 공격합니다.");
			} else if (hp >= 1 && hp < 50) {
				hp += 25;
				if (hp >= 50) {
					hp = 50;
					System.out.println("체력이 가득 찼습니다.");
					System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");
					return;
				}
				System.out.println("최대 체력의 50%가 회복되었습니다.");
				System.out.println("현재 당신의 " + name + " 의 체력은 " + hp + " 입니다");
				System.out.println("=====================================================");
				System.out.println("포션을 더 마시겠습니까? : y(마신다) 싫다면 아무 키를 입력해 주세요");
				String c = sv.nextLine();

				if (c.equals("y") || c.equals("Y")) {
					hide();
				} else {
					System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("이어서 공격합니다.");

				}
			}
		}
	}

}
