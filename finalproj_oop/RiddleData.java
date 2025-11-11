package finalproj_oop;

public class RiddleData {
    // ---------- NORMAL ROUTE (Doors 1–10) ----------
    public static String[] normalRiddles = {
        "             I have keys but no locks. I have space but no room. You can enter but can’t go outside. What am I?",
        "            I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
        "                                                                       What has to be broken before you can use it?",
        "                                                          I’m tall when I’m young and short when I’m old. What am I?",
        "                                                                               What has a head and a tail but no body?",
        "                                                                         I’m full of holes but still hold water. What am I?",
        "                               I have cities but no houses, forests but no trees, and water but no fish. What am I?",
        "                                                                  The more of this there is, the less you see. What is it?",
        "  I’m not alive, but I grow; I don’t have lungs, but I need air; I don’t have a mouth, but water kills me. What am I?",
        "                I can fly without wings. I can cry without eyes. Wherever I go, darkness follows me. What am I?",
        // ---------- FINAL QUESTION ----------
        "                                                                     Final Question: How do you defeat the dragon?"
    };

    public static String[][] normalChoices = {
        {"A. Keyboard", "B. Map", "C. Piano", "D. Door"},
        {"A. Wind", "B. Shadow", "C. Song", "D. Echo"},
        {"A. Box", "B. Glass", "C. Egg", "D. Shell"},
        {"A. Matchstick", "B. Candle", "C. Tree", "D. Torch"},
        {"A. Worm", "B. Snake", "C. Rope", "D. Coin"},
        {"A. Sponge", "B. Net", "C. Bottle", "D. Basket"},
        {"A. Book", "B. Map", "C. Globe", "D. Painting"},
        {"A. Darkness", "B. Smoke", "C. Night", "D. Fog"},
        {"A. Candle", "B. Cloud", "C. Wind", "D. Fire"},
        {"A. Rain", "B. Cloud", "C. Wind", "D. Smoke"},
        // ---------- FINAL QUESTION CHOICES ----------
        {"A. Use sword", "B. Use magic spell", "C. Use donkey charm", "D. Run away"}
    };

    // Correct answers now mix A–D plus final one
    public static String[] normalAnswers = {"A","D","C","B","D","A","B","A","D","B","C"};

    // ---------- HARD ROUTE (Shortcut Path) ----------
    public static String[] hardRiddles = {
        "<html><div style='text-align:center;'>I am crafted for someone I will never serve, purchased by those who will never wield me, and used by those who cannot speak to thank me. What am I?</div></html>",
        "                      I turn once, what is out will not get in. I turn again, what is in will not get out. What am I?",
        "                     I build up castles; I tear down mountains. I make some men blind; I help others to see. What am I?",
        "                       I’m always hungry, I must always be fed. The finger I touch will soon turn red. What am I?",
        // ---------- FINAL QUESTION ----------
        "                                                                     Final Question: How do you defeat the dragon?"
    };

    public static String[][] hardChoices = {
        {"A. Key", "B. Mask", "C. Coffin", "D. Secret"},
        {"A. Door", "B. Key", "C. Lock", "D. Safe"},
        {"A. Wind", "B. Fire", "C. Time", "D. Sand"},
        {"A. Fire", "B. Dragon", "C. Snake", "D. Sun"},
        // ---------- FINAL QUESTION CHOICES ----------
        {"A. Use sword", "B. Use magic spell", "C. Use donkey charm", "D. Run away"}
    };

    // Randomized correct letters here too
    public static String[] hardAnswers = {"C","B","D","A","C"};
}
