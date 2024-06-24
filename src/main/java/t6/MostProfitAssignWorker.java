package t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MostProfitAssignWorker {

    /*
    You have n jobs and m workers. You are given three arrays: difficulty, profit, and worker where:

    difficulty[i] and profit[i] are the difficulty and the profit of the ith job, and
    worker[j] is the ability of jth worker (i.e., the jth worker can only complete a job with difficulty at most worker[j]).
    Every worker can be assigned at most one job, but one job can be completed multiple times.

    For example, if three workers attempt the same job that pays $1, then the total profit will be $3. If a worker cannot complete any job, their profit is $0.
    Return the maximum profit we can achieve after assigning the workers to the jobs.



    Example 1:

    Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
    Output: 100
    Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a profit of [20,20,30,30] separately.
    Example 2:

    Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
    Output: 0

    moi cong nhan se chi duoc nhan viec co do kho tuong duong hoac thap hon

    */

    public static void main(String[] args) {
        System.out.println(maxProfitAssignment(new int[] { 2,4,6,8,10 },
                new int[] { 10,20,30,40,50 },
                new int[] { 4,5,6,7 }));
    }

    public static int maxProfitAssignment(int[] difficulty,
                                   int[] profit,
                                   int[] worker) {
        int mProfit = 0;
        // nhom cac cong viec va tien luong lai
        List<int[]> jobProfile = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++) {
            jobProfile.add(new int[] { difficulty[i], profit[i] });
        }
        //sort it
        Collections.sort(jobProfile, Comparator.comparingInt(a -> a[0]));
        //with each worker find difficultiy with same or less
        for (int i = 0; i < worker.length; i++) {
            int ability = worker[i];

            int l = 0, r = jobProfile.size() - 1, workerProfit = 0;
            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (jobProfile.get(mid)[0] > ability)
                    r = mid - 1;
                // neu cong viec do de hon thi xem xet cong viec kho hon
                else {
                    workerProfit = Math.max(workerProfit, jobProfile.get(mid)[1]);
                    l = mid + 1;
                }
            }
            mProfit += workerProfit;

        }
        return mProfit;
    }
}
