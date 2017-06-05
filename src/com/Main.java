package com;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"主线线程开始运行");
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		
		//继承Thread类
		/*_Thread t1 = new _Thread("A");
		_Thread t2 = new _Thread("B");
		t1.start();
		t2.start();
		t1.setPriority(Thread.MAX_PRIORITY);  //1~10整数，优先级高不一定先执行
		t2.join();*/
		
		//实现Runnable接口
		new Thread(new _Runnable("A",c,a)).start();
		Thread.sleep(100);
		new Thread(new _Runnable("B",a,b)).start();
		Thread.sleep(100);
		new Thread(new _Runnable("C",b,c)).start();
		Thread.sleep(100);
		
		System.out.println(Thread.currentThread().getName()+"主线线程运行结束");
	}

}

