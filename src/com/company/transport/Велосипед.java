package com.company.transport;

public class Велосипед extends Двухколёсный {
    private String ВидВелосипеда;
    private String ТипРамы;
    private  String Материал;

    public Велосипед(int грузоподъёмность, int cкорость, String назначение,
                     String типДвижителя, int запасТоплива, int расход,
                     int грузовместимость, int количествоОсей, String проходимость,
                     String типПутей, String видВелосипеда, String типРамы, String материал) {

        super(грузоподъёмность, cкорость, назначение, типДвижителя, запасТоплива,
                расход, грузовместимость, количествоОсей, проходимость, типПутей);

        ВидВелосипеда = видВелосипеда;
        ТипРамы = типРамы;
        Материал = материал;
    }

    public String getВидВелосипеда() { return ВидВелосипеда; }

    public void setВидВелосипеда(String видВелосипеда) { ВидВелосипеда = видВелосипеда; }

    public String getТипРамы() { return ТипРамы; }

    public void setТипРамы(String типРамы) { ТипРамы = типРамы; }

    public String getМатериал() { return Материал; }

    public void setМатериал(String материал) { Материал = материал; }
}

