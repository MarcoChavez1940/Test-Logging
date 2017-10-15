/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

/**
 *
 * @author marco
 */
public class Logging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogClass log = new LogClass();
        
        log.getFatalLog();
        log.getErrorLog();
        log.getWarnLog();
        log.getInfoLog();
        log.getDebugLog();
        log.getTraceLog();
    }
    
}
