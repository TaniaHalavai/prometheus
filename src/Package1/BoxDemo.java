package Package1;

public class BoxDemo {

	public static void main(String[] args) {
Box b1= new Box(1, 3, 5);
Box b2= new Box(2, 4, 6);

System.out.println(b1.getVolume(2, 3, 5));
System.out.println(b1.getVolume());

	System.out.println(b2.getVolume());
	}
}
