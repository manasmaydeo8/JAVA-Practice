package day5;

public class ConstructorlectureNew2 {
	int emid;
	String name;
	ConstructorlectureNew2(int emid , String name){
		this.emid = emid;
		this.name= name;
		System.out.println("the employe id is "+emid+" and the name is "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorlectureNew2 obj = new ConstructorlectureNew2(1,"Manas");
		System.out.println("the employe id is "+obj.emid+" and the name is "+obj.name);

	}

}
