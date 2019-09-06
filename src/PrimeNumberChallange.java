//import java.util.Scanner;
//
//public class PrimeNumberChallange {
//    public static void main(String[] args) {
//        IsPrime();
//    }
//
//   // public static String IsPrime() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Would you like to generate random number? ('Y'/'N')");
//        String response = input.nextLine();
//        boolean isPrime = false;
//
//        if (response.equalsIgnoreCase("y")) {
//            System.out.println("Enter a random number, and I will tell you if it is a prime or not.");
//            int num = input.nextInt();
//
//            if (num <= 1) {
//                return "the number you enter should be greater than 1.";
//            }else {
//                for (int i = 2; i < num; i++) {
//                    if (num % i == 0) {
//                        isPrime = false;
//                        return num + " is not a prime number.";
//
//                    } else {
//                        isPrime = true;
//                        return num + " is a prime number.";
//                    }
//                }
//            }
//        } else {
//           return "Have fun. Bye!";
//        }
//        if(isPrime){
//
//        }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
///*
//       do {
//           System.out.println("Would you like to generate random number? ('Y'/'N')");
//           String response = input.nextLine();
//
//           if (response.equalsIgnoreCase("y")){
//
//               System.out.println("Enter a random number and I will tell you if it is prime or not.");
//               double num = input.nextDouble();
//               Math.floor(num);
//
//               for( int i = 0; i < num; i++){
//                   if( num % i == 0){
//                       System.out.println(num + " is not a prime");
//                   }else{
//                       System.out.println(num + "is a prime number");
//                   }
//               }
//           }else {
//               System.out.println("Have fun. Bye!");
//           }
//           System.out.println("Do you want to enter another number? ('Y'/'N') ");
//           String again = input.nextLine();
//       }while(again.equalsIgnoreCase("y"));
//        System.out.println("Nice playing with you. Bye!");
//
//
//         */
