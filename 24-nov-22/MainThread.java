package lab24thNov;

import java.util.ArrayList;

class LoadedThread implements Runnable {

	 int startNumber,LastNumber;
	 LoadedThread(int startnumber,int lastNumber){
		 this.startNumber=startNumber;
		 this.LastNumber=lastNumber;
		 
	 }
	public void run() {
ArrayList<Integer>L=new ArrayList<Integer>();
for(int i=startNumber;i<=LastNumber;i++) {
	L.add(i);
}
for(int j:L)//Referenced or enhanced loop
	System.out.println(j);
	}}
public class MainThread{
	Public static void main(String[] args)throws InterruptException{
		Runnable r1=new LoaderThread(0,50);
		Thread t1=new Thread(r1);
		Runnable r2=new LoaderThread(50,100);
		Thread t2=new Thread(r2);
		
		int a=(int)
	}
}
