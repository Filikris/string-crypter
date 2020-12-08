package com.crypter;

import java.util.Scanner;

public class XorUncryptAction implements MenuAction {
    Scanner in;

    public XorUncryptAction(Scanner in) {
        this.in = in;
    }

    @Override
    public void doAction() {
        System.out.println("Enter message for crypt: ");
        String message = in.nextLine();
        in.nextLine();
        System.out.println("Enter key");
        int key = in.nextInt();
        XorSymbolCryptor xorSymbolCryptor = new XorSymbolCryptor(key);
        StringCrypter stringCrypter = new StringCrypter(xorSymbolCryptor);
        message = stringCrypter.crypt(message);
        System.out.println("Decrypted text is:  " + message);
    }

    @Override
    public String getName() {
        return "Xor crypter - uncrypt";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
