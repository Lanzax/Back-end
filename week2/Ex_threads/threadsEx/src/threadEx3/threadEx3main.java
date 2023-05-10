package threadEx3;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class threadEx3main {
	public static void main(String[] args) throws IOException {
		deleteFile();
		writeFile();
		readFile();
	}
	static void writeFile() throws IOException{
		String registroPresenze="Maestra Assunta bocciata";
		File file =new File("presenze/registroPresenze.txt");
		FileUtils.writeStringToFile(file, registroPresenze,"UTF-8",true);		
	}
	
	static void readFile() throws IOException{
		File file =new File("presenze/registroPresenze.txt");
		String read=FileUtils.readFileToString(file,"UTF-8");		
		System.out.println(read);
	}
	
	static void deleteFile() throws IOException{
		File file =new File("presenze/registroPresenze.txt");
		FileUtils.deleteQuietly(file);
	}
}
