/*
 * 1번 문제
 *  Write a program that reads an integer between 0 and 1000
 * and multiplies all the digits in the integer.
 *  0부터 1000까지 중 임의의 수를 입력 받아, 각 자리 숫자를 곱하는 프로그램 작성
 *  For example, if an integer is 932, the multiplication of all
 * its digit is 9 * 3 * 2 = 54.
 * 
 *  Here is a sample run:
 * Enter an integer between 0 and 1000: 521
 * The multiplication of all difits in 521 is 10
 */

 import java.util.Scanner;

public class Solve03_01 {
    public static void main(String[] args) throws Exception {
        // scanner 선언
        Scanner input = new Scanner(System.in);
        
        // 사용자에게 0부터 1000 사이의 정수를 입력
        System.out.print("Enter an integer between 0 and 1000: ");
        int input_num = input.nextInt();
        
        // 입력받은 수가 조건을 만족하는지 확인
        int number = input_num;
        if (number < 0 || number > 1000) {
            System.out.println("The number must be between 0 and 1000.");
            return; // 프로그램을 종료
        }

        // 각 자리수를 곱할 결과를 저장할 변수. 초기값은 1로 설정
        int product = 1;

        // number가 0이 아닐 때까지 각 자리의 숫자 곱셈
        while (number > 0) {
            product *= number % 10; // 현재 숫자의 맨 오른쪽 자리를 곱
            number /= 10; // 다음 자리수
        }
        
        // 결과를 출력
        System.out.println(String.format("The multiplication of all digits in %d is %d", input_num, product));
        input.close();
    }
}
