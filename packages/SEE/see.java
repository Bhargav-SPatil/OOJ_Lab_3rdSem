package SEE;

import java.lang.*;
import java.util.*;
import CIE.*;


class External extends CIE.Student{

float see_marks[] = new float[5];
int i;
Scanner in = new Scanner(System.in);

void seeMarks(){
System.out.println("Enter the SEE marks of the student for all 5 subjects");
for(i=0; i<5; i++){
System.out.print((i+1) + " -> ");
see_marks[i] = in.nextFloat();
}

}

}


class see{

public static void main(String args[]){

External xternal = new External();
xternal.seeMarks();

}

}