package com;


public class _Runnable implements Runnable{

	private String name;
	private Object preob,selfob;
	
	public _Runnable(String name,Object po,Object so){
		this.name = name;
		this.preob = po;
		this.selfob = so;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int num=10;
		while(num>0){
			synchronized (preob) {
				synchronized (selfob) {
					System.out.println(name);
					selfob.notify();
					num--;
				}
				try {
					preob.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/*@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(name+"运行"+i);
			try {
				Thread.sleep((int)Math.random()*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
	
	
	
}

