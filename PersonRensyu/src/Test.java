
public class Test {
	public static void main(String[]args){
		Person01 kasuya=new Person01();
		kasuya.name="粕谷哲司";
		kasuya.age=24;
		kasuya.address="埼玉県";
		kasuya.mail="abc@efg";

		System.out.println(kasuya.name);
		System.out.println(kasuya.age);
		System.out.println(kasuya.address);
		System.out.println(kasuya.mail);


		kasuya.talk();
		kasuya.dance();
		kasuya.address();
		kasuya.mailaddress();


	}

}
