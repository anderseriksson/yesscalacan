package com.jayway.nojavacannot;

/**
 * Created by Anders Eriksson.
 */
public class CountryFinder {
    
    
    
    public String countryFinder(IPAddress ipAddress ) {
        if (ipAddress.byte0.equals("10")) {
            return "IANA Reserved private 24-bit network range";
        }
        if ((ipAddress.byte0.equals("172")) && (ipAddress.byte1.equals("16"))) {
            return "IANA Reserved private 20-bit network range";
        }
        if ((ipAddress.byte0.equals("192")) && (ipAddress.byte1.equals("168"))) {
            return "IANA Reserved private 16-bit network range";
        }
        if ((ipAddress.byte0.equals("192")) && (ipAddress.byte1.equals("71")) && (ipAddress.byte2.equals("170"))) {
            return "Sweden";
        }
        if ((ipAddress.byte0.equals("209")) && (ipAddress.byte1.equals("47")) && (ipAddress.byte2.equals("43"))) {
            return "US";
        }
        return "Not known";
    }



    private class IPAddress {
        public String byte0;
        public String byte1;
        public String byte2;
        public String byte3;
    }
}
