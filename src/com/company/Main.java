package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setAvtomat("калаш");
        boss.setAtaka(25);
        boss.setJizn(100);
        boss.setSposobnosti("Стан");
        boss.setZashita(15);
        System.out.println(" Атака босса; "+ boss.getAtaka() + " Жизнь босса; "+boss.getJizn() + " " +
                " Защита босса "+boss.getZashita() +" Тип оружия; " +boss.getAvtomat() + " Способности босса "+boss.getSposobnosti());
    }
}