package advance.dev;

public class MainApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student std1 = new Student("Nguyen H", 30, "Hue", "056789", 9f);
		Student std2 = (Student) std1.clone();
		System.out.println(std1.name);
		System.out.println(std2.name);

	}

}
