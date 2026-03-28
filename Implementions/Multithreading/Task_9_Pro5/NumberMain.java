package Task_9_Pro5;

import java.util.*;

class PrimeThread extends Thread {
    List<Integer> primes;

    PrimeThread(List<Integer> primes) {
        this.primes = primes;
    }

    public void run() {
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(i);
        }
    }
}

class FibonacciThread extends Thread {
    List<Integer> fib;

    FibonacciThread(List<Integer> fib) {
        this.fib = fib;
    }

    public void run() {
        int a = 0, b = 1;
        while (a <= 1000) {
            fib.add(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

class CommonThread extends Thread {
    List<Integer> primes, fib;

    CommonThread(List<Integer> primes, List<Integer> fib) {
        this.primes = primes;
        this.fib = fib;
    }

    public void run() {
        Set<Integer> set = new HashSet<>(primes);
        for (int n : fib) {
            if (set.contains(n)) {
                System.out.print(n + " ");
            }
        }
    }
}

public class NumberMain {
    public static void main(String[] args) throws Exception {
        List<Integer> primes = new ArrayList<>();
        List<Integer> fib = new ArrayList<>();

        PrimeThread t1 = new PrimeThread(primes);
        FibonacciThread t2 = new FibonacciThread(fib);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        CommonThread t3 = new CommonThread(primes, fib);
        t3.start();
        t3.join();
    }
}
