package base;

import static java.lang.Math.*;
import org.junit.Assert.*;

public class MyInteger {

	int iValue;

	// Construct a object
	MyInteger() {
	}

	// Construct a MyInteger object
	MyInteger(int iValue) {
		this.iValue = iValue;
	}

	// Return the iValue
	public int getiValue() {
		return iValue;
	}

	// Setter
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	// Methods for Even numbers
	// isEven() method
	public boolean isEven() {
		return isEven(this);
	}

	// isEven(int) method
	public static boolean isEven(int inum) {
		return (inum % 2 == 0);
	}

	// isEven(MyInteger) method
	public static boolean isEven(MyInteger inum) {
		int num = inum.getiValue();
		return (num % 2 == 0);
	}
	// Methods for Odd numbers

	// isOdd()
	public boolean isOdd() {
		return isOdd(this);
	}

	// isOdd(int) method
	public static boolean isOdd(int inum) {
		return (inum % 2 != 0);
	}

	// isOdd(MyInteger)
	public static boolean isOdd(MyInteger inum) {
		int num = inum.getiValue();
		return (num % 2 != 0);
	}

	// Methods for Prime numbers

	// isPrime() method- Refers to the MyInteger class
	public boolean isPrime() {
		return isPrime(this);
	}

	// isPrime(int) method
	public static boolean isPrime(int inum) {
		int num = inum;
		if (num < 2)
			return false; // All integers less than 2 aren't Prime numbers
		else if (num == 2)
			return true; // If the integer is 2, it's a Prime number
		else if (num % 2 == 0)
			return false; // If the integer is divisible by 2 (even), it's not
							// Prime
		for (int i = 3; i * i <= num; i += 2) // Prime numbers are all odd
												// numbers except for 2.
			if (num % i == 0)
				return false; // If the given integer is divisible by any odd
								// number less than itself, it's a Prime number.
		return true;
	}

	// isPrime(MyInteger) method
	public static boolean isPrime(MyInteger inum) {
		int num = inum.getiValue();
		if (num < 2)
			return false; // All integers less than 2 aren't Prime numbers
		else if (num == 2)
			return true; // If the integer is 2, it's a Prime number
		else if (num % 2 == 0)
			return false; // If the integer is divisible by 2 (even), it's not
							// Prime
		for (int i = 3; i * i <= num; i += 2) // Prime numbers are all odd
												// numbers except for 2.
			if (num % i == 0)
				return false; // If the given integer is divisible by any odd
								// number less than itself, it's a Prime number.
		return true;
	}

	public boolean equals(int otherValue) {
		return this.iValue == otherValue;
		
	}

	public boolean equals(MyInteger other) {
		int iother=other.getiValue();
		if (this.iValue == iother);
			return true;
		
	}

	// Main Method
	public static void main(String[] args) {
		MyInteger iValue = new MyInteger(8);
		System.out.println(iValue.isEven());
		System.out.println(MyInteger.isEven(10));

		System.out.println(iValue.getiValue());
		iValue.setiValue(100);
		System.out.println(iValue.getiValue());
		
	}

}
