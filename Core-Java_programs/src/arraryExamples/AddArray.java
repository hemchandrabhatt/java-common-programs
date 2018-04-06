package arraryExamples;

public class AddArray
{
    public static void main(String[] args) 
    {

    	int[] x = {1,2,3};
        int[] y = {1,2,3};

        add(x,y);
        
        class MA {
            public void methodB() {
                 /* This can satisfy your need of nested method */
            }
       }

        
    }

	private static void add(int[] x, int[] y) {
		// TODO Auto-generated method stub
		int[] sum = new int[x.length];
        for (int i=0; i<x.length; i++)
            sum[i] = x[i] + y[i];
        for (int i=0; i<x.length; i++)
            System.out.println(sum[i]);
	}
}