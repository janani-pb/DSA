class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact= 1;
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            if (i < n) fact*= i; 
        }
        
        k--; 
        StringBuilder sb = new StringBuilder();
        
        for (int i = n; i > 0; i--) {
            int index = k / fact;
            sb.append(numbers.remove(index));
            if (i > 1) {
                k %= fact;
                fact /= (i - 1);
            }
        }
        
        return sb.toString();
    }
}