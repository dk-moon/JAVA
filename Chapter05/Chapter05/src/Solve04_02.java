/*
 * 2번 문제
 *  A emirp(prime spelled backward) is a non-palindromic prime number
 * whose reversal is also a prime.
 *  (emirp는 자기 자신과 자신의 reverse가 모두 소수이고 회문이 아닌 소수를 말한다.)
 * - For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps.
 * 
 *  Write a program that displays the first 120 emirps.
 *  (첫 120개의 emirps를 출력하는 프로그램을 작성하시오.)
 *  - Display 10 numbers per line, seperated by exactly one space
 *  (한 줄에 10개씩 추가하시오.)
 * 
 *  You must re-use the Practive #1 methods for Practice#2
 *  (반드시 practive#1에서 작성한 metho를 재사용하시오)
 */
public class Solve04_02 {
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

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isEmirp(int number) {
        return isPrime(number) && isPrime(reverse(number)) && !isPalindrome(number);
    }

    public static void main(String[] args) throws Exception {
        int count = 0; // 찾은 emirp의 개수
        int number = 2; // 검사를 숫자의 시작점
        
        while (count < 120) {
            if (isEmirp(number)) {
                count++;
                System.out.print(number + " ");
                if (count % 10 == 0) { // 한 줄에 10개씩 출력
                    System.out.println();
                }
            }
            number++;
        }
    }
}
