package com.crypter;

public class CaesarSymbolCrypter implements SymbolCrypter{
    private int key;

    public CaesarSymbolCrypter(int key) {
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        return (char) (c + key);
    }

    @Override
    public char uncrypt(char c) {
        return (char) (c-key);
    }
}
