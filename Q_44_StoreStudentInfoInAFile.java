package q44and45;

import java.io.*;
import java.util.Scanner;

public class Q_44_StoreStudentInfoInAFile {

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/krishnakhanal/Desktop/File/Student.txt";
        Scanner input = new Scanner(System.in);
        String fileData = "";
        int student = 1;

        File file = new File(filePath);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(file.exists()){
            System.out.println("File already exist!");
        }else {
            System.out.println("File created;");
        }

        while (student <= 10){
            System.out.println("Enter student name: ");
            String name = input.nextLine();
            System.out.println("Enter student Address: ");
            String address = input.nextLine();
            fileData = fileData.concat( student + " Student Name: " + name).concat(" Student Address: " + address) + "\n";
            student++;
        }
        FileWriter writeOnFile = new FileWriter(filePath);
        writeOnFile.write(fileData);
        writeOnFile.close();
    }
}
