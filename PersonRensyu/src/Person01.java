
public class Person01 {
	public String name=null;
	public int age=0;
	public String address=null;
	public String mail=null;

	public void talk(){
		System.out.println(this.name+"が話す");
	}

	public void dance(){
		System.out.println(this.age+"歳が踊る");
	}

	public void address(){
		System.out.println(this.address+"出身");
	}

	public void mailaddress(){
		System.out.println(this.mail+"メアド");
	}

}
