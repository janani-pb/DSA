import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }
        
        List<Integer> list = new ArrayList<>();
        buildNumber(count, 0, 0, list);
        
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private void buildNumber(int[] count, int pos, int num, List<Integer> list) {
        if (pos == 3) {
            list.add(num);
            return;
        }

        for (int d = 0; d <= 9; d++) {
            if (count[d] == 0) continue;
            if (pos == 0 && d == 0) continue;
            if (pos == 2 && d % 2 != 0) continue;

            count[d]--;
            buildNumber(count, pos + 1, num * 10 + d, list);
            count[d]++;
        }
    }
}