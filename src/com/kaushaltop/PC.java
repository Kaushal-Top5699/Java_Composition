package com.kaushaltop;

/**
 * Here we are creating or building a PC that consists of components
 * Fun part here in composition is that, we don't have to use extends keyword after the class name
 * Here we are simply going to declare the class names as fields inside the class
 */
public class PC {

    //We are using these classes as field variables inside of PC class
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    //We can also use a separate method to carry out functions such as powering up etc;
    //This method has been called in main class (pc.powerUp();)
    public void powerUp() {
        theCase.pressPowerButton(); //this method is calling .pressPowerButton() method from class Case
                                    // (Go to Case class and check for the method)
        drawLogo();
    }

    //This method is called in this class by another method of this class i.e; powerUp
    private void drawLogo() {

        //This method is calling .drawPixelAt(x, y, color) method from Monitor class
        //(Go to Monitor class to check for the method)
        monitor.drawPixelAt(1200, 50, "WHITE");
    }

    //Other method to access information from these base classes is that,
    // we don't use these methods, and directly use the field variable and access there methods
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
