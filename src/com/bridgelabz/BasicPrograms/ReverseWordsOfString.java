package com.bridgelabz.BasicPrograms;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		String str="Hi how are you";
		String reverseString="";
		String [] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);

	}

}
