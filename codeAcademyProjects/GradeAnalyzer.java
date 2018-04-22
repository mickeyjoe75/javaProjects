import java.util.ArrayList;
import java.util.Collections;
//A simple Java program to analyze the grdes in class room using the ArrayList funtions in Java, it calculates the Average, and min and max scores...
public class GradeAnalyzer{

  public GradeAnalyzer(){

  }

  public int getAverage(ArrayList <Integer> grades) {

    if (grades.size() < 1 ){
      System.out.println("The ArrayList is Empty!");
      return 0;
    }
    else{
      int sum = 0;
      for(Integer grade : grades ){
        sum += grade;
      }
      int average = sum/grades.size();
      System.out.println(average);
      return average;
    }
  }
  public int getHighestGrade(ArrayList <Integer> grades) {

    if (grades.size() < 1 ){
      System.out.println("The ArrayList is Empty!");
      return 0;
    }
    else{
      int maxGrade = 0;
      for(Integer grade : grades ){
        maxGrade = Collections.max(grades);
      }
      System.out.println(maxGrade);
      return maxGrade;
    }
  }

  public int getLowestGrade(ArrayList <Integer> grades) {

    if (grades.size() < 1 ){
      System.out.println("The ArrayList is Empty!");
      return 0;
    }
    else{
      int lowGrade = 0;
      for(Integer grade : grades ){
        lowGrade = Collections.min(grades);
      }
      System.out.println(lowGrade);
      return lowGrade;
    }
  }

  public static void main(String[] args){

    ArrayList <Integer> myClassRoom = new ArrayList <Integer>();
    myClassRoom.add(98);
    myClassRoom.add(92);
    myClassRoom.add(88);
    myClassRoom.add(75);
    myClassRoom.add(61);
    myClassRoom.add(89);
    myClassRoom.add(95);

    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassRoom);
    myAnalyzer.getHighestGrade(myClassRoom);
    myAnalyzer.getLowestGrade(myClassRoom);
  }

}
