package streamPrograms;

import java.util.ArrayList;
import java.util.List;
public class StreamMap {
	
	static class Student{
		int age;
		String name;
		public Student(int age, String name) {
			this.age = age;
			this.name = name;
		}
		public Student() {
			
		}
		
		int sortByName(Student s1,Student s2) {
			return s1.name.compareTo(s2.name);
		}
		
		int sortByAge(Student s1,Student s2) {
			return s1.age<s2.age?1:s1.age>s2.age?-1:0;
		}
		
		
	}
	public static void main(String[] args) {
		List<Student> l=new ArrayList();
		l.add(new Student(12, "ramkumar"));
		l.add(new Student(17, "kumar"));
		l.add(new Student(14, "ramkr"));
		l.add(new Student(11, "ramk"));
		
		l.stream()
		.sorted(new Student()::sortByName)
		.filter(x->x.age%2==0)
		.map(m->m.age+3)
		.forEach(System.out::println);
		
	}

}
