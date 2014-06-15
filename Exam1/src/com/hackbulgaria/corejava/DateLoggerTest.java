package com.hackbulgaria.corejava;

public class DateLoggerTest {

    public static void main(String[] args) {
        Logger logger = new DateLogger();
        
        logger.log(2, "Message");
        logger.log("Message");
        logger.log(200, "Message");
        logger.log(74, "Message");
        
        logger.setLevel(2);
        
        System.out.println();
        
        logger.log(2, "Message");
        logger.log("Message");
        logger.log(200, "Message");
        logger.log(74, "Message");
        
        System.out.println();
        
        Logger l = new DateLogger(4);
        
        l.log(2, "Message");
        l.log("Message");
        l.log(200, "Message");
        l.log(74, "Message");
        
       // l.setLevel(0); // throw an exception
        
        
    }

}
