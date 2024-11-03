import java.util.Scanner;

public class LongestCommonPrefixInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[3];


        System.out.println("Please enter 3 words:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }

        String prefix = longestPrefix(strs); 
        System.out.println("Longest common prefix: " + prefix);

        sc.close();
    }

    public static String longestPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int i = 0;
        StringBuilder prefix = new StringBuilder();
        while(i < str1.length()){
            if (str1.charAt(i) == str2.charAt(i)){
                prefix.append(str1.charAt(i));
            }else{
                return prefix.toString();
            }
            i = i+1;
        }
        return prefix.toString();
    }
}
