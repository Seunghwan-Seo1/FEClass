package javaday1;

import java.util.ArrayList;

public class Listexam {
	public static void main(String [] args) {
		
		ArrayList pitches = new ArrayList ();
		
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		pitches.add(0,"133");
		
		System.out.println(pitches.get(1));
		System.out.println(pitches.size());
		
		System.out.println(pitches.remove("129"));
		System.out.println(pitches.remove(0));
		System.out.println(pitches.size());
	}

}
