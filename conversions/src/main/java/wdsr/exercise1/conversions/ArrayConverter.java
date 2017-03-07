package wdsr.exercise1.conversions;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	private static final Logger log = LogManager.getLogger();
	
	
    public int[] convertToInts(String[] strings) {
    	log.info("convertToInts method with param strings ={");
    	for(String value: strings){
    		log.info(value+", ");
    	}
    	log.info("}");
    	
        int[] result = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
        
        log.info("Return of the method {");
    	for(int value: result){
    		log.info(value+", ");
    	}
        log.info("}");
        return result;
    }
}
