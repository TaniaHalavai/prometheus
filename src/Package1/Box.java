package Package1;

public class Box {
	private int x;
	private int y;
private int z;
	public Box(int x, int y, int z) {
	this.x=x;
	this.y=y;
	this.z=z;
	}
	public int getVolume(int x,int y,int z) {
x=this.x;
return x*y*z;
	}
	
	public int getVolume() {
		return x*y*z;
	}
}
