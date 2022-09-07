package java.util;
public class AnonymousClass {
		public static void main(String[] args) {
		Audi a= new Audi() {
			
			@Override
			public void hell() {
				System.out.println("hii");
				
			}
		};
		Abstract b=new Abstract() {
			
			@Override
			public void hell() {
				System.out.println("kjh");
				
			}
		};
		a.hell();
		b.hell();
		}
}
