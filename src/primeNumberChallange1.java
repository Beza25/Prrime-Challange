import java.util.Scanner;

public class primeNumberChallange1 {
    public static void main(String[] args) {

        if (IsPrime() == true){
            System.out.println("It is a prime number.");
        }else {
            System.out.println("It is not a prime number.");
        }
    }

    public static Boolean IsPrime(){
        Scanner input = new Scanner(System.in);
        String another;
        boolean isPrime = false;
        do{
            System.out.println("Enter a number above 1, and I will tell you if number is prime or not");
            int num = input.nextInt();

            if(num <= 1){
                System.out.println("Enter a number greater than 1");
            }else{
                for(int i = 2; i < num; i++){
                    if(num%i == 0){
                        isPrime = false;
                        break;
                    }else{
                        isPrime = true;
                    }
                }

            }

            System.out.println("Do you want to enter another number? ('Y'/'N')");
           another = input.nextLine();
            return isPrime;

        }while(another.equalsIgnoreCase("y"));





    }
}

