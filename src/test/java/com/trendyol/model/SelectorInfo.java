package com.trendyol.model;

import org.openqa.selenium.By;

public class SelectorInfo {

    private By by;
    private int index;



    public SelectorInfo(By by, int index) {
        this.by = by;
        this.index = index;
    }

    public By getBy() {
        return by;
    }


    public int getIndex() {
        return index;
    }


}
