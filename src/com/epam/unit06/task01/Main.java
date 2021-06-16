package com.epam.unit06.task01;

public class Main {

	public static void main(String[] args) {
		Counter ct = new Counter(); 
				
		
		ct.min=5;
		ct.max=10;
		ct.curr=4;
	//	ct.increase();
		ct.decrease();	
		System.out.println("case 1, Current value=" + ct.getCurr());
		
	//	ct.decrease();
     	ct.increase(); 	
		System.out.println("case 2, Current value=" + ct.getCurr());
				
	}
	
}

class Counter {
	
	public int min;
	public int max;
	public int curr;
	
	public Counter () {
		min=0;
		max=20;
		curr=20;
	}
	
	
	public Counter (int _min, int _max, int _curr) {
		min=_min;
		max=_max;
		curr=_curr;
		check();	
	}
	
	private void check() {
		int temp;
		if (min>max) {
			temp=min;
			min=max;
			max=temp;
		} 
		
		if (curr<min || curr>max) {
			curr=max;
		} 
		
	}
	
	public void decrease() {
		check();
		curr=curr-1;
		if (curr<min) {
			curr=max;
		}
	}
	
	public void increase() {
		check();
		curr=curr+1;
		if (curr>max) {
			curr=min;
		}
	}
	
	public int getCurr() {
		return curr;
	}
	
}
