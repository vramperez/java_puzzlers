package examples;

public class SchrödingersCat {

	public static final SchrödingersCat CAT = new SchrödingersCat();
	private SchrödingersCat() {	}
	
	private static final Boolean LIVING = true;
	
	private final Boolean alive = LIVING;
	
	private final Boolean lives() {
		return alive;
	}
	
	public static void main(String[] args) {
		System.out.println(CAT.lives() ? "of course" : "RIP");
	}
	
//	Possible solution	
//	private static final boolean LIVING = true;
//	
//	public static final SchrödingersCat CAT = new SchrödingersCat();
//	private SchrödingersCat() {	}
//	
//	private final boolean alive = LIVING;
//	
//	private final boolean lives() {
//		return alive;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(CAT.lives() ? "of course" : "RIP");
//	}
}