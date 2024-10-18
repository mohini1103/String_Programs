package com.jbk.oct14;

public class ConcatenateStrings {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Welcome");

		StringBuffer str1 = new StringBuffer(" To Hello World");

		System.out.println(str.append(str1));

	}
}
