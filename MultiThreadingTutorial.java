public class MultiThreadingTutorial {
	
	// main method represent main thread
	public static void main(String[] args){
		// thread = execution context
		if (args.length == 0){
			System.out.println("== Hello Shiva! " + " main started ==");
		}else{
			System.out.println("== Hello " + args[0]+"!" + " maim started ==");
		}
		
		ThreadClass tc = new ThreadClass();
		tc.setDaemon(true);
		tc.start();
		Runnable tr = new ThreadRunnable();
		Thread trThread = new Thread(tr);
		trThread.start();

		for(int doc=1; doc <=10; doc++ ){
			System.out.println("MT: Printing document #" + doc);
		}
		
		if (args.length == 0){
			System.out.println("== ByBy Shiva! " + " main finsehd ==");
		}else{
			System.out.println("== ByBy " + args[0]+"!" + " main finsehd ==");
		}
				
	}
	
}