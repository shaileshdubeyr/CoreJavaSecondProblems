package com.myjava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.myjava.App;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 	final Logger Log = LogManager.getLogger(App.class);
        	String message = "i am learning java";
        	Log.debug(message + "will be printed on debug" );
        	Log.info(message +"will be printed on debug" );
        	Log.warn(message + "will be printed on debug" );
        	Log.error(message + "will be printed on debug" );
        	Log.fatal(message + "will be printed on debug" );
        	Log.info("Appending string : {}.",message);
            System.out.println(message);
    }
}
