package com.crypter;

import java.util.Scanner;

public class CaesarUncryptAction implements MenuAction{
    Scanner in;

    public CaesarUncryptAction(Scanner in) {
        this.in = in;
    }

    @Override
    public void doAction() {
        System.out.println("Enter message for crypt: ");
        String message = in.nextLine();
        System.out.println("Enter key");
        int key = in.nextInt();
        CaesarSymbolCrypter caesarSymbolCrypter = new CaesarSymbolCrypter(key);
        StringCrypter stringCrypter = new StringCrypter(caesarSymbolCrypter);
        message = stringCrypter.uncrypt(message);
        System.out.println("Decrypted text is:  " + message);
    }

    @Override
    public String getName() {
        return "Caeser crypter - uncrypt";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
