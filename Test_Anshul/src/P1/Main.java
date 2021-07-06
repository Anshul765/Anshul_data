package P1;
//we can pass object of a class as an argument in a method -> Refer to finalmethod()
//finalmethod is the past of class A because its arguments contains obejct of class A
//In final method we are passing the obejct of child class as an argument and method is executing successfully


class A {
 public void methodA() {
     System.out.println("Most parent class A");
 }
}

class B extends A {
 public void methodB() {
     System.out.println("First child class A");
 }
}

class C extends B {
 public void methodC() {
     System.out.println("2nd child class C");
 }
}

public class Main {
 public static void main (String[] args) {
     B b = new B();
     C c = new C();
     finalmethod(b);
     finalmethod(c);
 }


public static void finalmethod(A a) {
 a.methodA();
}
}





