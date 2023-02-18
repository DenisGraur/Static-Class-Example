import java.util.*;

import javax.print.event.PrintJobListener;


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		// create an object of the static nested class
       // using the name of the outer class:
       
       Class1.StaticClass1 obj1 = new Class1.StaticClass1();
	   obj1.method1();

       // create an object of the outer class:
       Class1 obj2 = new Class1();
        // create an object of the inner classs using the outer class:
       Class1.InnerClass1 obj3 = obj2.new InnerClass1();
       obj3.method2(); 
	}
}


// outer class:

class Class1 {
    
    // static class:
    static class StaticClass1{
        int var1 = 10;
        int var2 = 20;
        public void  method1(){
            System.out.println(var1 + var2);
            System.out.println("this is method1 from the static class");
        }
    }

    // inner class:
    class InnerClass1{
        public void method2(){
            System.out.println("This is method 2 from the non-static inner class");
        }
    }
}
