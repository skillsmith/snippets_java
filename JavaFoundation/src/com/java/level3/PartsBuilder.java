package level3;

public class PartsBuilder {

	public static void main(String[] args){
		String[] assemblyLine = new String[3];
		
		try{
			assemblyLine[0] = "frame OK";
			assemblyLine[1] = "seating OK";
			assemblyLine[2] = "engine valve Not_OK";
			
			//qc check
			for(String part : assemblyLine){
				if (part.endsWith("Not_OK")) {
					throw new CriticalPartError("error while fittin part>> "+part);
				}
			}
		}catch(CriticalPartError aExp){
			//do something here
			System.out.println(aExp);
		}finally{
			for(int i=0; i<assemblyLine.length;i++){
				assemblyLine[i]=assemblyLine[i].replace("Not_OK", "replace").replace("OK", "refit");
			}
			
			for (String part : assemblyLine){
				System.out.println(part);
			}
		}
	}
}