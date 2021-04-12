package examples;

public class SimpleQuestion {
	
	static boolean yesOrNo(String s) {
		s = s.toLowerCase();
		if (s.equals("yes") || s.equals("y") || s.equals("t"))
			s = "true";
		return Boolean.getBoolean(s);
	}

//	// Possible solution
//	static boolean yesOrNo(String s) {
//		s = s.toLowerCase();
//		if (s.equals("yes") || s.equals("y") || s.equals("t"))
//			s = "true";
//		return Boolean.parseBoolean(s);
//	}
//	
//	// Better solution
//	static boolean yesOrNo(String s) {
//		s = s.toLowerCase();
//		return s.equals("yes") || s.equals("y") || s.equals("t") || s.equals("true");
//	}
//	
	public static void main(String[] args) {
		System.out.println(yesOrNo("true") + " " + yesOrNo("YeS"));
	}
}