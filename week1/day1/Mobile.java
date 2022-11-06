package week1.day1;

public class Mobile {

	public void makeCall() {

		System.out.println("Make a call");

	}

	public void sendMsg() {

		System.out.println("Send Msg");
	}

	public static void Main(String[] args) {

		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();

	}

}
