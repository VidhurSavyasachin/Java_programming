package median_array_linkedList;

import java.util.Arrays;
import java.util.Scanner;

public class GradeProgram {
	 static int[] gradingStudents(int[] grades) {
	        /*
	         * Write your code here.
	         * if a number has +1/+2 difference
	         */
	         int[] finalGrades = new int[grades.length];

	        for (int i = 0; i < finalGrades.length; i++) {
	        	int grade1 = grades[i]+1;
	        	int grade2 = grades[i]+2;
	        	if(grades[i]>37) {
	        	if(grades[i] % 5 == 0) {
	        		finalGrades[i]=grades[i];
	        	}else if(grade1 %5 == 0) {
	        		finalGrades[i]=grade1;
	        	}
	        	else if(grade2 %5 ==0) {
	        		finalGrades[i] = grade2;
	        	}else {
	        		finalGrades[i] = grades[i];
	        	}
	        	}else {
	        		finalGrades[i] = grades[i];
	        	}
	        }
			     
	        return finalGrades;
	         }
	
	 /*
	  * 23
80
96
18
73
78
60
60
15
45
15
10
5
46
87
33
60
14
71
65
2
5
97
0
	  * 
	  * 
	  * 
	  * 
	  */
	 public static void main(String args[]) {
		 int[] values = new int[6];
		 
		 Scanner n = new Scanner(System.in);
		 
		 for (int i = 0; i < values.length; i++) {
			values[i] = n.nextInt();
			 
		}
		 int[] B = gradingStudents(values);
		
			 System.out.println(Arrays.toString(B)); 
		
		 
		 
	 }
}
