/*
 *  배열 문제
 *  Suppose the weekly hours for all employees are stored in a two-dimensional array.
 * Each row records an employee's seven day work hours with seven columns.
 *  (모든 근로자의 주간 근로 시간이 저장된 2-dim array가 아래와 같다.)
 *     Su M T W Th F Sa 
 *  E0 2  4 3 4 5  8 8
 *  E1 7  3 4 3 3  4 4
 *  E2 3  3 4 3 3  2 2
 *  E3 9  3 4 7 3  7 1
 *  E4 3  5 4 3 6  3 8
 *  E5 3  4 4 6 3  4 4
 *  E6 3  7 4 8 3  8 4
 *  E7 6  3 5 9 2  7 9
 * 
 *  Write a program the displays employees and their total hours in decreasing
 * order of the total hours
 *  (각 근로자의 총 근로시간을 내림차순으로 정렬하여 출력하는 프로그램을 작성하시오)
 * E7 : 41
 * E6 : 37
 * E0 : 34
 * E4 : 32
 * E3 : 31
 * E1 : 28
 * E5 : 28
 * E2 : 20
 */
public class Solve04_03 {
    public static void quickSort(int[][] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[][] arr, int low, int high) {
        int pivot = arr[high][1];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j][1] > pivot) {
                i++;

                // swap arr[i] and arr[j]
                int[] temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int[] temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
    public static void main(String[] args) throws Exception {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 7, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        // 각 직원의 총 근로 시간 계산
        int[] totalHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                totalHours[i] += hours[i][j];
            }
        }

        // 직원 번호와 함께 총 근로 시간을 저장할 배열 생성
        int[][] totalHoursWithIndex = new int[hours.length][2];
        for (int i = 0; i < totalHours.length; i++) {
            totalHoursWithIndex[i][0] = i; // 직원 번호
            totalHoursWithIndex[i][1] = totalHours[i]; // 총 근로 시간
        }

        // 퀵소트를 사용하여 총 근로 시간을 기준으로 내림차순 정렬
        quickSort(totalHoursWithIndex, 0, totalHoursWithIndex.length - 1);

        // 결과 출력
        for (int[] employee : totalHoursWithIndex) {
            System.out.println("E" + employee[0] + " : " + employee[1]);
        }
    }
}
