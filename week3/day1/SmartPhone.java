package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsapp() {
		System.out.println("connect whatsapp");
	}
	
	public void takeVideo() {
		System.out.println("Take video in smartphone");
	}
	
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.connectWhatsapp();
		phone.takeVideo();
		phone.sendMsg();
		phone.makeCall();
		phone.saveContact();
		
		
	}

}
