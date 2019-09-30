
public class Test {
	public static void main(String[]args){

		//1
		Person02 yamada =new Person02();
		yamada.name="山田";
		yamada.age=20;
		yamada.address="東京都";
		yamada.mail="qwe@rty";
		yamada.telnumber=123456;

		System.out.println(yamada.name);
		System.out.println(yamada.age);
		System.out.println(yamada.address);
		System.out.println(yamada.mail);
		System.out.println(yamada.telnumber);
		
		
		//2
		Person02 tanaka=new Person02("田中",25,"神奈川県","kanagawa@abc",1230909);
		System.out.println(tanaka.name);
		System.out.println(tanaka.age);
		System.out.println(tanaka.address);
		System.out.println(tanaka.mail);
		

	}

}
