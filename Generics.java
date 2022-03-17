
import java.lang.*;

class MultipleGen<X, Y, Z> {

X ob1;
Y ob2;
Z ob3;

MultipleGen(X o1, Y o2, Z o3) {
ob1 = o1;
ob2 = o2;
ob3 = o3;
}

void showTypes() {
System.out.println("Type of X is " +ob1.getClass().getName());
System.out.println("Type of Y is " +ob2.getClass().getName());
System.out.println("Type of Z is " +ob3.getClass().getName());
}

X getob1() {
return ob1;
}

Y getob2() {
return ob2;
}

Z getob3() {
return ob3;
}
}

public class MulGen{
public static void main(String args[]) {

MultipleGen<Integer, Double, String> mulGenObj =
new MultipleGen<Integer, Double, String>(88, 1.01, "Multiple Object Parameter Generics");

mulGenObj.showTypes();

int i = mulGenObj.getob1();
System.out.println("Integer Generic Parameter Value: " + i);

double d = mulGenObj.getob2();
System.out.println("Double Generic Parameter Value: " + d);


String str = mulGenObj.getob3();
System.out.println("String Generic Parameter Value: " + str);
}
}
