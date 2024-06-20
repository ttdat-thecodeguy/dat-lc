package t6;

import java.util.Arrays;

// T.1552
public class MageticForceBalls {
    /*
    class Solution:
    def canPlace(self, x, pos, m):
        prev = pos[0]
        balls = 1
        for i in range(1, len(pos)):
            curr = pos[i]
            if curr - prev >= x:
                balls += 1
                prev = curr
            if balls == m:
                return True
        return False
    def maxDistance(self, position: List[int], m: int) -> int:
        res = 0
        n = len(position)
        position.sort()
        low = 1
        high = int(position[-1] / (m - 1.0)) + 1
        while low <= high:
            mid = low + (high - low) // 2
            if self.canPlace(mid, position, m):
                res = mid
                low = mid + 1
            else:
                high = mid - 1
        return res
     */


    public int maxDistance(int[] pos, int m) {
//        int l = 1, b2 = pos[pos.length - 1], b1 = pos[0];
//        m -= 2;
//
//        Arrays.sort(pos);
//        int mageticForce = b2 - b1;
//        for (int i = l; i <= pos.length - 2; i++) {
//            Math.min(Math.abs(pos[l] - b1), Math.abs(pos[l] - b2))
//        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
