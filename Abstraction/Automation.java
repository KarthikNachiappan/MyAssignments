package Abstraction;

public class Automation extends MultipleLanguage {
		
		public void ruby() {
			System.out.println("Ruby");
		}

		public void java() {
			System.out.println("Java");
		}

		public void selenium() {
			System.out.println("Selenium");
		}

			public static void main(String[] args) {
					Automation auto=new Automation();
					auto.ruby();
					auto.selenium();
					auto.python();
					auto.java();

			}
	
}
