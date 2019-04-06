package demo;

public class Test {

	public static void main(String[] args) {
		System.out.println(TreeInfo.walk("."));
		System.out.println("==========================");
		PPrint.pprint(Directory.local(".", ".+"));
	}

}
