package CommonPrograms;

public class PrintTringle2 {

	public static void main(String[] args) {

		int n=6;
		int i, j, k=2*n-2;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=1; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=1; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
             
            // decrementing k after each loop
            k = k - 2;
             
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=1; j<=i; j++)
            {
                // printing stars
                System.out.print(j+" ");
            }
             
            // ending line after each row
            System.out.println();
        }

	}

}
