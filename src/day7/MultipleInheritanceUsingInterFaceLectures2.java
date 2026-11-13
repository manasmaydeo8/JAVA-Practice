package day7;

interface Class1{
	void takephoto();
}

interface Class2{
	void takeVideo();
}

class SmartPhone implements Class1, Class2{
	public void tackephoto() {
		System.out.println("Take photo");
	}
	
	public void tackeVideo() {
		System.out.println("Take Video");
	}

	@Override
	public void takeVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		
	}
}

public class MultipleInheritanceUsingInterFaceLectures2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone obj = new SmartPhone();
		obj.tackephoto();
		obj.tackeVideo();
	}

}
