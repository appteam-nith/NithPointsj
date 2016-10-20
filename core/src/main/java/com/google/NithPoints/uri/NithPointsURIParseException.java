package com.google.NithPoints.uri;

/**
 * Created by joshafest on 18-10-2016.
 */
public class NithPointsURIParseException extends RuntimeException {
    public NithPointsURIParseException(String s) {
        super(s);
    }

    public NithPointsURIParseException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
