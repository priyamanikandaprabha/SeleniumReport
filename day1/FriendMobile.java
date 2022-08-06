package week1.day1;

public class FriendMobile {
	public void takePhoto() {
		System.out.println("takePhoto");
	}

	public static void main(String[] args) {
		LearnMobileMethods call =new LearnMobileMethods();
		System.out.println(call.brandName);
		FriendMobile own=new FriendMobile();
		own.takePhoto();

}

	public void makeTransaction() {
		// TODO Auto-generated method stub
		System.out.println("makeTransaction");
	}
}