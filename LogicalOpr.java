class LogicalOpr{
public static void main (String[] args){

int a = 10;

int b = 20;

boolean result1 = a<b; //true
boolean result2 = a==b; //false




System.out.println(result1 || result2 );  //a<b || a==b

System.out.println(a>b || a==b );

System.out.println(a>b && a==b );
System.out.println(a<b && a!=b );

System.out.println((a<b && a!=b )&&(a<b || a==b));

System.out.println ((a<b && a!=b )||(a>b && a==b ));
}
}