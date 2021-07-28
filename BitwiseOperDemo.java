class BitwiseOperDemo{
public static void main (String[] args){

int a = 10;
int b = 20;

System.out.println(a>b && ++a>b);//false
System.out.println(a);//10avalue will not be incremented bcs in logica and oprn java will not consider 2nd cond if it is fals
System.out.println(b);//20

System.out.println(a>b & ++a>b);//false
System.out.println(a);//11 in bitwise all conditions will be ivaluated irrespective of 1st condition true or not
System.out.println(b);//20

System.out.println(a<b || ++a>b);//false
System.out.println(a);//11 value will be incremented bcs in logica or oprn java will check true if 1st cond is true
System.out.println(b);//20

System.out.println(a<b | ++a>b);//false
System.out.println(a);//12 in bitwise all conditions will be ivaluated irrespective of 1st condition true or not
System.out.println(b);//20
}
}