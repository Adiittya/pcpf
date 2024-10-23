class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A: " + i);
        }
        System.out.println("Exit from A");
    }
}

class B implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B: " + j);
        }
        System.out.println("Exit from B");
    }
}

class RunableThread {
    public static void main(String[] args) {
        A aRunnable = new A();
        B bRunnable = new B();

        Thread threadA = new Thread(aRunnable);
        Thread threadB = new Thread(bRunnable);

        System.out.println("Start from Thread A");
        threadA.start();

        System.out.println("Start from Thread B");
        threadB.start();
    }
}
