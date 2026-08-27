class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i=0;
        while(i<chars.length){
            char c = chars[i];
            int j = i;
            while (i < chars.length && chars[i] == c) {
                i++;
            }
            int count = i - j;
            chars[write++] = c;
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }
        return write;
    }
}