class ThreadClass extends Thread{
	@Override
	public void run (){
		System.out.println("TC: ThreadClass.run() started");
		Runnable tr = new ThreadRunnable();
		Thread trThread = new Thread(tr);
		trThread.start();		
		for(int doc=1; doc <=10; doc++ ){
			System.out.println("TC: Printing document #" + doc);
		}
		System.out.println("TC: ThreadClass.run() finished");
	}
}