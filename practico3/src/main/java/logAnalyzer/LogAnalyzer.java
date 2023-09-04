/*Here’s the scenario. Your company has many internal products 
it uses to monitor its applications at customer sites. 
 * All these products write log files and place them in a special directory. 
 * The log files are written in a proprietary format that your company has 
 * come up with that can’t be parsed by any existing third-party tools. 
 * You’re tasked with building a product, 
 * 
 * LogAn, that can analyze these log files and find various special cases and events 
 * in them. When it finds these cases and events, it should alert the appropriate parties.
 * */

package logAnalyzer;

public class LogAnalyzer {
	
	    private IExtensionManager manager;

	    	    
	    public LogAnalyzer(IExtensionManager m){
	    	  	manager = m;

	    }

        public boolean IsValidLogFileName(String fileName){	
        	if(fileName.isEmpty() || fileName ==null)
        		throw new  IllegalArgumentException();
        	if (!fileName.contains(".")) 
        		throw new  IllegalArgumentException();
        	
        	if(manager.IsValid(fileName)){
        		//File name with less than 5 chars should have 
            	//failed the method, even if the extension is supported
            	String[] parts = fileName.split("\\.");
            	if(parts[0].length()<5){
            		manager.SendLogError("too short name");
            		return false;
            	}	
            	else
            		return true;
        	}
        	else
        		  return false;
        		
        	}
       
        }	
   
    





