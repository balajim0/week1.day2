package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
Calculator obj = new Calculator();

int addition = obj.add(10, 3, 5);
System.out.println(addition);

int subtraction = obj.sub(2, 8);
System.out.println(subtraction);

double multiply = obj.mul(7.5, 5);
System.out.println(multiply);

float division = obj.div(2, 100);
System.out.println(division);
}



}