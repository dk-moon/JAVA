/*
 * 1번 문제
 *  Display pyramid. Write a program that prompts the user to
 * enter an integer from 1 to 15 and displays a pyramid, as shown
 * in the following sample run
 *  1부터 15까지의 숫자를 입력 받고, 아래 그림과 같이 피라미드 형태로 출력하는 프로그램을 작성하시오
 * 
 * Please make sure that the lines greater than 10 should be also aligned as follows
 * 입력 숫자가 10 이상일 때도 아래와 같이 정렬이 잘 맞도록 유의하여 프로그램을 작성하시오
 * 
 * Enter the number of lines : 13
 *                             1
 *                           2 1 2
 *                         3 2 1 2 3
 *                       4 3 2 1 2 3 4
 *                     5 4 3 2 1 2 3 4 5
 *                   6 5 4 3 2 1 2 3 4 5 6
 *                 7 6 5 4 3 2 1 2 3 4 5 6 7
 *               8 7 6 5 4 3 2 1 2 3 4 5 6 7 8
 *             9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9
 *          10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10
 *       11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11
 *    12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12
 * 13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13
 */

 import java.util.Scanner;

public class Solve04_01 {
    public static void main(String[] args) throws Exception {
        // scanner 선언
        Scanner input = new Scanner(System.in);
        
        // 사용자에게 0부터 1000 사이의 정수를 입력
        System.out.print("Enter the number of lines: ");
        int inputNum = input.nextInt();

        // 입력받은 수가 조건을 만족하는지 확인
        if (inputNum < 1 || inputNum > 15) {
            System.out.println("The number must be between 1 and 15.");
            return; // 프로그램을 종료
        }

        // 입력 받은 수 만큼 반복문 수행
        for(int i = 1; i <= inputNum; i++){
            // 공백 출력
            for (int j = 1; j <= (inputNum - i); j++) {
                System.out.print("   "); // 더 넓은 숫자에 맞춰 조정
            }
            // 감소하는 숫자 출력
            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d ", j);
            }
            // 증가하는 숫자 출력
            for (int j = 2; j <= i; j++) {
                System.out.printf("%2d ", j);
            }
            // 줄바꿈
            System.out.println();
        }

        input.close();
    }
}
