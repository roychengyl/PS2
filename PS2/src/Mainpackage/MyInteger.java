package Mainpackage;

public class MyInteger {
		
//•	An int data field named value that stores the int value represented by this object.
		
		private int value;
//		•	A constructor that creates a MyInteger object for the specified int value.
		
		private MyInteger(int num){
			value = num;
		}
//		•	A get method that returns the int value.
		
		private int get(){
			return value;
		}
		
//		•	Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime, respectively.
		private boolean isEven(){
			if (value%2==0)
				return true;
			else
				return false;
			
		}
		
		private boolean isOdd(){
			if (value%2==0)
				return false;
			else
				return true;
			
		}
		
		private boolean isPrime(){
			if (value % 2 == 0) return false;
	        for (int i = 3; i * i < value; i += 2)
	            if (value % i == 0) return false;
	        return true;
	    }
		
//		•	Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
		
		public static boolean isEven(int value){
			if (value%2==0)
				return true;
			else
				return false;
		}
		
		public static boolean isOdd(int value){
			if (value%2==0)
				return false;
			else
				return true;
			
		}
		
		public static boolean isPrime(int value){
			if (value % 2 == 0) return false;
	        for (int i = 3; i * i < value; i += 2)
	            if (value % i == 0) return false;
	        return true;
		}
		
		
		
//		•	Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
		
		public static boolean isEven(MyInteger number){
			if (number.get()%2==0)
				return true;
			else
				return false;
		}
		
		public static boolean isOdd(MyInteger number){
			if (number.get()%2==0)
				return false;
			else
				return true;
		}
		
		public static boolean isPrime(MyInteger number){
			if (number.get() % 2 == 0) return false;
	        for (int i = 3; i * i < number.get(); i += 2)
	            if (number.get() % i == 0) return false;
	        return true;
		}
		
		
//		•	Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
		
		private boolean equals(int number){
			if (number == value)
				return true;
			else 
					return false;
			
		}
		
		private boolean equals(MyInteger number){
			if (number.get() == value)
				return true;
			else 
					return false;
		}
		
//		•	A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
		
		public static int parseInt(char[] list){
			return parseInt(new String(list));
		}
//		•	A static method parseInt(String) that converts a string into an int value. 
		
		public static int parseInt(String list){
			return Integer.parseInt(list);
		}
//		•	Class should be encapsulated.
//		•	Use ObjectAID to create a class diagram for your new class.
		
		public static void main(String[] args) {
			MyInteger int1 = new MyInteger(5);
			System.out.println(int1.get());
			System.out.println(int1.isEven());
			System.out.println(int1.isOdd());
			System.out.println(int1.isPrime());
			

			System.out.println("is 5 even? " + isEven(5));
			System.out.println(isOdd(5));
			System.out.println(isPrime(5));
			
			System.out.println("static method2" + isEven(int1));
			System.out.println(isOdd(int1));
			System.out.println(isPrime(int1));
			
			char[] chars = {'1', '2', '3', '4','5','6','7'};
			System.out.println(MyInteger.parseInt(chars));
			
			String s = "123454321";
	        System.out.println(MyInteger.parseInt(s));
		}

	}

