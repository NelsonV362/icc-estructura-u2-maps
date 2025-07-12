package controllers;

import java.util.HashMap;

public class Ejercicios {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();
    }

    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }
            mapa.put(nums[i], i);
        }

        return null;
    }

    public void contarCaracteres(String texto) {
        HashMap<Character, Integer> conteo = new HashMap<>();

        for (char c : texto.toCharArray()) {
            conteo.put(c, conteo.getOrDefault(c, 0) + 1);
        }

        System.out.println(conteo);
    }

    public boolean sonAnagramas(String palabra1, String palabra2) {
        return areAnagrams(palabra1, palabra2);
    }
}
