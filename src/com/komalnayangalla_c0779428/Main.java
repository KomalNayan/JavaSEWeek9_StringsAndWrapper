package com.komalnayangalla_c0779428;

public class Main {

    public static void main(String[] args) {
	        String str = "Welcome to Lambton College";
	        System.out.println("String : "+str);
	        System.out.println("Length : "+str.length());
	        System.out.println("str.concat(\" Toronto\") : "+str.concat(" Toronto"));
	        System.out.println("str.toLowerCase() : "+str.toLowerCase());
		    System.out.println("str.toUpperCase() : "+str.toUpperCase());
		    //Retrieving Lambton Word
			int indexLambton = str.indexOf("Lambton");
			System.out.println(str.substring(indexLambton,indexLambton+"Lambton".length()));
			//Checking if a word is present
			String wordToFind = "Welcome";
			System.out.println("'"+str+"' contains '"+wordToFind+"' ? : "+str.contains(wordToFind));
    }
}
