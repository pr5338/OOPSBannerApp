public class OOPSBannerApp {
     public static void main(String args[]) { 
		System.out.println(" ***   ***   *****   ***** ");
        System.out.println("*   * *   * *     * *      ");
        System.out.println("*   * *   * *     * *      ");
        System.out.println("*   * *   * *****   ***** ");
        System.out.println("*   * *   * *             ");
        System.out.println("*   * *   * *             ");
        System.out.println(" ***   ***   *        *****");
		
		System.out.println(String.join(" ", " *** ", " *** ", " ***** ", " ***** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*    *", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "*    *", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", " *****", " *****"));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "     *"));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "*   *"));
        System.out.println(String.join(" ", " *** ", " *** ", "*     ", " *****"));
     
	 
	 

        String[] lines = {
            String.join(" ", "  ***  ", "  ***  ", " ****** ", "  ***** "),
            String.join(" ", " **   ** ", " **   ** ", " **    ** ", " **     "),
            String.join(" ", "**     **", "**     **", " **    ** ", " **     "),
            String.join(" ", "**     **", "**     **", " ****** ", "  ***** "),
            String.join(" ", "**     **", "**     **", " **      ", "       **"),
            String.join(" ", " **   ** ", " **   ** ", " **      ", " **    **"),
            String.join(" ", "  ***  ", "  ***  ", " **      ", "  ***** ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
	}
}