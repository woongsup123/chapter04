package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			FileInputStream fis = new FileInputStream("./ms949.txt");
			reader = new InputStreamReader(fis, "utf-8");
			
			int data = -1;
			while ((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 charset:" + e);
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음:" + e);
		} catch (IOException e) {
			System.out.println("I/O 에러:" + e);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
