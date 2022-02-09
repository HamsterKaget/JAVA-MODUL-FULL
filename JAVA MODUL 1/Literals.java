public class Literals {
    
    // Code by Radja Aulia Al Ramdani => github.com/HamsterKaget
    public static void main(String[] args) {
        
        // Integer Literals 
        intLiterals();

        // Float Literals
        floatLiterals();

        // Char Literals
        charLiterals();


    }

    private static void intLiterals () {
        /* Decimal Literal ( Basis 10 ) {
            > tidak harus diawali oleh prefix apapun
            > menyimpan angka dari 0 - 9
        } */
        int desimalLiteral = 90;

        /* Octal Literal ( Basis 8 ) {
            > harus di awali dengan angka 0
            > menyimpan angka dari 0 - 7 
        } */
        int octalLiteral = 0146;

        /* Hexa-Desimal Literal ( Basis 16 ) {
            > harus diawali dengan 0x atau 0X
            > menyimpan angka dari 0 - 9 dan karakter a -f
            > tidak Case Sensitive , bisa [ A - F , a - f]
        } */
        int hexaLiteral = 0x123Face;

        /* Binary Literal ( Basis 2 ) {
            > harus diawali dengan 0b atau 0B
            > menyimpan angka 0 dan 1
        } */
        int binaryLiteral = 0b11101;

        System.out.println("Desimal : " + desimalLiteral);
        System.out.println("Octal : " + octalLiteral);
        System.out.println("Hexa-Desimal : " + hexaLiteral);
        System.out.println("Binary : " + binaryLiteral);
    }

    private static void floatLiterals() {
        // Float Literals

        /* decimal Literal ( basis 10 ) {
            > menyimpan angka dari 0 - 9
            > bisa menggunakan awalan 0 atau tidak sama saja
        } */
        
        float decimalFloat= 90f;
        // Atas bawah sama sama 90 dalam desimal 
        float decimalFloat1 = 090f;

        System.out.println("Float Desimal Tanpa Prefix 0 : " + decimalFloat);
        System.out.println("Float Desimal Dengan Prefix 0 : " + decimalFloat1);

        /* Note : 
        Tipe data Float atau Floating Point hanya bisa menggunakan desimal saja
        dan kita tidak bisa menggunakan literals octal / hexa-decimal */
    }

    private static void charLiterals () {
        /* Singgle Quote {
            > Menggunakan singgle quote , contoh : [ 'A' ]
        } */
        char singgleQuoteLiterals = 'A';

        /* Char Literal sebagai Integer Literals {
            > Kisaran Angka yang di perbolehkan adalah 0 - 65535
            > Angka tersebut bisa berupa bilangan Decimal, Octal dan Hexa
            > Angka yang dituliskan merepersentasikan nilai Unicode
        } */
        char charIntegerLiterals = 062;

        /* Unicode Representation {
            > Diawali dengan backslash + u + 4 digit angka , Contoh [ '\u0061' ]
            > 4 digit angka dibelakang merupakan bilangan Hexa - Desimal
        } */
        char unicodeLiterals = '\u0061'; // <- Value Tersebut Merepersentasikan a.

        /* Escape Sequence {
            > Setiap Escape Character bisa dijadikan char literals
        } */
        char escapeLiterals = '\n'; // <- merepersentasikan Enter
        char escapeLiterals1 = '\t'; // <- merepersentasikan Tab
        char escapeLiterals2 = '\"'; // <- merepersentasikan symbol double quotes [ " ] 
        
        System.out.println(escapeLiterals);
        System.out.println(escapeLiterals1);
        System.out.println(escapeLiterals2);

    }

}
