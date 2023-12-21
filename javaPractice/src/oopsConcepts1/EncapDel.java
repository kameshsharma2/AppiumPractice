package oopsConcepts1;

public class EncapDel {
	private int x;

	public int getName() {
		return x; 
	}
	public void setName(int y) {
		this.x = y;
	}
	public static void main(String[] args) {
		EncapDel obj = new EncapDel();
	//	obj.setName(10);
		System.out.println(obj.getName());
	}

}