package javacore.demo.javalang;

public class StringBufferBuilderExample {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(" Hello ");

//		//append 
//		sb.append(" Java ");
//		System.out.println(sb);

//		//insert
//		sb.insert(2, " Python ");
//		System.out.println(sb);

//		//replace
//		sb.replace(1, 4, "PHP..");
//		System.out.println(sb);

//		//delete
//		sb.delete(1, 3);
//		System.out.println(sb);

//		//reverse
//		sb.reverse();
//		System.out.println(sb);

		// capacity
		StringBuffer ssb = new StringBuffer();
		System.out.println(ssb.capacity());// mac dinh la 16
		ssb.append("Hello");
		System.out.println(ssb.capacity());// dan day van la 16
		ssb.append("java is my favourite language");
		System.out.println(ssb.capacity());// den day la (16*2)+2=34 / (dung luong cu*2)+2
	}
}
