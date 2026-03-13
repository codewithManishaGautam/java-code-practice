// Check palindrome string
class PalStr{
    public static void main(String[] args) {
        String s="madam",r="";
        for(int i=s. length()-1;i>=0;i--)
         r+=s.chartAt(i);
         if(s.equals(r)) System.out.println("Palindrome");
    }
}