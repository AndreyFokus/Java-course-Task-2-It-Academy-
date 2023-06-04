package Homework2.Year;

public enum Year {
    YEAR_2020,
    YEAR_2021,
    YEAR_2022,
    YEAR_2023;

    public static Year[] getAvailableYears() {
        return values();
    }
}
