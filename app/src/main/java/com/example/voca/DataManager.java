package com.example.voca;

import android.content.Context;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class DataManager {

    public static List<DataStructure> loadWordList(Context context) {
        ObjectMapper mapper = new ObjectMapper();
        List<DataStructure> wordList = null;

        try {
            InputStream inputStream = context.getAssets().open("data.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }

            reader.close();
            inputStream.close();

            // Use Jackson's TypeReference to deserialize a List<DataStructure>
            wordList = mapper.readValue(builder.toString(), new TypeReference<List<DataStructure>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordList;
    }
}
