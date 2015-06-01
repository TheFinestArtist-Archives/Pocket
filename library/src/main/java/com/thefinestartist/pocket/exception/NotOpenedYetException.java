package com.thefinestartist.pocket.exception;

/**
 * Created by TheFinestArtist on 4/28/15.
 */
public class NotOpenedYetException extends RuntimeException {

    public NotOpenedYetException(String detailMessage) {
        super(detailMessage);
    }

    public NotOpenedYetException(String detailMessage, Throwable exception) {
        super(detailMessage, exception);
    }
}
