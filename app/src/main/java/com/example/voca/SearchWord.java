package com.example.voca;

import java.util.List;

public class SearchWord {

    public static DataStructure searchWord(List<DataStructure> wordList, String searchWord) {
        for (DataStructure word : wordList) {
            if (word.getWord().equalsIgnoreCase(searchWord)) {
                return word;
            }
        }
        return null; // Word not found
    }
}
