package JavaFundamentals;

public class DataTypes {

	public static void main(String[] args) {
		//byteDataType();
		
		//shortDataType();
		
		//intDataType();
		
		//longDataType();
		
		floatDataType();
		
		
		
	}
	
	static void byteDataType()
	{
		byte b=10;
		//byte b=127;
		//byte b=128;
		//byte b=10.5;
		//byte b=true;
		//byte b="durga";
		System.out.println("Byte Values : "+b);
	}
	
	static void shortDataType()
	{
		short s=10;
		//short s=32767;
		//short s=32768;
		//short s=true;
		//short s=10.5;
		//sort s="durga";
		System.out.println("Short Values : "+s);
		
	}
	
	 static void intDataType()
	 {
		 int x=2147483647;
		 //int x=2147483648;
		 //int x=2147483648l;
		 //int x=true;
		 
		 System.out.println(x);
		 
	 }
	 
	 static void longDataType()
	 {
		 long l = 92220367;
		 //long l = 9223372036854775808l;
		 System.out.println(l);
	 }
	 
	 static void floatDataType()
	 {
		 //float f=10.5;
		 float f=10.50505050505605f;
		 //float f=10;
		 System.out.println(f);
	 }
	 
}