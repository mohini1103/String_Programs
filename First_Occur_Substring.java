package com.jbk.oct14;

public class First_Occur_Substring {
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Welcome To Sai Resort");
		String subStr = "come";

		int index = str.indexOf(subStr);
		{

			if (index != -1) {
				System.out.println("The substring\" " + subStr + " \" is found at index" + index);
			} else {
				System.out.println("The substring\" " + subStr + "\" is not found.");
			}
		}
	}
}