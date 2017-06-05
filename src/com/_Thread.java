package com;


public class _Thread extends Thread{

	private String tname;
	
	public _Thread(String name){
		super(name);
		this.tname = name;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"开始运行。优先级别"+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++){
			System.out.println("子线程"+tname+"运行"+i);
			try {
				sleep((int)Math.random()*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"运行结束");
		
	}
}
