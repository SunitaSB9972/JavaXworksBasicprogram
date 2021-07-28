class ObjectArithmaticOperatorDemo{

int a;
int b;
int x;
int y;
int p,q,r,s,t,u;

void add(){
System.out.println(p);
System.out.println(q);	
}

	void sub(){
	
System.out.println(r);		
}

	void mul(){
System.out.println(s);
		
}

	void div(){
System.out.println(t);
	
	
}
	void module() {
System.out.println(u);
 }
	
public static void main(String arg[]){

ObjectArithmaticOperatorDemo addResult1=new ObjectArithmaticOperatorDemo();
	addResult1.int a = 10; 
	addResult1.int b = 20;
addResult1.int p =a+b;//
	addResult1.add();


       
ObjectArithmaticOperatorDemo addResult2=new ObjectArithmaticOperatorDemo();
	addResult2.int a = 40; 
	addResult2.int b = 20;
addResult2.int q =a+b;
	addResult2.add();


ObjectArithmaticOperatorDemo subResult=new ObjectArithmaticOperatorDemo();
	subResult.int a = 20; 
	subResult.int b = 10;
subResult.int r=a-b;
	subResult.sub();
	

ObjectArithmaticOperatorDemo mulResult=new ObjectArithmaticOperatorDemo();
	mulResult.int a = 10; 
	mulResult.int b = 20;
mulResult.s=a*b;
	mulResult.mul();
	

ObjectArithmaticOperatorDemo divResult=new ObjectArithmaticOperatorDemo();
	divResult.int a = 20; 
	divResult.int b = 2;
divResult.int t=a/b;
	divResult.div();

	
ObjectArithmaticOperatorDemo moduleres=new ObjectArithmaticOperatorDemo();
	moduleres.int x = 3; 
	moduleres.int y = 10;
moduleres.int u=x%y;
	moduleres.module();
	
}	}
}