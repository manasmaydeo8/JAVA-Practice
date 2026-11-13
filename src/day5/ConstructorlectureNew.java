package day5;

public class ConstructorlectureNew {
	int emid;
	String name;
	ConstructorlectureNew(int emid , String name){
		this.emid = emid;
		this.name= name;
		System.out.println("the employe id is "+emid+" and the name is "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorlectureNew obj = new ConstructorlectureNew(1,"Manas");
		System.out.println("the employe id is "+obj.emid+" and the name is "+obj.name);

	}

}
