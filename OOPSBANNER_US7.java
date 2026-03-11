public class OOPSBANNER_US7{

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = { o, o, p, s };

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    /**
     * Static inner class to encapsulate a character
     * and its corresponding banner pattern.
     */
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}