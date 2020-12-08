package com.crypter;

import java.util.Scanner;

public class XorCryptAction implements MenuAction {
    Scanner in;

    public XorCryptAction(Scanner in) {
        this.in = in;
    }

    @Override
    public void doAction() {
        System.out.println("Enter key");
        int key = in.nextInt();
        System.out.println("Enter message for crypt: ");
        String message = in.nextLine();
        XorSymbolCryptor xorSymbolCryptor = new XorSymbolCryptor(key);
        StringCrypter stringCrypter = new StringCrypter(xorSymbolCryptor);
        message = stringCrypter.crypt(message);
        System.out.println("Encrypted text is:  " + message);
    }

    @Override
    public String getName() {
        return "Xor crypter - crypt";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
