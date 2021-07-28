class Student11{
String name;
String branch;
int usn;
void write()
{
System.out.println(name+" is from "+ branch + "branch" + " and usn is" + " " + usn);
}
public static void main(String args[])
{
Student11 student1= new Student11();

student1.name= "pooja";
student1.branch= "electronicsANDcommunication";
student1.usn = 22;
student1.write();

Student11 student2= new Student11();
student2.name= "geeta";
student2.branch= "computerScience";
student2.usn = 23;
student2.write();

Student11 student3= new Student11();
student3.name= "santosh";
student3.branch= "mechanicalEngineering";
student3.usn = 24;
student3.write();

Student11 student4= new Student11();
student4.name= "Rohini";
student4.branch= "informationScience";
student4.usn = 30;
student4.write();

Student11 student5= new Student11();
student5.name= "Rohit";
student5.branch= "civilEngineering";
student5.usn = 10;
student5.write();
}
}