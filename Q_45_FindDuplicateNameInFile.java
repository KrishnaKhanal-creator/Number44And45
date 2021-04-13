package q44and45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Q_45_FindDuplicateNameInFile {

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/krishnakhanal/Desktop/File/Student.txt";
        File file = new File(filePath);
        String fileData = "";
        Scanner input = new Scanner(file);

        //reading the file and storing the data inside file into a string
        FileReader reader = new FileReader(file);
        while (input.hasNext()){
            fileData = fileData.concat(input.next() + " ");
        }
        fileData = fileData.toLowerCase(Locale.ROOT);
        //converting the sting into a ArrayList
        List<String> myList = new ArrayList<String>(Arrays.asList(fileData.split(" ")));

        System.out.println(myList);
        System.out.println();

        System.out.println("Duplicate names(word) in the file are: ");
        for (int i = 0; i < myList.size(); i++) {
            for (int j = i+1; j < myList.size(); j++) {
               if(myList.get(i).equalsIgnoreCase(myList.get(j))){
                   System.out.println(myList.get(j));
               }
            }
        }
    }
}
