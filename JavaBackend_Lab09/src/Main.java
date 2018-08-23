import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	public static void main(String[] args) {
		ReadFile();
	}
	public static void WriteFile(String data){
		BufferedWriter fileWriter = null;
		try {
			fileWriter = new BufferedWriter(new FileWriter("B.txt", true));
			fileWriter.write(data);
			fileWriter.newLine();
			fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void ReadFile(){
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("A.txt"));
			while(true){
				String data = fileReader.readLine();
				if (data == null) {
					break;
				}else{
					WriteFile(data);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
