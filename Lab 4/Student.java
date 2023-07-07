// ************************************************************ 
// Student.java 
// 
// Define a student class that stores name, score on test 1, and 
// score on test 2.  Methods prompt for and read in grades, 
// compute the average, and return a string containing student's info. 
// ************************************************************ 
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private float test1 , test2;
// ---------------------------------------------  
//constructor 
// ---------------------------------------------  
    public Student(String studentName)
    {
    name = studentName;
    }
    // ---------------------------------------------
//inputGrades: prompt for and read in student's grades for test1 and test2.

//Use name in prompts, e.g., "Enter's Joe's score for test1". 
// ---------------------------------------------  
    public void inputGrades()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input " + name + "'s score for test 1: " );
        test1 = scan.nextFloat();
        System.out.println("Please input " + name + "'s score for test 2: " );
        test2 = scan.nextFloat();
    }
    // ---------------------------------------------
//getAverage: compute and return the student's test average 
// ---------------------------------------------  
    public Float getAverage()
    {
    Float average = (test1 + test2)/2 ;
    return average;
    }
    // ---------------------------------------------
//getName: print the student's name 
// ---------------------------------------------  
    public String getName()
    {
    return name;
    }

    public String toString(){
        String result = "Name: " + name + " Test 1: " + test1 + " Test 2: " + test2 + " Average: " + getAverage() + "\n";
        return result;
    }
} 