/*
 * 2번 문제
 *  Write a program that reads three edges for a triangle and
 * computes the perimeter if the input is valid.
 *  Otherwise, display that the input is invalid.
 *  The input is valid for triangle edges if the sum of every
 * pair of two edges is greater than the remaining edge.
 *  삼각형의 3개 변의 길이(실수형)를 사용자로부터 입력받아, 유효하면
 * 삼각형의 둘레를 계산하는 프로그램을 작성하시오. 단, 삼각형의 3변은 모든
 * 조합에 대해 2개 변의 합이 다른 한 변보다 길어야 유효하다.
 * 
 * Here is a sample run:
 * Enter three edges (length in double) : 2.0 3.0 5.0
 * Input is invalid
 * Enter three deges (length in double) : 3.0 3.0 4.0
 * The perimeter is 10.0
 */

 import java.util.Scanner;

public class Solve03_02 {
    public static void main(String[] args) throws Exception {
        // scanner 선언
        Scanner input = new Scanner(System.in);
        
        // 사용자로부터 3개의 변 입력
        System.out.print("Enter three edges (length in double): ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        // 2변의 합과 다른 한 변의 길이 확인
        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            // 둘레 계산
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter);
        } else {
            // 조건 미달성
            System.out.println("Input is invalid");
        }

        input.close();
    }
}
