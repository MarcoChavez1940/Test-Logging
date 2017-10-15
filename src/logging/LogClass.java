package logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *
 * @author marco
 */
public class LogClass{
    //En getLog es el nombre correspondiente del log
    private Log log = LogFactory.getLog(LogClass.class); 
    
    public void getFatalLog(){
        log.fatal("Message Fatal log");
    }
    
    public void getErrorLog(){
        log.error("Message Error log");
    }
    
    public void getWarnLog(){
        log.warn("Message Warn log");
    }
    
    public void getInfoLog(){
        log.info("Message Info log");
    }
    
    public void getDebugLog(){
        log.debug("Message Debug log");
    }
    
    public void getTraceLog(){
        log.trace("Message Trace log");
    }
}
