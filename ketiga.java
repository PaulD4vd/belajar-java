

public class ketiga {
    public static void main(String[] args) {
        System.out.println("Hello world");

        long[] arrayLong = { 
            10L, 20L, 30L
    };
        int[] variabeInt = new int[] {
             1, 2, 3, 4, 5, 6
    };
        Integer[] variabelinteg = new Integer[] { 10, 9, 8, 7, 6, 5};
        System.out.println(variabeInt[0]);
        System.out.println(variabeInt[2]);
        System.out.println(variabeInt.length);

        // Cara hapus data (mengganti data menjadi 0)
        variabeInt[1] = 10;
        variabeInt[0] = 0;
        System.out.println("Check = " + variabeInt[1]);
        variabelinteg[0] = null;
        System.out.println(variabelinteg[0]);
        System.out.println(variabelinteg.length);

        //nested array
        String[][] members = {
            {"Eko", "Kurniawan"},
            {"Budi", "Tabuti"},
            {"Dean", "Kt"}
        };
        System.out.println(members[0][1]+" "+members[2][0]);
    };
}