package data;

import modelo.NumeroOrdinal;

public class Numbers {

    public static NumeroOrdinal[] numbersArray(int nivel) {

        NumeroOrdinal[] arrayNumberCollection;

        switch (nivel) {
            case 1:
                arrayNumberCollection = Numbers.ten();
                break;
            case 2:
                arrayNumberCollection = Numbers.twenty();
                break;
            case 3:
                arrayNumberCollection = Numbers.thirty();
                break;
            case 4:
                arrayNumberCollection = Numbers.forty();
                break;
            case 5:
                arrayNumberCollection = Numbers.fifty();
                break;
            case 6:
                arrayNumberCollection = Numbers.sixty();
                break;
            case 7:
                arrayNumberCollection = Numbers.seventy();
                break;
            case 8:
                arrayNumberCollection = Numbers.eighty();
                break;
            case 9:
                arrayNumberCollection = Numbers.ninety();
                break;
            case 10:
                arrayNumberCollection = Numbers.oneHundred();
                break;
            default:
                arrayNumberCollection = Numbers.ten();
                break;
        }
        return arrayNumberCollection;
    }

    public static NumeroOrdinal[] ten() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "First"),
            new NumeroOrdinal("1", "Primero"),
            new NumeroOrdinal("", "Second"),
            new NumeroOrdinal("", "Segundo"),
            new NumeroOrdinal("3", "Third"),
            new NumeroOrdinal("3", "Tercero"),
            new NumeroOrdinal("4", "Fourth"),
            new NumeroOrdinal("4", "Cuarto"),
            new NumeroOrdinal("5", "Fifth"),
            new NumeroOrdinal("5", "Quinto"),
            new NumeroOrdinal("6", "Sixth"),
            new NumeroOrdinal("6", "Sexto"),
            new NumeroOrdinal("7", "Seventh"),
            new NumeroOrdinal("7", "Septimo"),
            new NumeroOrdinal("8", "Eighth"),
            new NumeroOrdinal("8", "Octavo"),
            new NumeroOrdinal("9", "Ninth"),
            new NumeroOrdinal("9", "Noveno"),
            new NumeroOrdinal("10", "Tenth"),
            new NumeroOrdinal("10", "Decimo")
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] twenty() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Elven"),
            new NumeroOrdinal("1", "Once"),
            new NumeroOrdinal("", "Twelve"),
            new NumeroOrdinal("", "Doce"),
            new NumeroOrdinal("3", "Thirteen"),
            new NumeroOrdinal("3", "Trece"),
            new NumeroOrdinal("4", "Fourteen"),
            new NumeroOrdinal("4", "Catorce"),
            new NumeroOrdinal("5", "Fifteen"),
            new NumeroOrdinal("5", "Quince"),
            new NumeroOrdinal("6", "Sixteen"),
            new NumeroOrdinal("6", "Dieciseis"),
            new NumeroOrdinal("7", "Seventeen"),
            new NumeroOrdinal("7", "Diecisiete"),
            new NumeroOrdinal("8", "Eighteen"),
            new NumeroOrdinal("8", "Dieciocho"),
            new NumeroOrdinal("9", "Nineteen"),
            new NumeroOrdinal("9", "Diecinueve"),
            new NumeroOrdinal("10", "Twenty"),
            new NumeroOrdinal("10", "Veinte"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] thirty() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Twenty-one"),
            new NumeroOrdinal("1", "Veintiuno"),
            new NumeroOrdinal("2", "Twenty-two"),
            new NumeroOrdinal("2", "Veintidos"),
            new NumeroOrdinal("3", "Twenty-three"),
            new NumeroOrdinal("3", "Veintitres"),
            new NumeroOrdinal("4", "Twenty-four"),
            new NumeroOrdinal("4", "Veinticuatro"),
            new NumeroOrdinal("5", "Twenty-five"),
            new NumeroOrdinal("5", "Veinticinco"),
            new NumeroOrdinal("6", "Twenty-six"),
            new NumeroOrdinal("6", "Veintiseis"),
            new NumeroOrdinal("7", "Twenty-seven"),
            new NumeroOrdinal("7", "Veintisiete"),
            new NumeroOrdinal("8", "Twenty-eight"),
            new NumeroOrdinal("8", "Veintiocho"),
            new NumeroOrdinal("9", "Twenty-nine"),
            new NumeroOrdinal("9", "Veintinueve"),
            new NumeroOrdinal("10", "Thirty"),
            new NumeroOrdinal("10", "Treinta"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] forty() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Thirty-one"),
            new NumeroOrdinal("1", "Treinta y uno"),
            new NumeroOrdinal("2", "Thirty-two"),
            new NumeroOrdinal("2", "Treinta y dos"),
            new NumeroOrdinal("3", "Thirty-three"),
            new NumeroOrdinal("3", "Treinta y tres"),
            new NumeroOrdinal("4", "Thirty-four"),
            new NumeroOrdinal("4", "Treinta y cuatro"),
            new NumeroOrdinal("5", "Thirty-five"),
            new NumeroOrdinal("5", "Treinta y cinco"),
            new NumeroOrdinal("6", "Thirty-six"),
            new NumeroOrdinal("6", "Treinta y seis"),
            new NumeroOrdinal("7", "Thirty-seven"),
            new NumeroOrdinal("7", "Treinta y siete"),
            new NumeroOrdinal("8", "Thirty-eight"),
            new NumeroOrdinal("8", "Treinta y ocho"),
            new NumeroOrdinal("9", "Thirty-nine"),
            new NumeroOrdinal("9", "Treinta y nueve"),
            new NumeroOrdinal("10", "Forty"),
            new NumeroOrdinal("10", "Cuarenta"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] fifty() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Forty-one"),
            new NumeroOrdinal("1", "cuarenta y uno"),
            new NumeroOrdinal("2", "Forty-two"),
            new NumeroOrdinal("2", "cuarenta y dos"),
            new NumeroOrdinal("3", "Forty-three"),
            new NumeroOrdinal("3", "cuarenta y tres"),
            new NumeroOrdinal("4", "Forty-four"),
            new NumeroOrdinal("4", "cuarenta y cuatro"),
            new NumeroOrdinal("5", "Forty-five"),
            new NumeroOrdinal("5", "cuarenta y cinco"),
            new NumeroOrdinal("6", "Forty-six"),
            new NumeroOrdinal("6", "cuarenta y seis"),
            new NumeroOrdinal("7", "Forty-seven"),
            new NumeroOrdinal("7", "cuarenta y siete"),
            new NumeroOrdinal("8", "Forty-eight"),
            new NumeroOrdinal("8", "cuarenta y ocho"),
            new NumeroOrdinal("9", "Forty-nine"),
            new NumeroOrdinal("9", "cuarenta y nueve"),
            new NumeroOrdinal("10", "Fifty"),
            new NumeroOrdinal("10", "Cincuenta"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] sixty() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Fifty-one"),
            new NumeroOrdinal("1", "Cincuenta y uno"),
            new NumeroOrdinal("2", "Fifty-two"),
            new NumeroOrdinal("2", "Cincuenta y dos"),
            new NumeroOrdinal("3", "Fifty-three"),
            new NumeroOrdinal("3", "Cincuenta y tres"),
            new NumeroOrdinal("4", "Fifty-four"),
            new NumeroOrdinal("4", "Cincuenta y cuatro"),
            new NumeroOrdinal("5", "Fifty-five"),
            new NumeroOrdinal("5", "Cincuenta y cinco"),
            new NumeroOrdinal("6", "Fifty-six"),
            new NumeroOrdinal("6", "Cincuenta y seis"),
            new NumeroOrdinal("7", "Fifty-seven"),
            new NumeroOrdinal("7", "Cincuenta y siete"),
            new NumeroOrdinal("8", "Fifty-eight"),
            new NumeroOrdinal("8", "Cincuenta y ocho"),
            new NumeroOrdinal("9", "Fifty-nine"),
            new NumeroOrdinal("9", "Cincuenta y nueve"),
            new NumeroOrdinal("10", "Sisty"),
            new NumeroOrdinal("10", "Sesenta"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] seventy() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Sisty-one"),
            new NumeroOrdinal("1", "Sesenta y uno"),
            new NumeroOrdinal("2", "Sisty-two"),
            new NumeroOrdinal("2", "Sesenta y dos"),
            new NumeroOrdinal("3", "Sisty-three"),
            new NumeroOrdinal("3", "Sesenta y tres"),
            new NumeroOrdinal("4", "Sisty-four"),
            new NumeroOrdinal("4", "Sesenta y cuatro"),
            new NumeroOrdinal("5", "Sisty-five"),
            new NumeroOrdinal("5", "Sesenta y cinco"),
            new NumeroOrdinal("6", "Sisty-six"),
            new NumeroOrdinal("6", "Sesenta y seis"),
            new NumeroOrdinal("7", "Sisty-seven"),
            new NumeroOrdinal("7", "Sesenta y siete"),
            new NumeroOrdinal("8", "Sisty-eight"),
            new NumeroOrdinal("8", "Sesenta y ocho"),
            new NumeroOrdinal("9", "Sisty-nine"),
            new NumeroOrdinal("9", "Sesenta y nueve"),
            new NumeroOrdinal("10", "Seventy"),
            new NumeroOrdinal("10", "Setenta"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] eighty() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Seventy-one"),
            new NumeroOrdinal("1", "Setenta y uno"),
            new NumeroOrdinal("2", "Seventy-two"),
            new NumeroOrdinal("2", "Setenta y dos"),
            new NumeroOrdinal("3", "Seventy-three"),
            new NumeroOrdinal("3", "Setenta y tres"),
            new NumeroOrdinal("4", "Seventy-four"),
            new NumeroOrdinal("4", "Setenta y cuatro"),
            new NumeroOrdinal("5", "Seventy-five"),
            new NumeroOrdinal("5", "Setenta y cinco"),
            new NumeroOrdinal("6", "Seventy-six"),
            new NumeroOrdinal("6", "Setenta y seis"),
            new NumeroOrdinal("7", "Seventy-seven"),
            new NumeroOrdinal("7", "Setenta y siete"),
            new NumeroOrdinal("8", "Seventy-eight"),
            new NumeroOrdinal("8", "Setenta y ocho"),
            new NumeroOrdinal("9", "Seventy-nine"),
            new NumeroOrdinal("9", "Setenta y nueve"),
            new NumeroOrdinal("10", "Eighty"),
            new NumeroOrdinal("10", "Ochenta"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] ninety() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Eighty-one"),
            new NumeroOrdinal("1", "Ochenta y uno"),
            new NumeroOrdinal("2", "Eighty-two"),
            new NumeroOrdinal("2", "Ochenta y dos"),
            new NumeroOrdinal("3", "Eighty-three"),
            new NumeroOrdinal("3", "Ochenta y tres"),
            new NumeroOrdinal("4", "Eighty-four"),
            new NumeroOrdinal("4", "Ochenta y cuatro"),
            new NumeroOrdinal("5", "Eighty-five"),
            new NumeroOrdinal("5", "Ochenta y cinco"),
            new NumeroOrdinal("6", "Eighty-six"),
            new NumeroOrdinal("6", "Ochenta y seis"),
            new NumeroOrdinal("7", "Eighty-seven"),
            new NumeroOrdinal("7", "Ochenta y siete"),
            new NumeroOrdinal("8", "Eighty-eight"),
            new NumeroOrdinal("8", "Ochenta y ocho"),
            new NumeroOrdinal("9", "Eighty-nine"),
            new NumeroOrdinal("9", "Ochenta y nueve"),
            new NumeroOrdinal("10", "Ninety"),
            new NumeroOrdinal("10", "Noventa"),
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] oneHundred() {
        NumeroOrdinal vectorOrdinales[] = {
            new NumeroOrdinal("1", "Ninety-one"),
            new NumeroOrdinal("1", "Noventa y uno"),
            new NumeroOrdinal("2", "Ninety-two"),
            new NumeroOrdinal("2", "Noventa y dos"),
            new NumeroOrdinal("3", "Ninety-three"),
            new NumeroOrdinal("3", "Noventa y tres"),
            new NumeroOrdinal("4", "Ninety-four"),
            new NumeroOrdinal("4", "Noventa y cuatro"),
            new NumeroOrdinal("5", "Ninety-five"),
            new NumeroOrdinal("5", "Noventa y cinco"),
            new NumeroOrdinal("6", "Ninety-six"),
            new NumeroOrdinal("6", "Noventa y seis"),
            new NumeroOrdinal("7", "Ninety-seven"),
            new NumeroOrdinal("7", "Noventa y siete"),
            new NumeroOrdinal("8", "Ninety-eight"),
            new NumeroOrdinal("8", "Noventa y ocho"),
            new NumeroOrdinal("9", "Ninety-nine"),
            new NumeroOrdinal("9", "Noventa y nueve"),
            new NumeroOrdinal("10", "One hundred"),
            new NumeroOrdinal("10", "Cien"),
        };

        return vectorOrdinales;
    }
}


    /*
    NumeroOrdinal vectorDeNumerosOrdinales[] = new NumeroOrdinal[20];
    vectorDeNumerosOrdinales[0] = new NumeroOrdinal("1", "First");
    vectorDeNumerosOrdinales[1] = new NumeroOrdinal("1", "Primero");
    vectorDeNumerosOrdinales[2] = new NumeroOrdinal("", "Second");
    vectorDeNumerosOrdinales[3] = new NumeroOrdinal("", "Segundo");
    vectorDeNumerosOrdinales[4] = new NumeroOrdinal("3", "Third");
    vectorDeNumerosOrdinales[5] = new NumeroOrdinal("3", "Tercero");
    vectorDeNumerosOrdinales[6] = new NumeroOrdinal("4", "Fourth");
    vectorDeNumerosOrdinales[7] = new NumeroOrdinal("4", "Cuarto");
    vectorDeNumerosOrdinales[8] = new NumeroOrdinal("5", "Fifth");
    vectorDeNumerosOrdinales[9] = new NumeroOrdinal("5", "Quinto");
    vectorDeNumerosOrdinales[10] = new NumeroOrdinal("6", "Sixth");
    vectorDeNumerosOrdinales[11] = new NumeroOrdinal("6", "Sexto");
    vectorDeNumerosOrdinales[12] = new NumeroOrdinal("7", "Seventh");
    vectorDeNumerosOrdinales[13] = new NumeroOrdinal("7", "Septimo");
    vectorDeNumerosOrdinales[14] = new NumeroOrdinal("8", "Eighth");
    vectorDeNumerosOrdinales[15] = new NumeroOrdinal("8", "Octavo");
    vectorDeNumerosOrdinales[16] = new NumeroOrdinal("9", "Ninth");
    vectorDeNumerosOrdinales[17] = new NumeroOrdinal("9", "Noveno");
    vectorDeNumerosOrdinales[18] = new NumeroOrdinal("10", "Tenth");
    vectorDeNumerosOrdinales[19] = new NumeroOrdinal("10", "Decimo");
    */