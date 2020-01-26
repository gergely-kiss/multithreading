class ThreadRunnable implements Runnable{
	@Override
	public void run (){
		System.out.println("TR: ThreadRunnable.run() started");
		for(int doc=1; doc <=10; doc++ ){
			System.out.println("TR: Printing document #" + doc);
		}
		System.out.println("TR: ThreadRunnable.run() finished");
	}
}