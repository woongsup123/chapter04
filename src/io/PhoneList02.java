package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
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
			scanner = new Scanner(file);
			while( scanner.hasNextLine() ) {
				String name = scanner.next();
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();
				
				System.out.println(name + ": " + phone1 + "-" + phone2 + "-" + phone3);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
