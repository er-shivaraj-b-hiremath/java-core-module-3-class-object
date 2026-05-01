package com.icalonics.collections_framework.java_app;

import java.util.ArrayList;

public interface JavaApp {
	public static void execution() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(Integer i = 1;i <= 5;i ++) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
	}
}