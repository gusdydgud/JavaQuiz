package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너로 읽을 파일명을 확장자포함 입력받습니다.
		 * 
		 * 2. upload폴더에 파일이 있다면, 이 파일을 uploeacopy로 복사해주세요.
		 * 	  파일이 없으면 "파일명이 없습니다" 예외구문을 출력합니다.
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String inputPath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\";
		String outputPath = "C:\\Users\\user\\Desktop\\course\\java\\uploadcopy\\";
		
		InputStream ios = null;
		OutputStream fos = null;
		
		try {
			String co = sc.next();
			inputPath+=co;
			outputPath+=co;
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			byte arr[] = new byte[1000];
			int result;
			while((result = ios.read(arr)) !=-1) {
				fos.write(arr,0,result);
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("파일명이 없습니다.");
		}finally {
			try {
				ios.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
