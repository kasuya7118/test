
public class Test {

	public static void main(String[]args){

		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="XXX-123";
		taro.address="東京都";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();


		Person ziro=new Person();
		ziro.name="木村次郎";
		ziro.age=18;
		ziro.phoneNumber="XXX-456";
		ziro.address="神奈川県";
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);
		ziro.talk();
		ziro.walk();
		ziro.run();


		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="XXX-789";
		hanako.address="千葉県";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();


		Person satoshi=new Person();
		satoshi.name="粕谷哲司";
		satoshi.age=24;
		satoshi.phoneNumber="012-345";
		satoshi.address="埼玉県";
		System.out.println(satoshi.name);
		System.out.println(satoshi.age);
		System.out.println(satoshi.phoneNumber);
		System.out.println(satoshi.address);
		satoshi.talk();
		satoshi.walk();
		satoshi.run();



		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
