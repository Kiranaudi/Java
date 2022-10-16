import java.util.Scanner;

public class Booking {
	
    static int[] a=new int[4];
    static int[] b=new int[4];
    static int[] c=new int[4];
    static int[] d=new int[4];
	public static void main(String[] args) {
		Booking b = new Booking();
		b.Scan();
	}

	private void doctorPediatrics() {
		
		System.out.println("enter the date of appointment for next 4 days and enter 0 for exit and 100 for main menu");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		int i;
		switch (b) {
		case 1:
			 i = b;
			if (a[i-1] == 1) {
				System.out.println("no appointment available");
				doctorPediatrics();
			} else {
				a[i-1] = b;
				System.out.println("successfully booked");
				doctorPediatrics();
			}

			break;
		case 2:
			int j = b;
			if (a[j-1] == 2) {
				System.out.println("no appointment available");
				doctorPediatrics();
			} else {
				a[j-1] = b;
				System.out.println("successfully booked");
				doctorPediatrics();
			}
			break;
		case 3:
			int k = b;
			if (a[k-1] == 3) {
				System.out.println("no appointment available");
				doctorPediatrics();
			} else {
				a[k-1] = b;
				System.out.println("successfully booked");
				doctorPediatrics();
			}
			break;
		case 4:
			int l = b;
			if (a[l-1] == 4) {
				System.out.println("no appointment available");
				doctorPediatrics();
			} else {
				a[l-1] = b;
				System.out.println("successfully booked");
				doctorPediatrics();
			}
			break;
		case 0: System.exit(0);
		case 100:Scan();
		break;
		default:
			System.out.println("enter correct number");
			break;
		}
		s.close();
	}

	private void doctorDermatology() {
		
		System.out.println("enter the date of appointment for next 4 days and enter 0 for exit and 100 for main menu");
		Scanner s = new Scanner(System.in);
		int g = s.nextInt();
		switch (g) {
		case 1:
			int i = g;
			if (b[i-1] == 1) {
				System.out.println("no appointment available");
				doctorDermatology();
			} else {
				b[i-1] = g;
				System.out.println("successfully booked");
				doctorDermatology();
			}

			break;
		case 2:
			int j = g;
			if (b[j-1] == 2) {
				System.out.println("no appointment available");
				doctorDermatology();
			} else {
				b[j-1] = g;
				System.out.println("successfully booked");
				doctorDermatology();
			}
			break;
		case 3:
			int k = g;
			if (b[k-1] == 3) {
				System.out.println("no appointment available");
				doctorDermatology();
			} else {
				b[k-1] = g;
				System.out.println("successfully booked");
				doctorDermatology();
			}
			break;
		case 4:
			int l = g;
			if (b[l-1] == 4) {
				System.out.println("no appointment available");
				doctorDermatology();
			} else {
				b[l-1] = g;
				System.out.println("successfully booked");
				doctorDermatology();
			}
			break;
		case 0:System.exit(0);
		case 100:Scan();
		break;
		default:
			System.out.println("enter correct number");
			break;
		}
		s.close();

	}

	private void doctorNephrology() {
		
		System.out.println("enter the date of appointment for next 4 days and enter 0 for exit and 100 for main menu");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		switch (b) {
		case 1:
			int i = b;
			if (c[i-1] == 1) {
				System.out.println("no appointment available");
				doctorNephrology();
			} else {
				c[i-1] = b;
				System.out.println("successfully booked");
				doctorNephrology();
			}

			break;
		case 2:
			int j = b;
			if (c[j-1] == 2) {
				System.out.println("no appointment available");
				doctorNephrology();
			} else {
				a[j-1] = b;
				System.out.println("successfully booked");
				doctorNephrology();
			}
			break;
		case 3:
			int k = b;
			if (a[k-1] == 3) {
				System.out.println("no appointment available");
				doctorNephrology();
			} else {
				c[k-1] = b;
				doctorNephrology();
			}
			break;
		case 4:
			int l = b;
			if (c[l-1] == 4) {
				System.out.println("no appointment available");
				doctorNephrology();
			} else {
				c[l-1] = b;
				System.out.println("successfully booked");
				doctorNephrology();
			}
			break;
		case 0:System.exit(0);
		case 100:Scan();
		break;
		default:
			System.out.println("enter correct number");
			break;
		}
		s.close();

	}

	private void doctorEnt() {
		
		System.out.println("enter the date of appointment for next 4 days and enter 0 for exit and 100 for main menu");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		switch (b) {
		case 1:
			int i = b;
			if (d[i-1] == 1) {
				System.out.println("no appointment available");
				doctorEnt();
			} else {
				d[i-1] = b;
				System.out.println("successfully booked");
				doctorEnt();
			}

			break;
		case 2:
			int j = b;
			if (d[j-1] == 2) {
				System.out.println("no appointment available");
				doctorEnt();
			} else {
				d[j-1] = b;
				System.out.println("successfully booked");
				doctorEnt();
			}
			break;
		case 3:
			int k = b;
			if (d[k-1] == 3) {
				System.out.println("no appointment available");
				doctorEnt();
			} else {
				d[k-1] = b;
				System.out.println("successfully booked");
				doctorEnt();
			}
			break;
		case 4:
			int l = b;
			if (d[l-1] == 4) {
				System.out.println("no appointment available");
				doctorEnt();
			} else {
				d[l-1] = b;
				System.out.println("successfully booked");
				doctorEnt();
			}
			break;
		case 0:System.exit(0);
		case 100:Scan();
		break;
		default:
			System.out.println("enter correct number");
			break;
		}
		s.close();

	}
	public void Scan() {
		System.out.println(
				"enter 1 for doctorEnt, 2 for doctorNephrology,3 for doctorDermatology,4 for doctorPediatrics");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		switch (a) {
		case 1:

			doctorEnt();

			break;
		case 2:
			doctorNephrology();
			break;
		case 3:
			doctorDermatology();
			break;
		case 4:
			doctorPediatrics();
			break;
		default:
			System.out.println("enter correct number");
			break;
		}
		s.close();

	}



}
