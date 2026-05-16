class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.replaceAll("[^A-Za-z0-9]","");
        
        System.out.println(s);

        StringBuilder sb=new StringBuilder(s);
        String y=sb.reverse().toString();
        System.out.println(y);

        if(s.equalsIgnoreCase(y)) return true;
        return false;

    }
}
