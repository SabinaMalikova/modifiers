public class Country {
    private String name;
    private int population;
    private int square;
    private String language;


    public Country(String name, int population, String language,int square) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.language = language;
    }

    public static Country getBiggestCountry (Country[] countries){
        Country max = countries[0];
        for (Country country:countries){
            if (country.square > max.square){
               max = country;
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return  "        Это " + "\n"+
                "Name: " + name +
                "\npopulation: " + population +
                "\nsquare: " + square +
                "\nlanguage: " + language ;
    }
}
