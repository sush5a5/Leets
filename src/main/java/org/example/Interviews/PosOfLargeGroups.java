package org.example.Interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PosOfLargeGroups {

    public static void main(String[] args) {

    }

        public static List<List<Integer>> largeGroupPositions(final String s) {
            final List<List<Integer>> result = new ArrayList<>();
            int start = 0;
            char prev = s.charAt(0);

            for(int i = 0; i < s.length(); ++i) {
                if(prev != s.charAt(i)) {
                    if(i - start > 2)
                        result.add(Arrays.asList(start, i - 1));

                    start = i;
                    prev = s.charAt(i);
                }
            }

            if(s.length() - start > 2)
                result.add(Arrays.asList(start, s.length() - 1));

            return result;
        }

}
