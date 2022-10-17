class student{
	int rollno;
	String name;
	static String College = "Gceb";
student(int r,String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno + name +College);
	}
}
public class Use_Static {

	public static void main(String[] args) {
		student obj = new student(1911,"Anish");
		obj.display();
	}

}
