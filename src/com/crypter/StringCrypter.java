package com.crypter;

public class StringCrypter {
    private SymbolCrypter symbolCrypter;

    public StringCrypter(SymbolCrypter symbolCrypter) {
        this.symbolCrypter = symbolCrypter;
    }

    public String crypt(String s) {

        char[] textCharArray = s.toCharArray();
        char[] encryptedText = new char[textCharArray.length];

        for (int i = 0; i < textCharArray.length; i++) {
            encryptedText[i] = symbolCrypter.crypt(textCharArray[i]);
        }

        return new String(encryptedText);
    }

    public String uncrypt (String s) {

        char[] textCharArray = s.toCharArray();
        char[] decryptedText = new char[textCharArray.length];

        for (int i = 0; i < textCharArray.length; i++){
            decryptedText[i] = symbolCrypter.uncrypt(textCharArray[i]);
        }

        return new String(decryptedText);
    }
}

