package com.example.datastructure.leetcode_algorithm;
/**

Given a datastructure.string S and a datastructure.string T, count the number of distinct subsequences of T in S.

        A subsequence of a datastructure.string is a new datastructure.string which is formed from the original datastructure.string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

        Here is an example:
        S = "rabbbit", T = "rabbit"

        Return 3.

*/

public class q115_DistinctSubsequences {


    /**
     * �ⷨ1 DP
     * @param s
     * @param t
     * @return
     */
    public int numDistinct(String s, String t) {
        int[][] mem = new int[t.length()+1][s.length()+1];
        for(int j = 0; j<s.length();j++) {
            mem[0][j] = 1;
        }
        for(int i = 0; i<t.length();i++) {
            for(int j = 0; j<s.length(); j++) {
                if(t.charAt(i) == s.charAt(j)){
                    mem[i + 1][j + 1] = mem[i][j] + mem[i + 1][j];
                }else {
                    mem[i + 1][j + 1] = mem[i + 1][j];
                }
            }
        }
        return mem[t.length()][s.length()];
    }
}
