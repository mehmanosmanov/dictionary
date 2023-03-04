package dictionary.azeToEng;

import dictionary.main.DictionaryApp;

import java.util.Map;

final class UpdateWord {
    private UpdateWord() {
    }

    public static void update(Map<String, String> dictionary, String key) {
        System.out.println("Yeni tərcümıni daxil edin:");
        dictionary.put(key, DictionaryApp.scan.next().toLowerCase());
        System.out.println(key + " - " + dictionary.get(key));
        AzeToEng.azeToEng();
    }
}
