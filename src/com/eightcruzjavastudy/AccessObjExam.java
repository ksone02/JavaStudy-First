package com.eightcruzjavastudy;

import javastudy.AccessObj;

public class AccessObjExam extends AccessObj{
	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p);
		System.out.println(obj.p2);
		//private임으로 접근 불가능
		//System.out.println(obj.i);
		//다른 패키지임으로 불가능
		//System.out.println(obj.k);
	}
}
