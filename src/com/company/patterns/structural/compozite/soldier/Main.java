package com.company.patterns.structural.compozite.soldier;

public class Main {
    public static void main(String[] args) {
        CompositeSoldier generalEmin = new CompositeSoldier("Ahmet Emin", Rank.General);
        generalEmin.add(new PrimitiveSoldier("Ceylan Kaya", Rank.Colonel));
        generalEmin.add(new PrimitiveSoldier("Asya", Rank.Colonel));

        CompositeSoldier colonelNisa = new CompositeSoldier("Nisa", Rank.Colonel);
        CompositeSoldier lieutenantColonelLucia = new CompositeSoldier("Lucia", Rank.LieutenantColonel);

        lieutenantColonelLucia.add(new PrimitiveSoldier("Alex", Rank.Captain));

        colonelNisa.add(lieutenantColonelLucia);
        colonelNisa.add(new PrimitiveSoldier("Fatmanur", Rank.LieutenantColonel));

        generalEmin.add(colonelNisa);


        generalEmin.executeOrder();

    }
}
