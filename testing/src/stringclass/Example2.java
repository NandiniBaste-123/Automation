package stringclass;

public class Example2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello  ");
		sb.append("java");
		System.out.println(sb);
		sb.insert(5, "  Mumbai");
		System.out.println(sb);
		sb.replace(3, 8, "nnnnn");
		System.out.println(sb);
		sb.delete(3, 8);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
