import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int arr = sc.nextInt();

        String[] array = new String[20];


        for(int i = 0; i < array.length; i++) {
            if(i%3==0 && 1%5==0){
                array[i-1] = "FizzBuzz";
            }
            else if(1 % 3 ==0){
                array[i-1]= "Buzz";
            }
            else if(1 % 3 == 0){
                array[i-1] = "Fizz";
            }else{
                array[i-1]= Integer.toString(i);
            }

        }
        System.out.println();
    }
}
