// by Sam Dunny

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FinalGradeCalculator {
    
    //variables for every grade type
    public static int labGrade = 0,
                      labReportGrade= 0,
                      homeworkGrade = 0, 
                      exam1Grade = 0, 
                      exam2Grade = 0, 
                      finalExamGrade = 0;
    
    //variables for amounts of each assignment
    public static int labTot = 0, 
 		              labReportTot= 0,
 		              homeworkTot = 0;
    
    //letter grade variable	   
    public static String grade = "";
    
    //current item being graded variable
    public static String currentGrading = "";
    
    public static void main(String args[]) {
        
        // have to use try/catch for file exceptions
        try {
            //creating scanner to get user input
			String filename;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter file name: \n");
			filename = keyboard.nextLine().trim();
			       
			//create scanner to read files
			Scanner scanner = new Scanner(new File(filename));
	        String line;
	           
	        //loops through file line by line until there are no more lines
	        while (scanner.hasNextLine()) {
                //scans next line
                line = scanner.nextLine();
                
                //remove white space on either side of line
                line = line.trim();
	               
	            //check header of exam type and update currentExam status
	            if (line.equals("LABS"))
	                   currentGrading = "LABS";
	            else if (line.equals("LAB REPORTS"))
	               	   currentGrading = "LAB REPORTS";
	            else if (line.equals("HOMEWORK")) 
	                   currentGrading = "HOMEWORK";
	            else if (line.equals("EXAM 1")) 
	                   currentGrading = "EXAM 1";
	            else if (line.equals("EXAM 2")) 
	                   currentGrading = "EXAM 2";
	            else if (line.equals("FINAL")) 
	                   currentGrading = "FINAL";
	            else {
                    //if not a header, then adds grade to appropriate grade type variable
                    switch (currentGrading) {
                        case "LABS":
                        labGrade += Integer.parseInt(line);
                        labTot++; //keeps track of number of labs
                        break;
                        
                        case "LAB REPORTS":
	                	labReportGrade += Integer.parseInt(line);
	                	labReportTot++; //keeps track of number lab reports
	                	break;
	                       
	                    case "HOMEWORK":
	                    homeworkGrade += Integer.parseInt(line);
	                    homeworkTot++; //keeps track of number of homeworks
	                    break;

	                    case "EXAM 1":
	                    exam1Grade += Integer.parseInt(line);
	                    break;

	                    case "EXAM 2":
	                    exam2Grade += Integer.parseInt(line);
	                    break;
	                       
	                    case "FINAL":
	                    finalExamGrade += Integer.parseInt(line);
	                    break;
                    }
                }
            }

            //finds averages and rounds the grades up
	        double labAvg = Math.ceil((labGrade/labTot));
	        double labReportAvg = Math.ceil((labReportGrade/labReportTot));
	        double homeworkAvg = Math.ceil((homeworkGrade/homeworkTot));
	        double firstExam = Math.ceil(exam1Grade);
	        double secondExam = Math.ceil(exam2Grade);
	        double finalExamAvg = Math.ceil(finalExamGrade);
	           
	        //grade details before final swap
	        System.out.println("\nYour Lab Average is " + labAvg);
	        System.out.println("Your Lab Report Average is " + labReportAvg);
	        System.out.println("Your Homework Average is " + homeworkAvg);
	        System.out.println("Your First Exam is " + firstExam);
	        System.out.println("Your Second Exam is " + secondExam);
	        System.out.println("Your Final Exam is " + finalExamAvg);

	        //calculation to see if either exam 1 or 2 can be replaced by final
	        if((finalExamAvg > firstExam) || (finalExamAvg > secondExam)) {
                if(firstExam > secondExam) {
                    secondExam = finalExamAvg;
	        	    finalExamAvg = 0;
                }
                if(secondExam > firstExam) {
	        	    firstExam = finalExamAvg;
	        		finalExamAvg = 0;
	        	}
	            //arbitrarily replaces one exam if both are equal
	        	if(firstExam == secondExam) {
                    firstExam = finalExamAvg;
	        		finalExamAvg = 0;
	        	}
	        }
	           
	        //calculate raw total
	        double rawtotal;
	        double total;
	        
            //assuming an exam has been swapped with the final, the total is out of 100
	        if(finalExamAvg == 0) {
                rawtotal = (0.1*labAvg) + 
	        			   (0.1*labReportAvg) +
	        			   (0.2*homeworkAvg) + 
	        			   (0.3*firstExam) + 
	        			   (0.3*secondExam);
                total = Math.ceil(rawtotal);
	        }
	        //assuming the exam hasn't been swapped for either, the total is out of 130
	        else {
                rawtotal = ((0.1/1.3)*labAvg) + 
	        			   ((0.1/1.3)*labReportAvg) +
	        			   ((0.2/1.3)*homeworkAvg) + 
	        			   ((0.3/1.3)*firstExam) + 
	        			   ((0.3/1.3)*secondExam) + 
	        			   ((0.3/1.3)*finalExamAvg);
	        	total = Math.ceil(rawtotal);
	        }
	           
	        //grades details after final swap, ultimate grade
	        System.out.println("Your Raw Total is " + rawtotal);
	        System.out.println("Your Final Grade is " + letterGrade(total));
	           
	        //closing scanners
	        scanner.close();
	        keyboard.close();
	    } 
		   
		//catch exceptions if any
		catch (IOException e) {
            System.out.println(e);
	    }
        catch (Exception e) {
            System.out.println(e);
        }
	}

    // function to determine letter grade given a total number of points
	public static String letterGrade(double total) {
        String grade = "N/A";
        
        //decide grade from given rules
        if (total >= 90)
            grade = "A";
        else if (total >= 85 && total <= 89)
            grade = "B+";
        else if (total >= 80 && total <= 84)
            grade = "B";
        else if (total >= 75 && total <= 79)
            grade = "C+";
        else if (total >= 70 && total <= 74)
            grade = "C";
        else if (total >= 65 && total <= 69)
            grade = "D+";
        else if (total >= 60 && total <= 64)
            grade = "D";
        else if (total < 60)
            grade = "F";

        // return result
        return grade;
    }  
}