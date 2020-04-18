package com.example.crowdfundinghomepage;

public class SchemeEachItemClass {
    private int schemeImage;
    private String schemeName;
    private String schemDesc;

    public SchemeEachItemClass(int imageResource, String text1, String text2) {
        schemeImage = imageResource;
        schemeName = text1;
        schemDesc = text2;
    }

    public int getImageResource() {
        return schemeImage;
    }

    public String getText1() {
        return schemeName;
    }

    public String getText2() {
        return schemDesc;
    }
}

