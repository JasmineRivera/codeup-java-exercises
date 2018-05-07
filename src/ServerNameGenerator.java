public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives =
                {"beautiful", "gorgeous",
                        "busted", "dusted",
                        "stunning", "sickening",
                        "fishy", "fierce",
                        "terrible", "unique"};
        String[] nouns =
                {" wig", " geish",
                        " beat", " gown",
                        " realness", " coin",
                        " squirrelfriends", " tea",
                        " tuck", " shade"};
        String randomAdjective = adjectives[(int) (Math.floor(Math.random() * adjectives.length))];
        String randomNoun = nouns[(int) (Math.floor(Math.random() * nouns.length))];
        System.out.println(randomAdjective + randomNoun);
    }
}

