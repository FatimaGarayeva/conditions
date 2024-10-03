package com.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // syntax ( condition ) {
        //
        // codes
        //
        // }
//        int a= 3;
//        int b = 4;
//        if(a==b){
//            System.out.println("beraberdir");
//        }
//        else{
//            System.out.println("beraber deyil");
//        }

//       int point = 101;
//
//       if (point >= 51 && point <60 ){
//           System.out.println("E");
//       } else if (point >= 61 && point < 70) {
//           System.out.println("D");
//
//       }
//       else if (point >= 71 && point < 80) {
//           System.out.println("C");
//
//       }
//       else if (point >= 81 && point < 90) {
//           System.out.println("B");
//
//       }
//       else if (point >= 91 && point < 100) {
//           System.out.println("A");
//
//       } else if (point>= 100 ) {
//           System.out.println("bele bir hal mumkun deyil");
//
//       } else {
//            System.out.println("F");
//        }

//
//        int day = 5;
//
//        switch (day){case 1:
//            System.out.println("bazar ertesi");
//        break ;
//            case 2:
//                System.out.println("cersenbe axsami");
//                break;
//            case 3:
//                System.out.println("cersenbe");
//                    break;
//            case 4:
//                System.out.println("cume axsami");
//                break;
//            case 5:
//                System.out.println("cume");
//                break;
//            case 6:
//                System.out.println("senbe");
//                break;
//            case 7:
//                System.out.println("bazar");
//                break;
//
//        }

//        String stu1 = "Fatime";
//        String stu2 = "Lamiye";
//        String stu3 = "Peri";
//        String[] students = {"Fatime", "Lamiye", "Peri", "Nuray"};
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

//        // logs: for
//        int a = 2;
//        int b = 1;
//        a = ++b;
// System.out.println(a);
//
//        for (int i = 0; i < students.length ; i++) {
//            System.out.println(students[i]);
//        }
//        for (int i =1 ; i<11 ; i++){
//            if (i%2==0)
//            System.out.println(i);
//       Random random = new Random();
//       int number = 9;
//       int rndNumber = random.nextInt(1,11);
//       int count = 1;
//
//       while(number != rndNumber){ count++;
//           System.out.println(rndNumber);
//            rndNumber = random.nextInt(1,11);
//        }
//        System.out.println(number +" ededini komputer" + count +"defeye tapdi");
//        int rndNumber = random.nextInt( 0, students.length);
//        System.out.println(students[rndNumber]);
//        Scanner scanner = new Scanner(System.in);

//       Random random = new Random();
//       int number = scanner.nextInt();
//       int rndNumber = random.nextInt(1,11);
//       int count = 1;
//
//       while(number != rndNumber){ count++;
//           System.out.println(rndNumber);
//            rndNumber = random.nextInt(1,11);
//        }
//        System.out.println(number +" ededini komputer" + count +"defeye tapdi");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("adinizi daxil edin");
//        String name = scanner.nextLine();
//        System.out.println("soyadinizi daxil edin");
//        String surname = scanner.nextLine();
//        System.out.println( "xos gelmisiniz" + name + " " + surname );
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("emailiniz daxil edin");
//        String email = scanner.nextLine();
//        System.out.println("sifrenizi daxil edin");
//        String password = scanner.nextLine();
//
//        String dbEmail = "fatime";
//        String dbPassword = "12345";
//        if (dbEmail.equals(email) && dbPassword.equals(password)){
//            System.out.println("xos geldiniz");
//
//        }
//        else{
//            System.out.println("Email ve ya sifre yanlisdi");
//        }
//         int a = 3;
//         int b = 4;
//         b = a;
//         a = 5;
//        System.out.println(a);
//        System.out.println(b);
//        int[] aa = {1,3,5};
//        int[] bb = {4,7,9};
//        aa = bb;
//       bb[0]=100;
//    System.out.println(aa[0] +","+aa[1]+","+aa[2]);
//        System.out.println(bb[0]+","+bb[1]+","+bb[2]);
//        String[] students = {"Fatime", "Lamiye", "Peri", "Nuray"};
//        System.out.println(students);
//
//        for (int i= 0; i< students.length; i++){
//            System.out.println(students[i]);
//        }
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);



        for (int i= 0; i< numbers.length; i++) {
            System.out.println(i+1 + "ededi daxil edin");

            int userInput = scanner.nextInt();
            numbers[i]= userInput;}
            System.out.println( numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);





//        Random random = new Random();
//       int number = 9;
//       int rndNumber = random.nextInt(1,11);
//       int count = 1;
//
//       while(number != rndNumber){ count++;
//           System.out.println(rndNumber);
//            rndNumber = random.nextInt(1,11);
//        }
//        System.out.println(number +" ededini komputer" + count +"defeye tapdi");



}
}