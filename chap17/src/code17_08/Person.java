package code17_08;

public class Person {
	int age;
	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("指定要" + age);
		}
		this.age = age;
	}

}
