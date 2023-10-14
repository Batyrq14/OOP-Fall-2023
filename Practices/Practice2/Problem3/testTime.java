package Problem3;

public class testTime {
	public static void main(String[] args) {
		Time t = new Time(15, 6, 56);
		Time t2 = new Time(23, 0 , 0);
		t.add(t2);
		System.out.println(t.toStandard());
		System.out.println(t.toUniversal());
		
	}
}
