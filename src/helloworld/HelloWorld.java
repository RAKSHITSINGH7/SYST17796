
package helloworld;
import java.util.*;
/**
 * This class +++ Insert class description here +++
 * 
 * @author Rakshit Singh
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputWord = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String userWord = inputWord.nextLine();
        char[] revArray1= userWord.toCharArray();
        for(int i=revArray1.length-1;i>=0;i--)
        {
            System.out.print(revArray1[i]);
            System.out.print("hello");            
        //added this comment
        }
    }

}
