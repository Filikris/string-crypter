package com.crypter;

import java.util.Scanner;

public class CaesarCryptAction implements MenuAction{
    Scanner in;

    public CaesarCryptAction(Scanner in) {
        this.in = in;
    }

    @Override
    public void doAction() {
        System.out.println("Enter key");
        int key = in.nextInt();
        in.nextLine();
        System.out.println("Enter message for crypt: ");
        String message = in.nextLine();
        CaesarSymbolCrypter caesarSymbolCrypter = new CaesarSymbolCrypter(key);
        StringCrypter stringCrypter = new StringCrypter(caesarSymbolCrypter);
        message = stringCrypter.crypt(message);
        System.out.println("Encrypted text is:  " + message);
    }

    @Override
    public String getName() {
        return "Caeser crypter - crypt";

    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
