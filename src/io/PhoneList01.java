package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		File file = new File("./phonebook.txt");
		if (file.exists() == false) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}

		System.out.println("=========== 파일정보 ===========");
		System.out.println("경로: " + file.getAbsolutePath());
		System.out.println("크기: " + file.length() + "bytes");

		Date date = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:dd:ss");

		System.out.println("마지막 수정일: " + sdf.format(date));
		System.out.println("\"=========== 전화번호 ===========\"");
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while( (line = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line, "\t ");
				int index = 0;
				while ( st.hasMoreTokens()) {
					String s = st.nextToken();
					if (index == 0) {
						System.out.print(s + ": ");
					}
					else if (index == 1 || index == 2) {
						System.out.print(s + "-");
					}
					else {
						System.out.println(s);
						index = 0;
					}
					index++;
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
