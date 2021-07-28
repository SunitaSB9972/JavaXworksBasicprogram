class ArithmaticOperatorDemostatic{

static int add(int a,int b){
	int addResult =a+b;//local variables
	return addResult;
}

static int sub(int a,int b){
	int subResult=a-b;
	return subResult;
}

static int mul(int a,int b){
		int mulResult=a*b;
		return mulResult;
}



static int div(int a,int b){
	int divResult=a/b;
	return divResult;
}
static int module(int x, int y) {
        int moduleres=x%y;
        return moduleres;
}
	
public static void main(String [] arg){
	int addResult1=add(10,20);// instance variables
	System.out.println("addResult1 :"+addResult1);

        int addResult2=add(40,20);// instance variables
	System.out.println("addResult2 :"+addResult2);  

	int subResult=sub(60,20);
	System.out.println("subResult :"+subResult);	
	
	int mulResult=mul(10,20);
	System.out.println("mulResult :"+mulResult);
	
	int divResult=div(40,20);
	System.out.println("divResult :"+divResult);
	
	int moduleres=module(10,3);
	System.out.println("moduleres:"+ moduleres);
	
	}

}