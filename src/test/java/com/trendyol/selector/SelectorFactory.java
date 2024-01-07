package com.trendyol.selector;

public class SelectorFactory {


    public static Selector createElementHelper(SelectorType selectorType) {
        return new IOSSelector();
    }
}
