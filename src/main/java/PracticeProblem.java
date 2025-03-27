import java.io.*;
import java.util.*;

public class PracticeProblem {

	public static String getName(int line, String file) {
        try {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);
            int currentLineNumber = 1;

            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                if (currentLineNumber == line) {
                    String[] parts = currentLine.split(" ");
					scanner.close();
                    return parts[0] + " " + parts[1];  
                }
                currentLineNumber++;
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";  
    }

    public static int getAge(int line, String file) {
        try {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);
            int currentLineNumber = 1;

            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                if (currentLineNumber == line) {
                    String[] parts = currentLine.split(" ");
					scanner.close();
                    return Integer.parseInt(parts[2]); 
                }
                currentLineNumber++;
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;  
    }

    public static int getNumber(int line, String file) {
        try {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);
            int currentLineNumber = 1;

            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                if (currentLineNumber == line) {
                    String[] parts = currentLine.split(" ");
					scanner.close();
                    return Integer.parseInt(parts[3]);  
                }
                currentLineNumber++;
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;  
    }

    public static void fileAppend(String output, String filename) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(output);  
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	// chicken jockey, I AM STEVE, flint an' steel
}

