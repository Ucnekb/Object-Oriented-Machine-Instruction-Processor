package __20010310038_Kubilay_Karakaya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _20010310038_Main {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		String fileName="RAM.txt";
		File file =new File(fileName);
      Scanner scanner=new Scanner(file);   
      
      _20010310038_RAM ram=new _20010310038_RAM();
      
      for (int i = 0; i < 16; i++) {   	  
          String instruction = scanner.nextLine();
          ram.loadInstruction(i, instruction);
      }   
      scanner.close();    
      
   _20010310038_SC  Sequence_Counter=new _20010310038_SC(ram);
   
   Sequence_Counter.START();
   
	}

}
