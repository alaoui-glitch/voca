package com.example.voca;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText searchEditText;
    private TextView resultTextView;
    private List<DataStructure> wordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchEditText = findViewById(R.id.searchEditText);
        Button searchButton = findViewById(R.id.searchButton);
        resultTextView = findViewById(R.id.resultTextView); // Initialize the resultTextView

        wordList = DataManager.loadWordList(this);

        searchButton.setOnClickListener(v -> performSearch());
    }


    private void performSearch() {
        String searchWord = searchEditText.getText().toString();

        if (wordList != null) {
            DataStructure foundWord = SearchWord.searchWord(wordList, searchWord);

            if (foundWord != null) {
                // Log the foundWord details
                Log.d("MainActivity", "Found word: " + foundWord.getWord());

                // Create an Intent to start ResultActivity and pass search result
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("resultWord", foundWord);
                startActivity(intent);
            } else {
                resultTextView.setText("Word not found.");
            }
        } else {
            resultTextView.setText("Word list is not loaded.");
        }
    }
}
