public class HelloWorld{


     public static void main(String []args){
        A a = new A(5);
        initilizeI(a);
        System.out.println("I:" + a.x);
        
     }
     
     public static void initilizeI(A a){         
         a.x = 4;
     }
}

class A {
	int x;
	
	public A(int y) {
		this.x = y;
	}
}

