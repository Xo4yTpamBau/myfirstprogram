package com.company.transport;

public abstract class Transport {
    private int Грузоподъёмность;
    private int Cкорость;
    private String Назначение;
    private String ТипДвижителя;
    private int ЗапасТоплива;
    private int Расход;
    private int Грузовместимость;


    public Transport(int грузоподъёмность, int cкорость, String назначение,
                     String типДвижителя, int запасТоплива, int расход, int грузовместимость) {
        Грузоподъёмность = грузоподъёмность;
        Cкорость = cкорость;
        Назначение = назначение;
        ТипДвижителя = типДвижителя;
        ЗапасТоплива = запасТоплива;
        Расход = расход;
        Грузовместимость = грузовместимость;
    }

    public int getГрузоподъёмность() { return Грузоподъёмность; }

    public void setГрузоподъёмность(int грузоподъёмность) { Грузоподъёмность = грузоподъёмность; }

    public int getCкорость() { return Cкорость; }

    public void setCкорость(int cкорость) { Cкорость = cкорость; }

    public String getНазначение() { return Назначение; }

    public void setНазначение(String назначение) { Назначение = назначение; }

    public String getТипДвижителя() { return ТипДвижителя; }

    public void setТипДвижителя(String типДвижителя) { ТипДвижителя = типДвижителя; }

    public int getЗапасТоплива() { return ЗапасТоплива; }

    public void setЗапасТоплива(int запасТоплива) { ЗапасТоплива = запасТоплива; }

    public int getРасход() { return Расход; }

    public void setРасход(int расход) { Расход = расход; }

    public int getГрузовместимость() { return Грузовместимость; }

    public void setГрузовместимость(int грузовместимость) { Грузовместимость = грузовместимость; }
}




