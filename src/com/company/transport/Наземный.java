package com.company.transport;

public abstract class Наземный extends Transport {
    private int КоличествоОсей;
    private String Проходимость;
    private String ТипПутей;

    public Наземный(int грузоподъёмность, int cкорость, String назначение,
                    String типДвижителя, int запасТоплива, int расход,
                    int грузовместимость, int количествоОсей, String проходимость, String типПутей) {

        super(грузоподъёмность, cкорость, назначение, типДвижителя, запасТоплива, расход, грузовместимость);

        КоличествоОсей = количествоОсей;
        Проходимость = проходимость;
        ТипПутей = типПутей;
    }

    public int getКоличествоОсей() { return КоличествоОсей; }

    public void setКоличествоОсей(int количествоОсей) { КоличествоОсей = количествоОсей; }

    public String getПроходимость() { return Проходимость; }

    public void setПроходимость(String проходимость) { Проходимость = проходимость; }

    public String getТипПутей() { return ТипПутей; }

    public void setТипПутей(String типПутей) { ТипПутей = типПутей; }
}
