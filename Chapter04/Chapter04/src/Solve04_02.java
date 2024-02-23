/*
 * 2번 문제
 *  A program that plays the scissor-rock-paper game.
 * A program randomly generates a number 0, 1, or 2 representing scissor,
 * rock, and paper.
 *  The program prompts the user to enter a number 0, 1, or 2 and displays
 * a message indicating whether the user or the computer wins, loses, or
 * draws.
 *  Let the user continuously play intul either the user or the computer
 * wins two times more than their opponent
 * 가위바위보(각각 0,1,2로 맵핑) 게임을 프로그래밍하시오. 컴퓨터는 랜덤하게 0,1,2 중
 * 하나를 정하고, 사용자는 0,1,2 중 하나를 입력한다.
 * 사용자나 컴퓨터 중 상대방보다 2번 이상 이기면 게임을 종료한다.
 * (ex-0:2 Game End, 1:2 Game Not End and Continue, 1:3 Game End)
 * 
 *  To test your code, please make sure th computer choice must be
 * printed out as follows:
 *  코드 테스트를 위해 컴퓨터의 랜덤 선택 결과를 사용자 입력 전에 먼저 프린트 하시오.
 */

 import java.util.Scanner;
 import java.util.Random;

public class Solve04_02 {
    public static void main(String[] args) throws Exception {
        // scanner 선언
        Scanner input = new Scanner(System.in);
        // 랜덤 객체 생성(디폴트 시드값 : 현재시간)
        Random random = new Random();
        
        int userWin = 0;
        int comWin = 0;
        while (true) {
            // 컴퓨터의 입력 랜덤하게 받아서 해당 조건에 따른 출력 수행
            int computerNum = random.nextInt(2);
            switch (computerNum){
                case 0:
                    System.out.println("computer is scissor.");
                    break;
                case 1:
                    System.out.println("computer is rock.");
                    break;
                case 2:
                    System.out.println("computer is paper.");
                    break;
                default:
                    System.out.println("computer input error.");
                    return;
            }

            // 사용자 입력
            System.out.print("scissor (0), rock (1), paper (2): ");
            int inputNum = input.nextInt();
            // 입력받은 수가 조건을 만족하는지 확인
            if (inputNum < 1 || inputNum > 2) {
                System.out.println("The number must be between 1 and 2.");
                return; // 프로그램을 종료
            }

            // 사용자가 이긴 경우
            if ((inputNum == 0 && computerNum == 2) || (inputNum == 1 && computerNum == 0) || (inputNum == 2 && computerNum == 1)){
                System.out.println("You Won");
                userWin++;
            }
            // 컴퓨터가 이긴 경우
            else if ((computerNum == 0 && inputNum == 2) || (computerNum == 1 && inputNum == 0) || (computerNum == 2 && inputNum == 1)){
                System.out.println("Computer Won");
                comWin++;
            }
            // 무승부
            else if (computerNum == inputNum){
                System.out.println("Draw");
            }
            // 승부 결과 출력
            if (userWin - comWin == 2){
                System.out.println("You won more than two times");
                input.close();
                return;
            }
            else if (computerNum - userWin == 2){
                System.out.println(("Computer won more than two times"));
                input.close();
                return;
            }
        }
    }
}
