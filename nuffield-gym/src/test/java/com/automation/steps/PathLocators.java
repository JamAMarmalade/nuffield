package com.automation.steps;

public class PathLocators {

    public String myLocators(String myElement){

        String myXpath;
        switch (myElement) {
            case "Gym tab":
                myXpath = "//a[@id='0000014c-faaa-d922-a7ed-fbef5a7f0000']";
                break;
            case "Go to Search":
                myXpath = "//a[@href='https://www.nuffieldhealth.com/gyms'";
                break;
            case "Search Gym":
                myXpath = "//input[@id='location-finder__input-00000160-4eeb-de17-a579-dffb7ab70000'";
                break;

            default:
                throw new RuntimeException("==> cannot find the xpath for the element: " + myElement);
        }
        return myXpath;
    }

}
