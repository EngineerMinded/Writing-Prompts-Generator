/**************************************
 * Wayne Mack                         *
 * wamj283@gmail.com                  *
 * (443) 627 - 1117                   *
 * -----------------------------------*
 * Random Writing Prompt Generator    *
 * Written in JAVA                    *
 * I wrote this for my wife to        *
 * generate random writing prompts    *
 **************************************/
import javax.swing.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class main {
    static Frame mainMenu;
    public static void main (String [] args) {
        mainMenu = new Frame(1000, 275);
        mainMenu.generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //mainMenu.genre.setText("generate Button is clicked here");
                generateRandomResponses();
            }
        });
    }

    /************************************************************************
     * NOTE: You can add your own elements by editting the text files below.*
     ************************************************************************/
    static void generateRandomResponses() {
        LinkedList<String> genreList = getList("genres.txt");
        LinkedList<String> characterList = getList("characters.txt");
        LinkedList<String> subjectList = getList ("subjects.txt");
        LinkedList<String> fictionList = getList("fictions.txt");
        mainMenu.genre.setText(getRandomAnswer(genreList));
        mainMenu.character.setText(getRandomAnswer(characterList));
        mainMenu.subject.setText((getRandomAnswer(subjectList)));
        String fictionChoice = (getRandomAnswer(fictionList));
        LinkedList<String> wordCount = new LinkedList<String>();
        if (fictionChoice.contains("Screenplay")) {
            mainMenu.wordCountLabel.setText("Page Count: ");
            wordCount.add("5"); wordCount.add("8"); wordCount.add("12");
        }
        else {
            mainMenu.wordCountLabel.setText("Word Count: ");
            wordCount.add("2,500"); wordCount.add("2,000"); wordCount.add("1,500");
        }
        mainMenu.wordCount.setText(getRandomAnswer(wordCount));
        mainMenu.fiction.setText((fictionChoice));
    }

    static LinkedList<String>getList(String fileName) {
        LinkedList<String> lines = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // You can handle the exception according to your needs
            JOptionPane.showMessageDialog(null, "File Not Found: " + fileName, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // You can handle the exception further if needed
        }
        return lines;
    }

    static String getRandomAnswer(LinkedList<String> list2Use) {
        // Check if the list is not empty
        if (list2Use.isEmpty()) {
            return "NO ANSWER";
        }
        // Generate a random index within the bounds of the list
        int randomIndex = new Random().nextInt(list2Use.size());
        // Return the randomly selected string
        return list2Use.get(randomIndex);
    }
}