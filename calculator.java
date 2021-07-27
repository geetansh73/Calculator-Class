class calculation
{
int x,y;
calculation(int a,int b)
{
x=a;
y=b;
}
void Addition()
{
System.out.print("Sum:"+(x+y));
}
void Substraction()
{
System.out.print("Sub:"+(x-y));
}
}
class Mycalculation extends calculation
{
Mycalculation(int a,int b)
{
super(a,b);
}
void Multiplication()
{
System.out.print("mul"+(x*y));
}
}
class Calculator
{
public static void main(String geetansh[])
{
Mycalculation cal=new Mycalculation(10,50);
cal.Addition();
cal.Substraction();
cal.Multiplication();
}
}
