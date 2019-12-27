
package com.solarwindsmsp.chess;

/**
 * Exception class for invalid piece placement
 */
public class InvalidPlacementException extends Exception {
    public InvalidPlacementException(String errorMessage) {
        super(errorMessage);
    }   
}
