package com.javaclass;
import java.util.*;
import java.util.Arrays;
public class InputNamesFromUser {
	public static void main (String[] args) {
		String nameInputFromUser;
		System.out.println("Enter your name :");
		
		Scanner sc = new Scanner(System.in);
		nameInputFromUser = sc.nextLine();
		
		System.out.println(nameInputFromUser);
		sc.close();
		
String names[] = {"Shakila", "Sumathi", "Jana"};
System.out.println(names[0]);
System.out.println(names[1]);
System.out.println(names[2]);

System.out.println(Arrays.toString(names));

String name = "Jayanthi";
int length = name.length();
System.out.println(length);

int len = names.length;
System.out.println(len);

for(int i=0; i<names.length; i++)
	System.out.println(names[i]);
	
String names1[] = names.clone();
System.out.println(Arrays.toString(names1));
String girlStudentNames[] = names.clone();
System.out.println(Arrays.toString(girlStudentNames));

for(String myFriendsNames : girlStudentNames) {
	System.out.println(myFriendsNames);
	}
}
}