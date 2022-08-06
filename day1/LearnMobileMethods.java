package week1.day1;

public class LearnMobileMethods
{
//instance/global variable	
	String brandName= "Samsung";
	int price=32000;
	long phNo=98451154161l;
	boolean buyMobile=false;
	
	public void  makeCalls() 
	{

		System.out.println("makeCalls");
	}
	public long  typeMessage() 
	{

		System.out.println("typeMessage");
		return phNo;
	}
	public static void main(String[] args) {
		LearnMobileMethods obj =new LearnMobileMethods();
		String brandName2=obj.brandName;
		System.out.println(brandName2);
	    obj.typeMessage();
}
	public void takePicture() {

		System.out.println("takePicture");
		
	}

}
