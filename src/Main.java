import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        System.out.println("Hello");
//        byte age = 25 ;
//        System.out.println(age);
//        int num = 1236547890 ;
//        System.out.println(num);
//        long n = 1236547993251561800L ;
//        System.out.println(n);
//        double bn = 1.031 ;
//        System.out.println(String.format("%.3f%n", bn));
//        char c = 'b' ;
//        boolean bb = true ;
//        System.out.println(bb);
//        System.out.println(c);

//          namePrint() ;
//        myArray();

        Taking_input();




    }
    public static void namePrint(){
        //concatenate
        String name = "Md Toushik";
        String name1 = "ur Rahman";
        String name2 = name+name1 ;
        System.out.println(name2);

        //charAT pos...
        System.out.println(name2.charAt(10));

        //lenght()...
        System.out.println(name.length());
        System.out.println(name1.length());
        System.out.println(name2.length());

        //replace ;;;;
        String name3 = name2.replace('a' , '@');
        System.out.println(name3);

         // sunstring ...
        System.out.println(name2.substring(0,name.length() ) );


    }

    public static void myArray() {
                    int[] ar = new int[3] ;
                    ar[0]= 100 ;
                    ar[1] = 12 ;
                    ar[2] = 15 ;
        System.out.println(ar[0]);
                    Arrays.sort(ar);
        System.out.println(ar[0]);
        // 2D array ....
        int[][] arr = {{120,200,30},{150,241,20}};
        System.out.println(arr[1][0]);

    }
    public static void Taking_input(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENter Your name then age : ");
        String name = sc.nextLine() ;
        int age = sc.nextInt() ;
        System.out.println(name+ " \n"+age );

    }



}