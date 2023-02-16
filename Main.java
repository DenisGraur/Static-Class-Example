import java.util.*;


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		// create an object of the static nested class
       // using the name of the outer class:
       
       Class1.InnerClass1 obj1 = new Class1.InnerClass1();
	   obj1.method1();
	}
}


// outer class:

class Class1 {
    
    // static class:
    static class InnerClass1{
        int var1 = 10;
        int var2 = 20;
        public void  method1(){
            System.out.println(var1 + var2);
        }
    }
}
