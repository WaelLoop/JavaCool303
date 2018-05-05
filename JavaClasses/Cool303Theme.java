package JavaCool303;

/**
 * This class specifies what the theme is.
 */
public abstract class Cool303Theme {
    private String theme;

    /**
     * constructor that set string theme to the theme passed to it.
     * @param theme
     */
    public Cool303Theme(String theme){
        this.theme = theme;
    }

    /**
     * return the name of the theme.
     * @return String
     */
    public String getTheme(){
        return this.theme;
    }

}