import javax.swing.*;
import java.awt.event.*;

class Frame extends JFrame {
    // Only adjust the X-DIMENSION and Y_DIMENSION. Everything else should be scalable.
    int X_DIMENSION = 1000;
    int Y_DIMENSION = 275;
    final int BUTTON_WIDTH = 300;
    // DO NOT EDIT CONSTANT VARIABLES BELOW THIS LINE
    final int LABEL_WIDTH = (X_DIMENSION / 10);
    final int TEXTFIELD_WIDTH = (X_DIMENSION / 10) * 8;
    final int LABEL_LENGTH = Y_DIMENSION / 8;
    JLabel genreLabel, subjectLabel, characterLabel, wordCountLabel, fictionTypeLabel;
    JTextField genre, subject, character, wordCount, fiction;
    JButton generateButton;
    // Constructor
    Frame(int x, int y) {
        X_DIMENSION = x; Y_DIMENSION = y;
        // Preliminary stuff
        setTitle("Writing Prompt Generator");
        setSize(X_DIMENSION, Y_DIMENSION);
        setLayout(null);
        // Set stuff up for subject label line
        subjectLabel = new JLabel("Subject: ");
        subject = new JTextField();
        subject.setEditable(false);
        subjectLabel.setBounds (5, 5, LABEL_WIDTH, LABEL_LENGTH );
        subject.setBounds(LABEL_WIDTH + 5, 5, TEXTFIELD_WIDTH, LABEL_LENGTH);
        add(subject); add (subjectLabel);
        // set stuff up for character label line
        characterLabel = new JLabel("Character: ");
        character = new JTextField();
        character.setEditable(false);
        characterLabel.setBounds (5, LABEL_LENGTH + 5, LABEL_WIDTH, LABEL_LENGTH );
        character.setBounds(LABEL_WIDTH + 5, LABEL_LENGTH + 5, TEXTFIELD_WIDTH, LABEL_LENGTH);
        add(character); add (characterLabel);
        // set stuff up for genre label line
        genreLabel = new JLabel("Genre: ");
        genre = new JTextField();
        genre.setEditable(false);
        genreLabel.setBounds (5, (LABEL_LENGTH * 2) + 5, LABEL_WIDTH, LABEL_LENGTH );
        genre.setBounds(LABEL_WIDTH + 5, (LABEL_LENGTH * 2) + 5, TEXTFIELD_WIDTH, LABEL_LENGTH);
        add(genre); add (genreLabel);
        // set stuff up for wordCount label line
        wordCountLabel = new JLabel("Word Count: ");
        wordCount = new JTextField();
        wordCount.setEditable(false);
        wordCountLabel.setBounds (5, (LABEL_LENGTH * 3) + 5, LABEL_WIDTH, LABEL_LENGTH );
        wordCount.setBounds(LABEL_WIDTH + 5, (LABEL_LENGTH * 3) + 5, TEXTFIELD_WIDTH, LABEL_LENGTH);
        add(wordCount); add (wordCountLabel);
        // set stuff up for fiction label line
        fictionTypeLabel = new JLabel("Fiction Type: ");
        fiction = new JTextField();
        fiction.setEditable(false);
        fictionTypeLabel.setBounds (5, (LABEL_LENGTH * 4) + 5, LABEL_WIDTH, LABEL_LENGTH );
        fiction.setBounds(LABEL_WIDTH + 5, (LABEL_LENGTH * 4) + 5, TEXTFIELD_WIDTH, LABEL_LENGTH);
        add(fiction); add (fictionTypeLabel);
        // create the Generate button
        generateButton = new JButton("Generate");
        generateButton.setBounds (X_DIMENSION / 2 - BUTTON_WIDTH / 2, LABEL_LENGTH * 5 + 5, BUTTON_WIDTH, LABEL_LENGTH);
        add(generateButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}