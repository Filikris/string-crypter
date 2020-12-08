package com.crypter;

public class XorSymbolCryptor implements SymbolCrypter{
    private int key;

    public XorSymbolCryptor(int key) {
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        return (char) (c ^ key);
    }

    @Override
    public char uncrypt(char c) {
        return (char) (c ^ key);
    }
}
