import java.util.*;
class longestsubstring
{
    public static int longstringlength(String s)
    {
        Set<Character> set = new HashSet<>();

        int max = 0;
        int left = 0;

        for(int right = 0 ; right < s.length() ; right++)
        {
            char ch = s.charAt(right);

            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);

            int len = right-left+1;

            max = Math.max(max,len);



        }

        return max;
    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");

        String str = sc.next();

        int result = longstringlength(str);

        System.out.println("Longest Substring Length is  : "+ result);

    }
}