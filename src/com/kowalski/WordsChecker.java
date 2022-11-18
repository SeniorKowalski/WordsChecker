package com.kowalski;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordsChecker {

    private HashSet<String> set = new HashSet<>();

    public WordsChecker(String text) {
        List<String> words = Arrays.stream(text.split("\\P{IsAlphabetic}+")).toList();
        this.set.addAll(words);
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
