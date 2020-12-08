package com.crypter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Menu menu = new Menu(in);

		menu.addAction(new CaesarCryptAction(in));
		menu.addAction(new CaesarUncryptAction(in));
		menu.addAction(new XorCryptAction(in));
		menu.addAction(new XorUncryptAction(in));
		menu.addAction(new ExitAction());

		menu.run();
    }
}
