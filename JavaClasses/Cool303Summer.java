package JavaCool303;

/**
 * This class extends Cool303Theme. creates a Cool303SummerTheme
 */
public class Cool303Summer extends Cool303Theme{
    /**
     * constructor that throws an exception if the string passed to it is not summer. I.E. not obeing the theme title.
     * @param theme
     */
    public Cool303Summer(String theme){
        super(theme);
        if(!theme.equalsIgnoreCase("Summer")) throw new IllegalArgumentException("Wrong Theme");
    }
}
