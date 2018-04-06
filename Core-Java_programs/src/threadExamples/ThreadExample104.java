package threadExamples;

public class ThreadExample104{
	
	public Integer turn = 1;
	public int getTurn(){
		return turn;
	}
	
	public void setTurn(int i){
		this.turn=i;
	}
	
	public static void main(String[] args) {
		ThreadExample104 te = new ThreadExample104();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				
					while(true)
					{
						synchronized(ThreadExample104.class){
							if(te.getTurn()==1){
							
								System.out.println("Network Thread");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException ie) {
					
								}
							te.setTurn(2);
							
						}
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() 
		{
			public void run() {
				while(true)
				{
						synchronized(ThreadExample104.class){
							if(te.getTurn()==2){
							
								System.out.println("DB Thread");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException ie) {
					
								}
							te.setTurn(3);
							
						}
					}
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				while(true)
					{
						synchronized(ThreadExample104.class){
							if(te.getTurn()==3){
							
								System.out.println("Print Thread");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException ie) {
					
								}
							te.setTurn(1);
							
						}
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
	
	}
	
}