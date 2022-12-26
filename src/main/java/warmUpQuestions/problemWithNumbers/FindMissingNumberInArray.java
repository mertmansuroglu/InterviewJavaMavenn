package warmUpQuestions.problemWithNumbers;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int sum = 0;
        int missedSum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            missedSum += arr[i];
        }
        for (int i = 0; i <= arr[arr.length - 1]; i++) {
            sum += i;
        }
        System.out.println(Math.abs(missedSum - sum));
    }

}
