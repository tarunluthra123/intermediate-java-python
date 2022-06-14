public class SumOfAllSubarray {
    void sumOfAllSubarray(int []A) {
        int n = A.length;
        for (int i=0;i<n;i++) {
            int sum = 0;
            for (int j=i;j<n;j++) {
                sum += A[j];
                System.out.println(sum);
            }    
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        SumOfAllSubarray obj = new SumOfAllSubarray();
        obj.sumOfAllSubarray(arr);
    }
}
