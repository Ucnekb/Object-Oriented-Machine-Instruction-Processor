package __20010310038_Kubilay_Karakaya;

public class _20010310038_RAM {
	  public  String[] instructionss = new String[16];
	  
	  public void loadInstruction(int lineNumber, String instruction) {
	        // Belirli bir satıra makine kodu yükle
	        if (lineNumber >= 0 && lineNumber < 16) {
	            instructionss[lineNumber] = instruction;
	            this.instructionss=instructionss;
	        } else {
	            System.out.println("Hata: Geçersiz satır numarası");
	        }     
	    }
	  public String getInstruction(int lineNumber) {
	        if (lineNumber >= 0 && lineNumber < 16) {
	            return instructionss[lineNumber];
	        } else {
	            System.out.println("Hata: Geçersiz satır numarası");
	            return null;
	        }
	    }
	  
	  
}
