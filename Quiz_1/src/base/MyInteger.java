package base;


import base.MyInteger;

public class MyInteger {

	int iValue;
	
	//constructor that creates a MyInteger for iValue
	public MyInteger(int newiValue){
		
	}
	
	//get method that returns iValue
	public int getiValue(){
		return iValue;
				
	}
	
	//Returns true if even
	
	public boolean Even() {
		if(iValue %2==0)
			return true;
		return false;
					
	}
	
	// Returns true if odd
	
	public boolean Odd() {
		if (iValue %2==1)
			return true;
		return false;
	}
	
	//Returns true if prime
	
	public boolean Prime(){
		int i=0;
				for(i=2; i<=iValue/2; i++){
					if(iValue % i!=0)
						return true;
	}
	return false;
	}
	
	//Static- Even
	
	public static boolean Even_(int iValue){
		if(iValue %2==0)
			return true;
		return false;
	}
	
	//Static- Odd
	public static boolean Odd_(int iValue) {
		if(iValue%2 !=0)
			return true;
		return false;
	}
	
	//Static- Prime
	public static boolean Prime_(int iValue){
		return Prime_(iValue);
		
	}
	
	//Static MyInteger- Even
	public static boolean Even1(MyInteger Myinteger){
		return MyInteger.Even_(Myinteger.getiValue());
		
	}
	
	//Static MyInteger- Odd
	public static boolean Odd1(MyInteger Myinteger){
		return MyInteger.Odd_(Myinteger.getiValue());
	}
	
	
// add myinteger Prime
	public static boolean Prime_(MyInteger myInteger){
		return MyInteger.Prime_(myInteger.getiValue());
		
	}
	
	
	//equals(int) method
	public boolean equals(int intValue){
		return iValue==intValue;
	}
	
	//equals(myInteger) method
	public boolean equals(MyInteger Myinteger){
		return equals(Myinteger.getiValue());
	}
	
	
	
	
	
}
