package Actor;

public class Actor {

	String lastname;
	String firstname;
	public Actor(String first, String last) {
		firstname= first;
		lastname= last;
	}



	public static void main(String[] args) {

		Actor actor=new Actor("Arnold"," Schwarzenegger");
		System.out.print(actor.firstname);
		System.out.print(actor.lastname);

	}

}
