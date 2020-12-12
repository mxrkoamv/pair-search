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
            new NumeroOrdinal("2", "Second"),
            new NumeroOrdinal("2", "Segundo"),
            /*new NumeroOrdinal("3", "Third"),
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
            new NumeroOrdinal("10", "Decimo")*/
        };

        return vectorOrdinales;
    }

    public static NumeroOrdinal[] twenty() {
        NumeroOrdinal vectorOrdinales[] = {
                new NumeroOrdinal("1", "Elven"),
                new NumeroOrdinal("1", "Once"),
                new NumeroOrdinal("2", "Twelve"),
                new NumeroOrdinal("2", "Doce"),
        };

        return vectorOrdinales;
    }
}


    /*
    NumeroOrdinal vectorDeNumerosOrdinales[] = new NumeroOrdinal[20];
    vectorDeNumerosOrdinales[0] = new NumeroOrdinal("1", "First");
    vectorDeNumerosOrdinales[1] = new NumeroOrdinal("1", "Primero");
    vectorDeNumerosOrdinales[2] = new NumeroOrdinal("2", "Second");
    vectorDeNumerosOrdinales[3] = new NumeroOrdinal("2", "Segundo");
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