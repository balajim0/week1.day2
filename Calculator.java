package week1.day2;

public class Calculator {
public int add(int num1, int num2, int num3)
{
return num1+num2+num3;
}
public int sub(int num1, int num2)
{
return num1-num2;
}
public double mul(double num1, double num2)
{
return num1*num2;
}
public float div(float num1, float num2)
{
return num1/num2;
}
public static void main(String[] args) {
Calculator obj = new Calculator();

int addition = obj.add(2, 3, 5);
System.out.println(addition);

int subtraction = obj.sub(2, 5);
System.out.println(subtraction);

double multiply = obj.mul(2.5, 5);
System.out.println(multiply);

float division = obj.div(2, 10);
System.out.println(division);
}
}
