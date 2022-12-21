package com.snowflake.procedure;

import com.snowflake.snowpark.Session;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Building session object");
        
        Session session = Session.builder()
            .configFile("src/main/resources/app.properties")  // This needs to be fixed, normally /resources is in the classpath and I don't need to hop directories 
            .config("password", System.getenv("SNOWFLAKE_PASSWORD"))  // Wish I could have this discovered in the runtime
            .create();

        long count = session.table("ACTIVE_CUSTOMER").count();

        System.out.println("Count: "+count);
        session.close();
    }
}
