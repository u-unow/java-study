package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {
//파일 객체 다루는법
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			File file = new File("phone.txt");
			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}
			System.out.println("============파일 정보=============");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:");
			System.out.println("============ 저나 버노 =============");
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				String name =scanner.next();
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();
				System.out.println(name+" :\t"+phone1+"-"+phone2+"-"+phone3);

			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : " + e);
		} finally {
		}
	}
}
