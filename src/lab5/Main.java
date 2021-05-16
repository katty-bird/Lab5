package lab5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

   public static void main(String[] args) {
//       List<Integer> ns = Arrays.asList(10,100,1000,10000,100000);
//       fragment1(ns);
//       fragment2(ns);
//       fragment3(ns);
//       fragment4(ns);
//       fragment5(ns);
//       fragment6(ns);
//       fragment7(ns);
//       fragment8(ns);

       long time1 = testIsPrime(20);
       long time2 = testIsPrime(40);
       System.out.println(time2/time1); // compare 2 running times
   }
   private static long testIsPrime(int maxBits) {
       Random random = new Random();
       long start = System.nanoTime(); //start the stop watch
       for (int i = 0; i < 100; i++){
           int number = random.nextInt((int) Math.pow(2, maxBits)); // 2^maxBits
           isPrime(number); // check if the number is prime
       }
       long end = System.nanoTime(); //stop the stop watch
       long duration = (end - start)/100;
       System.out.println("Milliseconds elapsed: " + duration);
       return duration;
   }

   public static void fragment1(List<Integer>ns){
       for ( int n : ns){
           int sum = 0;
           for ( int i = 0; i < n; i ++) {
               sum++;
           }
           System.out.print(sum + " ");
       }
       System.out.println(" ");
   }
   public static void fragment2(List<Integer>ns){
       for ( int n : ns){
           long sum = 0;
           for ( int i = 0; i < n; i ++){
               for ( int j = 0; j < n; j ++){
                   sum++;
               }
           }
           System.out.print(sum + " ");
       }
       System.out.println(" ");
   }
   public static void fragment3(List<Integer>ns){
       for ( int n : ns){
           int sum = 0;
           for ( int i = 0; i < n; i ++){
               for ( int j = i; j < n; j ++){
                   sum++;
               }
           }
           System.out.print(sum + " ");
       }
       System.out.println(" ");
   }
   public static void fragment4(List<Integer>ns){
       for ( int n : ns){
           long sum = 0;
           for ( int i = 0; i < n; i ++){
               sum ++;
               for ( int j = 0; j < n; j ++){
                   sum ++;
               }
           }
           System.out.print(sum + " ");
       }
       System.out.println(" ");
   }
   public static void fragment5(List<Integer>ns){
       for ( int n : ns){
           long sum = 0;
           for ( int i = 0; i < n; i ++){
               for ( int j = 0; j < n*n; j ++){
                   sum++;
               }
           }
           System.out.print(sum + " ");
       }
       System.out.println(" ");
   }
   public static void fragment6(List<Integer>ns){
       for ( int n : ns){
           long sum = 0;
           for ( int i = 0; i < n; i ++){
               for ( int j = 0; j < i; j ++)
                   sum++;
           } System.out.print(sum + " ");
       }
       System.out.println(" ");
   }

   public static void fragment7(List<Integer>ns){
       for ( int n : ns){
           long sum = 0;
           for ( int i = 1; i < n; i ++) {
               for (int j = 0; j < n * n; j++) {
                   if (j % i == 0) {
                       for (int k = 0; k < j; k++) {
                           sum++;
                       }
                   }
               }
           }
           System.out.print(sum + " ");
       }
       System.out.println(" ");
   }
   public static void fragment8(List<Integer>ns){
       System.out.println("F8");
       for ( int n : ns){
           int sum = 0;
           int i = n;
           while (i > 1) {
               i = i / 2;
               sum++;
           }
           System.out.print(sum + " ");
       }
       System.out.println(" ");
   }

   public static boolean isPrime (int n) {
       for(int i = 2; i < n; i++){
           if(n % i == 0){
               return false;
           }
       }
       return true;
   }

}
