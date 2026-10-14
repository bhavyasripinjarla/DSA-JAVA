@SuppressWarnings("unused")
class Solution1 {
    public int maxDepth(String s) {
        // Your code goes here
        int currentDepth = 0;
        int maxDepth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                currentDepth++;
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            } else if (ch == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
}