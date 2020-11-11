package arrays.com.pascodev.anagram;

import java.util.Arrays;

/**
 *                    ANAGRAM PROBLEM
 *       an anagram is a word or phrase formed by rearranging the letters
 *       of a differnt word or phrase, typically using all the original letters exactly once
 *
 *       --> the original word or phrase is called SUBJECT
 *       --> any word or phrase that exactly reproduces the letters in another order is an
 *           anagram
 *
 *           ------> for example: RESTFUL - FLUSTER
 **/

public class AnagramProblem {

    public boolean solve(char[] s1, char[] s2){

        if (s1.length != s2.length) return false;

        // bottleneck because it has O(NlogN) running time
        Arrays.sort(s1);
        Arrays.sort(s2);

        // running time is O(N)
        // O(NLogN) + O(N) = O(NLog) the first algorithm is slower
        for (int i = 0; i < s1.length; i ++)
            if (s1[i] != s2[i])
                return false;

        return true;
    }
}
