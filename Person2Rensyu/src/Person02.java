
public class Person02 {
	public String name =null;
	public int age =0;
	public String address=null;
	public String mail=null;
	public int telnumber=0;

	//1
	public Person02(){}

	//2
	public Person02(String name,int age,String address,String mail,int telnumber){
		this.name=name;
		this.age=age;
		this.address=address;
		this.mail=mail;
		this.telnumber=telnumber;

	}

	//3
	public Person02(String name,String address){
		this.name=name;
		this.age=0;
		this.address="岐阜";
	}


	//4
	public Person02(int age,int telnumber){
		this.name="名前なし";
		this.age=age;
		this.telnumber=telnumber;
	}

	//5メールなし
	public Person02(int age, String name){
		this.name=name;
		this.age=age;
		this.mail="メールなし";
	}


}
