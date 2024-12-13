package __20010310038_Kubilay_Karakaya;



public class _20010310038_IR {
	_20010310038_RAM ram=new _20010310038_RAM();
	_20010310038_3x8_Decoder decoder=new _20010310038_3x8_Decoder();

	public _20010310038_IR(_20010310038_RAM ramm) {
		 this.ram=ramm;
	}
	
	String[][] RegisterAY = {
            {"CLA", "0111100000000000"},
            {"CLE", "0111010000000000"},
            {"CMA", "0111001000000000"},
            {"CME", "0111000100000000"},
            {"CIR", "0111000010000000"},
            {"CIL", "0111000001000000"},
            {"INC", "0111000000100000"},
            {"SPA", "0111000000010000"},
            {"SNA", "0111000000001000"},
            {"SZA", "0111000000000100"},
            {"SZE", "0111000000000010"},
            {"HLT", "0111000000000001"},
           
        }; 
	 String [][] Input_OutputY= {
			 	{"INP", "1111100000000000"},
	            {"OUT", "1111010000000000"},
	            {"SKI", "1111001000000000"},
	            {"SKO", "1111000100000000"},
	            {"ION", "1111000010000000"},
	            {"IOF", "1111000001000000"}
	 }; 
	
	 String [][] BellekAY= {
			 
			    {"AND", "000"},
	            {"ADD", "001"},
	            {"LDA", "010"},
	            {"STA", "011"},
	            {"BUN", "100"},
	            {"BSA", "101"},
	            {"ISZ", "110"}
	 };
	 public void Decoder(int i) {
	   
	       String str=ram.getInstruction(i);
	        String I=str.substring(0, 1);
	        String opcode = str.substring(1, 4);
	        String D = decoder.Decoder(opcode);
	        String aktif=str.substring(4,16);
	       String sembol=tablo(I,opcode,str);
	        System.out.println("T"+i + "zamanında "+ "I="+ I + " "+ D + " " + "aktif IR(11-0) ="+  aktif + "  " + "buyruk=" + sembol);      
	   		 
		}
		public String tablo(String I, String opcode,String a) 
		{
			String abc="";
			if (I.equals("1") && opcode.equals("111")) {
				
				for(int i=0;i<6;i++) {
					
				if(	Input_OutputY[i][1].equals(a)) {
					
					String sembol=Input_OutputY[i][0];
					
					return sembol;		
					}
				}
			}		
			else if (I.equals("0") && opcode.equals("111")) {
				for(int i=0;i<12;i++) {
					if(RegisterAY[i][1].equals(a)) {
						String sembol=RegisterAY[i][0];
						
						return sembol;	
					}			
				}
			}
			else {
				for(int i=0;i<7;i++) {
					if(BellekAY[i][1].equals(opcode)) {
						String sembol=BellekAY[i][0];
						return sembol;	
					}
				}
			}
			return abc;
		}

}
