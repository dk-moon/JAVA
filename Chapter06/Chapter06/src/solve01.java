/*
 * 1번 문제
 * - Design a class named LinearEquation for a 2x2 system of
 * linear equation
 * (다음의 linear equation을 푸는 LinearEquation class를 작성하시오)
 * - ax + by = e
 * - cx + dy = f
 * - x = (ed - bf) / (ad - bc)
 * - y = (af - ec) / (ad - bc)
 * 
 * - The class contains
 *  - Private data fields a,b,c,d,e and f
 *  (a,b,c,d,e,f는 private field여야 함)
 *  - A constructor with the arguments for a,b,c,d,e and f
 *  (a,b,c,d,e,f를 argument로 하는 생성자가 있어야 함)
 *  - Six getter methods forr a,b,c,d,e and f
 *  (a,b,c,d,e,f 각각을 위한 6개의 get method가 있어야 함)
 *  - A method names isSolvable() that return true if (ad-bc)
 *  is not 0
 *  (ad-bc가 0이 아니면 true를 리턴하는 isSolvable() method가 있어야함)
 *  - Methods getX() and getY() that returns the solution for
 *  the equation
 *  (방정식의 해를 리턴하는 getX(), getY() method가 있어야함)
 * 
 * - Draw the UML diagram for the class and the implemetn the class
 * (UML 다이어그램을 그리고 클래스를 작성하시오)
 * - Write a test program that prompts the user to enter a,b,c,d,e and f
 * and displays result
 * (a,b,c,d,e,f 입력을 받고 결과를 출력하는 테스트 프로그램을 작성하시오)
 * - If ad-bc is 0, report that "The equation ha no solution"
 * (ad-bc = 0이면, "the equation has no solution"을 출력하시오)
*/
import java.util.Scanner;

public class solve01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b,c,d,e,f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation le = new LinearEquation(a, b, c, d, e, f);

        if (le.isSolvable()){
            System.out.println("X : " + le.getX());
            System.out.println("Y : " + le.getY());
        }
        else{
            System.out.println("The equation has no solution.");
        }
    }
}
