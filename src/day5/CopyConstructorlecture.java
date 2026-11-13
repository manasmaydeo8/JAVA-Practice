package day5;

public class CopyConstructorlecture {
	int emid;
	String name;
	CopyConstructorlecture(int emid , String name){
		this.emid = emid;
		this.name= name;
		System.out.println("the employe id is "+emid+" and the name is "+name);
	}
	CopyConstructorlecture(CopyConstructorlecture manas){
		emid = manas.emid;
		name = manas.name;
		System.out.println("the employe id is "+emid+" and the name is "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructorlecture obj1 = new CopyConstructorlecture(1 ,"Manas");
		CopyConstructorlecture obj2 = new CopyConstructorlecture(obj1);

	}

}
  