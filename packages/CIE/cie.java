package CIE;

import java.lang.*;
import java.util.*;

Protected class Student{

Scanner in = new Scanner(System.in); 
String name, usn;
int sem;

void details(){
System.out.print("Enter the name of the student: ");
name = in.nextLine();
System.out.print("Enter the USN: ");
usn = in.nextLine();
System.out.print("Enter the semester: ");
sem = in.nextInt();
}

}


class Internals extends Student{

float cie_marks[] = new float[5];
int i;
Scanner in = new Scanner(System.in);

void cieMarks(){
System.out.println("Enter the CIE marks of the student for all 5 subjects");
for(i=0; i<5; i++){
System.out.print((i+1) + " -> ");
cie_marks[i] = in.nextFloat();
}
}

}


class cie{

public static void main(String args[]){

Internals internal = new Internals();
internal.details();
internal.cieMarks();

}

}