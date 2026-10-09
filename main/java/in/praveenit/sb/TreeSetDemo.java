package in.praveenit.sb;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String>ts = new TreeSet<>();
		ts.add("Java");
		ts.add("Programming");
		ts.add("Language");
		ts.add(null);
		ts.add(null);
		System.out.println(ts);
	}

}
