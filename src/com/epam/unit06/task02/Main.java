package com.epam.unit06.task02;

public class Main {

	public static void main(String[] args) {
		
        Watch  wt = new Watch(7,60,50);
        
        wt.setHH(7);
        wt.setMM(60);
        wt.setSS(50);
    //  System.out.printf("[%2d]:[%2d]:[%2d]", hh, mm, ss);
	//	System.out.println();
		
        wt.showTime();
        
        wt.addSeconds(3606);
	
        wt.showTime();
        
        wt.addMinutes(10);
        
        wt.showTime();
        
        wt.addHours(20);
        
        wt.showTime();
	}

}


class Watch {
	private int hh;
	private int mm;
	private int ss;
	
	public Watch() {
		hh=0;
		mm=0;
		ss=0;
	}
	
	public Watch(int _hh, int _mm, int _ss) {
       setHH(_hh);
       setMM(_mm);
       setSS(_ss);
	}
	
	public void setHH(int _hh) {
		if(_hh>23 || _hh<0) {
			hh=0;
		} else {
			hh=_hh;
		}
	}
	
	public void setMM(int _mm) {
		if (_mm>59 || _mm<0) {
			mm=0;
		} else {
		   mm=_mm;
		}
	}
	
	public void setSS(int _ss) {
		if (_ss>59 || _ss<0) {
			ss=0;
		} else {
			ss=_ss;
		}
	}
	
	public int getHH() {
		return hh;
	}
	
	public int getMM() {
		return mm;
	}
	
	public int getSS() {
		return ss;
	}
	
	public void showTime() {
		System.out.printf("[%2d]:[%2d]:[%2d]", hh, mm, ss);
		System.out.println();
	}
	
	public void addSeconds (int _ss) {
		ss=ss+_ss;
		mm=mm+ss/60;
		ss=ss%60;
		hh=hh+mm/60;
		mm=mm%60;
		hh=hh%24;
	}
	
	public void addMinutes (int _mm) {
		addSeconds(_mm*60);
	}
	
	public void addHours (int _hh) {
		addMinutes(_hh*60);
	}
}