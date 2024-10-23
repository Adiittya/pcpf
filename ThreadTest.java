import java.util.*;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A: " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B: " + j);
        }
        System.out.println("Exit from B");
    }
}

class ThreadTest {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();

        System.out.println("Start from Thread A");
        threadA.start();

        System.out.println("Start from Thread B");
        threadB.start();
    }
}
