package com.example.voca;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView wordTextView = findViewById(R.id.wordTextView);
        TextView definitionTextView = findViewById(R.id.definitionTextView);
        TextView ipaTextView = findViewById(R.id.ipaTextView);
        TextView synonymsTextView = findViewById(R.id.synonymsTextView);
        TextView antonymsTextView = findViewById(R.id.antonymsTextView);

        // Retrieve the search result passed from MainActivity
        DataStructure foundWord = (DataStructure) getIntent().getSerializableExtra("resultWord");

        if (foundWord != null) {
            // Set data to each TextView
            wordTextView.setText("Word: " + foundWord.getWord());
            definitionTextView.setText("Definition: " + foundWord.getDefinition());
            ipaTextView.setText("IPA: " + foundWord.getIpa_pronunciation());
            synonymsTextView.setText("Synonyms: " + foundWord.getSynonyms());
            antonymsTextView.setText("Antonyms: " + foundWord.getAntonyms());
        } else {
            wordTextView.setText("No result data found.");
        }
    }
}
