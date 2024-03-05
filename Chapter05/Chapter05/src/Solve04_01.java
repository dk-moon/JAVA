/*
 * 1번 문제
 *  A number is a palindrome if its reversal is the same as itself
 *  ('회문'은 앞에서 읽으나, 뒤에서 읽으나 같은 단어/숫자를 의미한다)
 * 
 *  Write the methods with the following headers
 *  (다음의 header를 가지는 method를 작성하시오.)
 *  - piblic static int reverse(int number)
 *  // Return the reversal of an integer, i.e. reverse(456) return 654
 *  - public static boolean isPalindrom(int number)
 *  // Return true if number is a palindrome
 * 
 *  Use the reverse method to implement isPalindrome method.
 *  (반드시 작성한 reverse method를 isPalindrome method를 작성할 때 이용하시오.)
 * 
 *  Write a test program that prompts the user to enter an integer and
 * reports whether the integer is a palindrom.
 *  (사용자에게 숫자를 입력을 받아, 숫자가 회문인지 아닌지 판별하는 테스트 프로그램을 작성하시오.)
 */
import java.util.Scanner;

public class Solve04_01 {
    public static int reverse(int number){
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // 마지막 자리수 추출
            reversed = reversed * 10 + digit;
            number /= 10; // 마지막 자리수 제거
        }
        return reversed;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number); // 숫자와 그 숫자의 역순이 같은지 비교
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: "); // 사용자로부터 정수 입력 요청

        int number = input.nextInt();
        
        // 입력받은 숫자가 회문인지 확인하고 결과 출력
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
