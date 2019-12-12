package com.kaushaltop;

public class Main {

    public static void main(String[] args) {

        //First set the dimensions for the case
        Dimensions dimensions = new Dimensions(20, 20, 5);

        //Create a case
        Case theCase =
                new Case("CY00YTX654AS", "Apple", "240", dimensions);
        //Our case is now ready!!


        //*********&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&**********


        //Now lets design the monitor
        //Create a monitor
        Monitor monitor = new
                Monitor("13inch", "Apple",
                13, new Resolution(2560, 1600));
        //In this case we used one of the feature of composition
        //We never created a separate resolution object, but instead we directly
        //called the resolution class into monitor's constructor here.


        //*********&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&**********


        //Now lets fix the motherBoard into our PC
        //Create a motherBoard
        MotherBoard motherBoard = new
                MotherBoard("A1798CY00", "Apple",
                2, 1, "macOSX v11.0.1");


        //*********&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&*******************&&&&&&&&**********


        //Finally assemble all the components
        //Create a PC
        PC pc = new PC(theCase, monitor, motherBoard);

        //How to draw a pixel, this can be done by using a method drawPixelAt from monitor class
        //This is how you can access it
//        pc.getMonitor().drawPixelAt(1500, 2000, "RED");
        //Similarly lets load our first program in our PC
//        pc.getMotherBoard().loadProgram("macOSX Catalina");
        //Now lets power on our PC
//        pc.getTheCase().pressPowerButton();

        //Let us call the information in little different fashion
        // .powerUP() method is called from PC class (Go to PC Class and check for the method)
        pc.powerUp();
    }
}
