package com.hackbulgaria.corejava;

public class LoggerTest {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(1, "Message");
        logger.log(3, "Message");
        logger.log(5, "Message");
        
        System.out.println();
        
        logger.setLevel(5);
        logger.log("Message");
        logger.log(5, "Message");
        logger.log(12, "Message");
        
        //logger.setLevel(-9); throw an exception
        System.out.println();
        
        Logger l = new Logger(2);
        l.log("Message");
        l.log(5, "Message");
        l.log(12, "Message");
    }

}
