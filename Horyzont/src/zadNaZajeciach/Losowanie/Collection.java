package zadNaZajeciach.Losowanie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) throws IOException {
        ArrayList<Object> bigLetters = new ArrayList<Object>();
        ArrayList<Object> bigLettersCopy = new ArrayList<Object>();

        String line;

        final FileReader FR = new FileReader("C:\\Users\\demsk\\Desktop\\IdeaProjects\\Horyzont\\src\\zadNaZajeciach\\Losowanie\\NAPIS.txt");
        BufferedReader reader = new BufferedReader(FR);

        while ((line = reader.readLine()) != null) {
            if (bigLetters.contains(line)) {
               bigLettersCopy.add(line);
            } else {
                bigLetters.add(line);
            }
        }
        reader.close();
        System.out.println(bigLettersCopy);
    }
}


