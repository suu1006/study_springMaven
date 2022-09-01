package sample04;

import java.io.FileWriter;
import java.io.IOException;

//파일로 출력
public class FileOutputter implements Outputter {

	private String fileName, filePath;
	
	public void setFileName(String fileName) {
		System.out.println("setFileName(String fileName)");
		this.fileName = fileName;
	}

	public void setFilePath(String filePath) {
		System.out.println("setFilePath(String filePath)");
		this.filePath = filePath;
	}

	@Override
	public void output(String message) {
		try {
			FileWriter fileWriter = new FileWriter(filePath + fileName); // 스트림을 이용해서 파일의 내용을 읽어들임. close하면 그 스트림에 파일의 내용을 변경할 수 없음.
			fileWriter.write(message); // 메세지가 파일로 나간다.
			fileWriter.close(); // 닫아주어야 파일에 문자열이 입력이 됩니다! 파일을 닫지 않고 파일에 입력하려면 그렇지 않으면 flush함수를 사용하세요. 
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}

}
