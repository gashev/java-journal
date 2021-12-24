package org.example;

import org.apache.logging.log4j.*;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        logger.info("Hello World!");
    }
}
