
import java.util.Scanner;

 class School
 {

    // Recursive function to process each student's results
      public static void display(int a, int b, Scanner s) 
      {
        if (a>b)
        {
            // Base case: if all students have been processed
            return;
        }

        int n,marks,i,t=0;
        float avg;

        System.out.print("Enter number of subjects for Student " +a+ ": ");
        n=s.nextInt();
        
        for (i=1;i<=n;i++)  // Get the marks for each subject
        {
            System.out.print("Enter marks for Subject " + i + ": ");
            marks = s.nextInt();
            t=t+marks;
        }

        avg=(float)t/n;

        System.out.println("\nResults for Student " +a+ ":");
        System.out.println("Total Marks: " +t);
        System.out.println("Average Marks: " + String.format("%.2f",avg));

        
        if (avg>=40) // Check pass/fail condition
        {
            System.out.println("Result: Passed\n");
        } 
        else 
        {
            System.out.println("Result: Failed\n");
        }

        
        display(a+1,b,s); // Recursive call for the next student
    }

    public static void main(String[] args) 
    {
        Scanner x= new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int a = x.nextInt();

        
        display(1,a,x);// Call the recursive function to process the results

        x.close();
    }
}
