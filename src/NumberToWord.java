import java.util.*;
public class NumberToWord {
	static Map<Long, String> map1 = new HashMap<Long, String>();

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    Long num = s.nextLong();
	    print(num, num.toString().length());
	    s.close();
	}

	private static void print(Long num, int length) {
	    if (length == 0) {
	        System.out.println("Enter correct number");
	    } else if (length == 1 || num <= 9) {
	        printOneDigit(num);
	    } else if (length == 2 || num <= 99) {
	        printTwoDigit(num);
	    } else if (length == 3 || num <= 999) {
	        printThreeDigit(num);
	    } else if (length == 4 || num <= 9999) {
	        printFourDigit(num);
	    } else if (length == 5 && num <= 99999) {
	        printFiveDigit(num);
	    } else if (length == 6 || num <= 999999) {
	        printSixDigit(num);
	    } else if (length == 7 || num <= 9999999) {
	        printSevenDigit(num);
	    } else if (length == 7 || num <= 99999999) {
	        printEightDigit(num);
	    } else
	        System.out.println("Number is not valid....!!!!!");
	}

	private static void printOneDigit(Long num) {
	    System.out.print(map1.get(num) != null ? map1.get(num) : "" + " ");
	}

	private static void printTwoDigit(Long num) {
	    if (num % 10 == 0)
	        System.out.print(map1.get(num) + "");
	    else if (num < 20) {
	        System.out.print(map1.get(num) + " ");
	    } else {
	        System.out.print(map1.get(num - num % 10) != null ? map1.get(num - num % 10) : "");
	        System.out.print(" ");
	        printOneDigit(num % 10);
	    }
	}

	private static void printThreeDigit(Long num) {
	    if (num % 10 == 0 && num % 100 == 0)
	        System.out.print(map1.get(num / 100) + " HUNDRED");
	    else {
	        System.out.print(map1.get(num / 100) + " HUNDRED ");
	        print(num % 100, 2);
	    }
	}

	private static void printFourDigit(Long num) {
	    if (num % 10 == 0 && num % 100 == 0 && num % 1000 == 0)
	        System.out.print(map1.get(num / 1000) + " THOUSAND ");
	    else {
	        System.out.print(map1.get(num / 1000) + " THOUSAND ");
	        print(num % 1000, 3);
	    }
	}

	private static void printFiveDigit(Long num) {
	    if (num / 1000 > 0) {
	        printTwoDigit(num / 1000);
	        System.out.print(" THOUSAND ");
	    }
	    if ((num % 1000) > 99) {
	        printThreeDigit(num % 1000);
	    } else if ((num % 1000) > 9) {
	        printTwoDigit(num % 100);
	    } else if (num % 10 > 0) {
	        printOneDigit(num % 10);
	    }
	}

	private static void printSixDigit(Long num) {
	    if (num / 100000 > 0) {
	        printOneDigit(num / 100000);
	        System.out.print(" LACK ");
	    }
	    if (num > 0)
	        printFiveDigit(num % 100000);
	}

	private static void printSevenDigit(Long num) {
	    if (num / 100000 > 0) {
	        printTwoDigit(num / 100000);
	        System.out.print(" LACK ");
	    }
	    if (num % 100000 > 9999) {
	        printFiveDigit(num % 100000);
	    } else if ((num % 10000) > 999) {
	        printFourDigit(num % 10000);
	    } else if ((num % 1000) > 99) {
	        printThreeDigit(num % 1000);
	    } else if ((num % 1000) > 9) {
	        printTwoDigit(num % 100);
	    } else if (num % 10 > 0) {
	        printOneDigit(num % 10);
	    }
	}

	private static void printEightDigit(Long num) {
	    printOneDigit(num / 10000000);
	    System.out.print(" CRORE ");
	    if (num > 0)
	        printSevenDigit(num % 10000000);
	}

	static {
	    map1.put(0L, "");
	    map1.put(1L, "ONE");
	    map1.put(2L, "TWO");
	    map1.put(3L, "THREE");
	    map1.put(4L, "FOUR");
	    map1.put(5L, "FIVE");
	    map1.put(6L, "SIX");
	    map1.put(7L, "SEVEN");
	    map1.put(8L, "EIGHT");
	    map1.put(9L, "NINE");
	    map1.put(10L, "TEN");
	    map1.put(11L, "ELEVEN");
	    map1.put(12L, "TWELVE");
	    map1.put(13L, "THIRTEEN");
	    map1.put(14L, "FOURTEEN");
	    map1.put(15L, "FIFTEEN");
	    map1.put(16L, "SIXTEEN");
	    map1.put(17L, "SEVENTEEN");
	    map1.put(18L, "EIGHTEEN");
	    map1.put(19L, "NINTEEN");
	    map1.put(20L, "TWINITY");
	    map1.put(30L, "THIRTY");
	    map1.put(40L, "FOURTY");
	    map1.put(50L, "FIFTY");
	    map1.put(60L, "SIXTY");
	    map1.put(70L, "SEVENTY");
	    map1.put(80L, "EIGHTY");
	    map1.put(90L, "NINTY");
	}
}
