package startmain;

import animal.Animal;
import animal.Big_cat1;
import animal.Dangna_horse1;
import animal.Fox_dog1;
import animal.Gumi_dog3;
import animal.Tiger_cat2;
import animal.Unicon_horse3;
import animal.White_horse2;
import animal.White_tiger_cat3;
import animal.Wolf_dog2;

public class Evolution {

	Animal evolu(Animal ani) { // Animal 타입 , 객체 리턴


		if ((ani.experience >= 20 && ani.experience <= 59)
				&& (ani.name == "개" || ani.name == "고양이" || ani.name == "말")) {

			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("경험치가 20이상 쌓여" + ani.name + " 가 진화를 합니다!.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			if (ani.name == "개") {
				ani = new Fox_dog1();
			} else if (ani.name == "고양이") {
				ani = new Big_cat1();
			} else if (ani.name == "말") {
				ani = new Dangna_horse1();
			}
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                                               ┃");
			System.out.println("┃              "+ani.name + "가 되었습니다.         ");
			System.out.println("┃                                               ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

		}
		if ((ani.experience >= 60 && ani.experience <= 99)
				&& (ani.name == "여우" || ani.name == "거대한고양이" || ani.name == "당나귀")) {

			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("경험치가 20이 쌓여" + ani.name + " 가 진화를 합니다!.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			if (ani.name == "여우") {
				ani = new Wolf_dog2();

			} else if (ani.name == "거대한고양이") {
				ani = new Tiger_cat2();
			} else if (ani.name == "당나귀") {
				ani = new White_horse2();
			}
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                                                 ┃");
			System.out.println("┃           "+ani.name + "가 되었습니다.             ┃");
			System.out.println("┃                                                 ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

		}
		if ((ani.experience >= 100 && ani.experience <= 199)
				&& (ani.name == "늑대" || ani.name == "호랑이" || ani.name == "백마")) {

			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("경험치가 20이 쌓여" + ani.name + " 가 진화를 합니다!.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			if (ani.name == "늑대") {
				ani = new Gumi_dog3();
			} else if (ani.name == "호랑이") {
				ani = new White_tiger_cat3();
			} else if (ani.name == "백마") {
				ani = new Unicon_horse3();
			}
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                                                 ┃");
			System.out.println("┃           "+ani.name + "가 되었습니다.             ┃");
			System.out.println("┃                                                 ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		}
		
		return ani;
	}

}
