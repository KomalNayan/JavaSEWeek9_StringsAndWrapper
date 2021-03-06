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
			System.out.println("------------------------------------");
			StringBuffer buffer1 = new StringBuffer();
			System.out.println("Capacity of Default Buffer: "+buffer1.capacity());
			System.out.println("Length of Default Buffer: "+buffer1.length());
			StringBuffer buffer = new StringBuffer(str);
			System.out.println("Capacity of Buffer of str: "+buffer.capacity());
			System.out.println("Length of Buffer of str: "+buffer.length());
			buffer.reverse();
			System.out.println("Reverse : "+buffer); //Buffers are mutable
			buffer.reverse(); //Back to Original
		    buffer1 = buffer;
		    buffer1.append(" Toronto");
			System.out.println("Buffer1 after appending Toronto : "+buffer1);

			buffer.append(100);
			System.out.println("Buffer after appending 100 : "+buffer);

			int indexToronto = buffer1.indexOf(" Toronto");
			buffer1.replace(indexToronto,buffer1.length(),", Toronto");
			System.out.println("After Replacement : "+buffer1);
    }
}
