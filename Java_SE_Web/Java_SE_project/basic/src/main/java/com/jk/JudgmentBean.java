package com.jk;

public class JudgmentBean {
	private int num1;
	private int num2;
	private int opr;
	private int endNum;
	
	
	public JudgmentBean(){
		
	}
	public JudgmentBean(int num1,int num2,int opr){
		this.num1 = num1;
		this.num2 = num2;
		this.opr = opr;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getEndNum() {
		
		switch(opr){
			case 1:
				endNum = num1+num2;
			break;
			case 2:
				endNum = num1-num2;
			break;
				
			case 3:
				endNum = num1*num2;
			break;
				
			case 4:
				endNum = num1/num2;
			break;
				
		}
		return endNum;
	}
	

}
