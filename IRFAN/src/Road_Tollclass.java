
public class Road_Tollclass {
	String type;
	int tirescount;
	String color;
	public void calculatetoll() {
		if(tirescount==2) {
			System.out.println("the toll is zero");
		}else if(tirescount==4) {
			System.out.println("The toll is 10");
		}else if(tirescount>4) {
			System.out.println("the toll is 40");
		}else {
			System.out.println("invalid tirescount");
		}
	}
public Road_Tollclass() {
	System.out.println("the constructor is excuted");
}
 public void Road_Tollclass(int tirescount,String color) {
	 this.color=color;
	 this.tirescount=tirescount;
 }
}
