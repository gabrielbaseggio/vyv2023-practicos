package logAnalyzer;

public interface IExtensionManager {
	
        boolean IsValid (String fileName);
        
        void SendLogError(String e);

}
