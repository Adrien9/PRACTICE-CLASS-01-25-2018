package student;

public class student {

String firstname;
String lastname;
int age1;
double gpa1; 
int id1;

	public student(String first, String last, int age, double gpa, int id) {
		
		firstname=first;
		lastname=last;
		age1=age;
		gpa1=gpa;
		id1=id;
		
	}

	public static void main(String[] args) {
	
student Student=new student("Adrien", " Simmons", 18, 4.0, 244757);
	
System.out.print(Student.firstname);
System.out.println(Student.lastname);
System.out.println(Student.age1);
System.out.println(Student.gpa1);
System.out.println(Student.id1);


	}

}
