package JavaCool303;
/**
 * This class extends Cool303Theme. creates a Cool303PastelTheme
 * @author waelalhashemi
 */
public class Cool303Pastel extends Cool303Theme{

    /**
     * constructor that throws an exception if the string passed to it is not pastel. I.E. not obeing the theme title.
     * @param theme
     */
    public Cool303Pastel(String theme){
        super(theme);
        if(!theme.equalsIgnoreCase("Pastel")) throw new IllegalArgumentException("Wrong Theme");
    }

}
