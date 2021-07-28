class UnaryOperatorDemo{  

public static void main(String[] args) {

	int a =1;
	int b = ++a;
System.out.println(a);  //1

	int x=10;
	++x;
System.out.println(x);//2
		
	int y=10;
	++y;
	y++;
System.out.println(y);//3
	
	int z=10;
	z++;
System.out.println(z);//4

	int c=10;
	++c;
System.out.println(c++);
System.out.println(c);//5

	int d= 100;
	int e= d++;
	++d;
	++e;
System.out.println(++d);
System.out.println(e++);//6

	int m=1000;
	m++;
	int n=m;
System.out.println(++m);//7
System.out.println(++n);
System.out.println(n);

	int p=1000;
	p++;
	int q=p;
System.out.println(q++);//8
System.out.println(q);

	int r= 500;//assignment
	int s= 600;
	int t=(++r) + s;
System.out.println(r++);
System.out.println(r+s);
System.out.println((++s) + t);
System.out.println(r);
System.out.println(s);
System.out.println(t);

}	
}
