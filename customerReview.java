import java.util.*;
import java.io.*;

class customerReview extends customerreviewserver{
	private int count = 0;

	private int getTotal(ArrayList<Integer> list){
		//unkown type of input, assume the reviews is provided by a list
		
		return list.size();

	}
	
	private static void checkRate(int rate){
			if(rate<0){
				throw new ArithmeticException("The rate cannot be negative");
			}
		}
	private static String txt2String(File file) {
		String result = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = null;
			while ((s = br.readLine()) != null) {
				result = result + "\n" + s;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
			
		}
		return result;
	}
	private static void checkCurse(String common){
		File file = new File("/Users/zml/Documents/jobs/HomeDepot/CurseWord.txt");
		//curse words file path
		String str = txt2String(file);
		String[] wordStr = str.split(" ");
		String[] commonStr = common.split(" ");

		for(int i = 0; i<commonStr.length; i++){

			for(int j = 0; j<wordStr.length; j++){

				if(commonStr[i].equals(wordStr[j])){
					
					throw new ArithmeticException("Common contains curse words");
				}
			}
			
		}
		
	}
	public static void main(String arg[]){
		//checkRate(-2);
		//checkCurse("");
	}

}
