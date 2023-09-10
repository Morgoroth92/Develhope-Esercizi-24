
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public void monthEndWithY() {
        if (this.name().endsWith("Y")) {
            System.out.println(this.name() + " ends with the letter y");
        } else {
            System.out.println(this.name() + " doesn't end with the letter y");
        }
    }
}

