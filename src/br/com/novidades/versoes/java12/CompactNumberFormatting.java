package br.com.novidades.versoes.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

    public static void main(String... args) {
        // Esse novo formatter do Java 12, tem como intuito formatar um numero em suas formas
        // curta (short) e longa (long) baseadas no local. Por exemplo, se tivermos o numero
        // 1000, e quisermos a versão curta baseada no formato brasileiro, ele deverá formatar para 1K
        // e a versão longa para 1 thousand.

        var numeroFormatar = 1000;

        // Para usarmos o CompactNumberFormatting, primeiro precisamos pegar a instancia do mesmo,
        // e definir o formato short ou long da formatação do numero
        var compactNumberFormattingShort = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
                NumberFormat.Style.SHORT);

        // Deve formatar e printar o valor 1K
        var numeroFormatadoShort = compactNumberFormattingShort.format(numeroFormatar);
        System.out.println(numeroFormatadoShort);

        var compactNumberFormattingLong = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
                NumberFormat.Style.LONG);

        // Deve formatar e printar 1 Thousand
        var numeroFormatadoLong = compactNumberFormattingLong.format(numeroFormatar);
        System.out.println(numeroFormatadoLong);

        // Usando exemplo do local Brasil, deve printar 1 mil
        var compactNumberFormattingBrasil = NumberFormat.getCompactNumberInstance(new Locale("pt", "BR"),
                NumberFormat.Style.LONG);

        var numeroFormatadoLongBrasil = compactNumberFormattingBrasil.format(numeroFormatar);
        System.out.println(numeroFormatadoLongBrasil);
    }
}
