package src.Day1;

public class Hello {

    public static void main(String[] args){
        System.out.println("Belajar angka coy");

        byte iniAngka = 100;
        short iniAngka1 = 1000;
        int iniAngka2 = 10000;
        long iniAngka3 = 100000;
        long iniAngka4 = 100000L;

        float iniAngkaFloat = 3.14F;
        double iniAngkaDouble = 2.99;

        int decimalInt = 10;
        int hexInt = 0x10;
        int binInt = 0b1010;

        long balance = 10_000;
        int sum = 20_10;

        // Perpindahan data
        byte iniAngkaByte = 10;
        short iniShort = iniAngkaByte;
        int iniInt = iniShort;
        long inilong = iniInt;
        float iniFloating = inilong;
        double iniDoubling = iniFloating;

        System.out.println(iniDoubling);

        //  Character (hanya 1 data)
        char o = 'o';
        char p = 'p';
        char m = 'm';
        System.out.print(o);
        System.out.println(p);
        System.out.println(m);

        // boolean
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        //String 
        String Pertama = "Paul David";
        String kedua = "Dapid";

        System.out.println(Pertama);
        System.out.println(kedua);

        // Menggabungkan String 
        System.out.println(kedua + " " + iniAngka1 + " " + Pertama);
    }
}