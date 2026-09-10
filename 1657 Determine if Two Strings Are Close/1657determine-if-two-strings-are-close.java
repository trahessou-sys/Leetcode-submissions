class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){return false;}
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();

        int[] occu1= new int[26];
        int[] occu2= new int[26];

        for (char c : word1.toCharArray()) {
            s1.add(c);
            occu1[c-'a']+=1;
        }

        for (char c : word2.toCharArray()) {
            s2.add(c);
            occu2[c-'a']+=1;
        }

        if(!s1.equals(s2)){return false;}
        Arrays.sort(occu1);
        Arrays.sort(occu2);
        return Arrays.equals(occu1,occu2);

    }
}