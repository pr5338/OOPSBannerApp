
public class OOPSBannerApp{
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        char getCharacter() {
            return character;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    // Create pattern maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "   ***    ",
			" **   **  ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			" **   **  ",
			"   ***    "
        };

        String[] P = {
            "*****   ",
            "**   ** ",
            "**    **",
            "**   ** ",
            "*****   ",
            "**      ",
            "**      ",
			"**      "
        };

        String[] S = {
            "    ***** ",
            "  **      ",
            " **       ",
            "  **      ",
            "    ***   ",
            "       ** ",
			"        **",
            "  ******  "
        };

        String[] space = {
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
			"     ",
			"     ",
			"     "
        };

        CharacterPatternMap[] maps = new CharacterPatternMap[4];
        maps[0] = new CharacterPatternMap('O', O);
        maps[1] = new CharacterPatternMap('P', P);
        maps[2] = new CharacterPatternMap('S', S);
        maps[3] = new CharacterPatternMap(' ', space);

        return maps;
    }

   
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }


    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[i] + " ");
            }
            System.out.println();
        }
    }

 
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}