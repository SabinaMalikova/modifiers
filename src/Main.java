import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Kyrgyzstan", 8000000, "kyrgyz", 200000 );
        Country country2 = new Country("Russia", 143000000, "russian", 17100000);
        Country country3 = new Country("Kazakhstan",20000000, "Kazakh", 2724000 );

        Country[] countries = {country1,country2,country3};

        System.out.println("Самая большая страна по площади: \n"+
                Country.getBiggestCountry(countries));



    }
}