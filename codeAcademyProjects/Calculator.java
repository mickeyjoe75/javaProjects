//this is s simple Java calculator for doing the basic arithametic operations

public class Calculator{
int a;
int b;


  public Calculator(){
    a = a;
    b = b;

  }

  public int add(int a,int b){
    return a + b;
  }

  public int subtract(int a,int b){
    return a - b;
  }

  public int multiply(int a,int b){
    return a * b;
  }

  public double divide(double a,double b){
    if (b != 0){
      return (a / b);
    }
    else{
      System.out.println("Error! You cannot divide a number by zero!");
      return 0;
    }
  }

  public int modulo(int a,int b){
    if (b == 0){
      System.out.println("Error! Divison by Zero is not allowed!");
      return 0;
    }
    else{
      return (a % b);
    }

  }

  public static void main(String[] args){

    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(14640,45454));
    System.out.println(myCalculator.divide(45,0));

  }

}
