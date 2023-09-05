package io.github.datatype;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		char c = 'A';
		char ad = '\u0000';
		byte b = 127;;
		short s = 32767;
		long ld = 0L;
		int i = 2_147_483_647;
		float f = 5.123451f;
		float fd = 0.0f;
		float fi = Float.intBitsToFloat((int) 0xff7fffff);
		double d = 1.7976931348623157E308d;
		double dd = 0.0d;
		boolean bd = false;
		
		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;
		
		double d1 = 123.4;
		// same value as d1, but in scientific notation
		double d2 = 1.234e2;
		float f1  = 123.4f;

		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		
		System.out.println("char :      " + c );
		System.out.println("int :         " + i );
		System.out.println("float :      " + f );
		System.out.println("double :  " + d );
		System.out.println("boolean : " + bd );
		System.out.println("pi :           " + pi );
		
	}

}
