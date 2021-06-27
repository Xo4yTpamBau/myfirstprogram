package com.company.transport;

public abstract class Морской extends Transport{
    private int Водоизмещение;
    private int Дедвэйт;
    private int ЧислоВинтов;
    private String ТипАкваторий;

    public Морской(int грузоподъёмность, int cкорость, String назначение, String типДвижителя,
                   int запасТоплива, int расход, int грузовместимость, int водоизмещение,
                   int дедвэйт, int числоВинтов, String типАкваторий) {

        super(грузоподъёмность, cкорость, назначение, типДвижителя,
                запасТоплива, расход, грузовместимость);

        Водоизмещение = водоизмещение;
        Дедвэйт = дедвэйт;
        ЧислоВинтов = числоВинтов;
        ТипАкваторий = типАкваторий;
    }

    public int getВодоизмещение() { return Водоизмещение; }

    public void setВодоизмещение(int водоизмещение) { Водоизмещение = водоизмещение; }

    public int getДедвэйт() { return Дедвэйт; }

    public void setДедвэйт(int дедвэйт) { Дедвэйт = дедвэйт; }

    public int getЧислоВинтов() { return ЧислоВинтов; }

    public void setЧислоВинтов(int числоВинтов) { ЧислоВинтов = числоВинтов; }

    public String getТипАкваторий() { return ТипАкваторий; }

    public void setТипАкваторий(String типАкваторий) { ТипАкваторий = типАкваторий; }
}

