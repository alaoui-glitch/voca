package com.example.voca;
import java.io.Serializable;
import java.util.List;

public class DataStructure implements Serializable {
    private String word;
    private String definition;
    private String ipa_pronunciation;
    private List<String> synonyms;
    private List<String> antonyms;

    // Constructors
    public DataStructure() {
    }

    public DataStructure(String word, String definition, String ipa_pronunciation, List<String> synonyms, List<String> antonyms) {
        this.word = word;
        this.definition = definition;
        this.ipa_pronunciation = ipa_pronunciation;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
    }

    // Getters and setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getIpa_pronunciation() {
        return ipa_pronunciation;
    }

    public void setIpa_pronunciation(String ipa_pronunciation) {
        this.ipa_pronunciation = ipa_pronunciation;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public List<String> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }
}
