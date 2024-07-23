package dataStructures;

public class MyString {

	public static void main(String[] args) {
		String name = "Vivek";
		String name2 = "vivek";
		String name3 = "Welcome to Java tutorial";
		String name4="  Bob Morley ";
		System.out.println(name.charAt(0));
		System.out.println(name.chars());
		System.out.println(name2.equals(name));
		System.out.println(name2.equalsIgnoreCase(name));
		System.out.println(name.concat(name2));
		System.out.println(name);
		System.out.println(name3.contains("Java"));
		String[]names = name4.split(" ");
		for(String name5 : names) {
			System.out.println(name5);
		}
		System.out.println(names[0]);
		System.out.println(name4);
		System.out.println(name4.strip());

	}

}
