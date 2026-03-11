
public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = charMap.get(ch);

                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);

    }
}
