/*
 * 2번 문제
 * 
 * - Suppose two line segments intersect.
 * The two end points for the first line segment are (x1,y1) and (x2,y2)
 * and for the second line segment are (x3,y3) and (x4,y4)
 * (2개의 line의 end point가 (x1,y1)과 (x2,y2),(x3,y3)과 (x4,y4) 일때,
 * 2개의 Line이 교차한다고 하자)
 * 
 * - Write a program that prompts the user to enter these four endpoints
 * and displays the intersecting point
 * (사용자에게서 4개 포인트의 좌표를 입력받고, 교차점의 좌표를 출력하는 프로그램을 작성하시오)
 * 
 * The intersecting point can be found by solving a liner equation
 * (교차점의 좌표는 linear equation 을 풀면 찾을 수 있음)
 * 
 * Use the Linear Equation class in Practive#1 to solve this equation
 * (Practice#1에서 작성한 linear equation class를 이용하시오)
*/

import java.util.Scanner;

public class solve02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // a,b,c,d,e,f 에 대해서 계산
        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("The intersecting point is at (" + equation.getX() + ", " + equation.getY() + ")");
        } else {
            System.out.println("The two lines do not intersect.");
        }
    }
}
