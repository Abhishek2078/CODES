package Abhishek;
import java.io.*;

class Order {

  private static int i = 0;
  private int count = i++;

  public Order() {
    if (count == 10) {
      System.out.println("\n out of food stock");
      System.exit(0);
    }
  }

  public String toString() {
    return "Order" + count;
  }
}

class waitperson extends Thread {

  private Resturant rest;

  public waitperson(Resturant r) {
    rest = r;
    start();
  }

  public void run() {
    while (rest.order == null) synchronized (this) {
      try {
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("wait person got" + rest.order);
      rest.order = null;
    }
  }
}

class chef extends Thread {

  private Resturant rest;
  private waitperson wp;

  public chef(Resturant r, waitperson w) {
    rest = r;
    wp = w;
    start();
  }

  public void run() {
    while (true) {
      if (rest.order == null) {
        rest.order = new Order();
        System.out.println("order up");
        synchronized (wp) {
          wp.notify();
        }
      }
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

public class Resturant {

  Order order;

  public static void main(String args[]) {
    Resturant rest = new Resturant();
    waitperson wp = new waitperson(rest);
    chef ch = new chef(rest, wp);
  }
}
