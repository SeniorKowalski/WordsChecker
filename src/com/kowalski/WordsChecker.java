package com.kowalski;

import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] words = this.text.split("\\P{IsAlphabetic}+");
        HashSet<String> set = new HashSet<>(Arrays.stream(words).toList());
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
