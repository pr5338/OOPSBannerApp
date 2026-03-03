public class OOPSBannerApp {

    // Method to generate O pattern
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Method to generate P pattern
    public static String[] getPPattern() {
        return new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        };
    }

    // Method to generate S pattern
    public static String[] getSPattern() {
        return new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "     *",
                "     *",
                " *****"
        };
    }

    // Main method (entry point of program)
    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                    o[i] + "   " +
                    o[i] + "   " +
                    p[i] + "   " +
                    s[i]
            );
        }
    }
}