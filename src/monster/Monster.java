package monster;

public class Monster {
	public String name; // 몬스터의 이름
	public int power; // 몬스터의 공격력
	public int hp; // 몬스터의 체력
	public int point; // 몬스터 처치시 포인트적립 1점
	public int experience; // 경험치

	public int attack() {
		System.out.println("━━━━━━━━━━━━━몬스터의 공격 차례입니다.━━━━━━━━━━━━━━");
		System.out.println(name + "가 공격합니다.");
		System.out.println(name + "가 " + power + " 의 데미지를 입혔습니다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		return power;
	}

	public void attackted(int damage) {
		hp -= damage;
		if (hp <= 0) {
			hp = 0;
			System.out.println(name + "가 " + damage + " 의 데미지를 받고 " + name + "의 체력이 " + hp + " 남았습니다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("                 "+ name + " 사냥성공 !");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		} else if (hp > 0) {
			System.out.println(name + "가 " + damage + " 의 데미지를 받고 " + name + "의 체력이 " + hp + " 남았습니다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		}

	}
}
