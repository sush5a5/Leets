package org.example.Interviews;

public class MergeAlternativeString {
    public static void main(String[] args) {
      String s1="aaa";
      String s2="bbbuuuuu";
      String res=mergeStringsAlt(s1,s2);
      System.out.println(res);
    }

    private static String mergeStringsAlt(String s1, String s2) {
        StringBuffer ans=new StringBuffer();
        int i=0,j=0;
        int m=s1.length();
        int n=s2.length();

       for (i=0;i<m||i<n;i++) {
            if (i < m) {
                ans.append(s1.charAt(i));
            }
            if (i < n) {
                ans.append(s2.charAt(i));
            }
        }
        return String.valueOf(ans);
    }
}
