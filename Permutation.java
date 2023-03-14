package permutation;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String which involves capital letters: ");
        String permutation = input.nextLine();
        long start;
        long finish; 

        int[] count = {0};          

        boolean b1 = isRepetitive(permutation);
        
        /* 
        if string is repetitive the program will execute overload "loops" method.
        we need to know which letters is exist more than one at after the switch.
        */
        if (b1) {
            start = System.currentTimeMillis();
            boolean[] markRepetitive = findRepetitive(permutation);
            loops("",permutation,count,markRepetitive);
        }
        
        else{
            start = System.currentTimeMillis();
            loops("",permutation,count);
        }    
        finish = System.currentTimeMillis();
        
        System.out.println("There are " + count[0] + " different string permuatations.");
        System.out.println("Elapsed time = " + (double)(finish - start)/1000 + " second.");
    }
    
    public static void loops(String s1, String s2, int[] count, boolean[] markRepetitive) {
        if(s2.length() == 0) {
            System.out.println(s1);
            count[0]++;
        }
        
        // Notice that program will always analyze s2. It creates new permutation which depends on constant s1.   
        markRepetitive = findRepetitive(s2);
        for (int i = 0; i < s2.length(); i++){
            
            //If on hand letter is repetition program will not create new loop. 
            //Because There would be a similar permutation which is already created. We should eliminate these.
            if(markRepetitive[i])
                continue;
            // Calling recursive method to create nested loops.
            else 
                loops(changeLeft(s1, s2, i),changeRight(s2,i),count,markRepetitive);
        }
    }
    
    private static void loops(String s1, String s2, int[] count) {
        if(s2.length() == 0) {
            System.out.println(s1);
            count[0]++;
        }    
        
        for (int i = 0; i < s2.length(); i++) 
            loops(changeLeft(s1, s2, i),changeRight(s2,i),count);
    }
    
    private static boolean isRepetitive(String permutation) {
        for (int i = 0;i < permutation.length(); i++) {
            for (int j = i+1; j < permutation.length(); j++){  
                if (permutation.charAt(i) == permutation.charAt(j))
                    return true;
            }
        }
        return false;
    }

    private static boolean[] findRepetitive(String permutation) {
        boolean[] markRepetitive = new boolean[permutation.length()];
        
        // Notice the letter which takes first place before its similar character will not be marked as repetitive.
        // Because only one of them can create different permutation.
        for (int i = 0;i < permutation.length(); i++) {
            for (int j = i+1; j < permutation.length(); j++) {
                if(!markRepetitive[j]){    
                    if (permutation.charAt(i) == permutation.charAt(j)) 
                        markRepetitive[j] = true;
                }    
            }
        }
        return markRepetitive;
    }
    
    private static String changeLeft(String s1, String s2, int i) 
        {return s1 + s2.charAt(i);}

    private static String changeRight(String s2, int i) 
        {return s2.substring(0, i)+ s2.substring(i+1);}
}
