package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {
//파일 객체 다루는법
	public static void main(String[] args) {
		BufferedReader br = null;
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
			System.out.println(sdf.format(new Date(file.lastModified())));
			System.out.println("============ 저나 버노 =============");
			// 1. 기반 스트림(FileInputStream)
			FileInputStream fis = new FileInputStream(file);
			// 2. 보조 스트림1
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			// 3. 보조 스트림2
			br = new BufferedReader(isr);
			// 4. 처리
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");
				int index = 0;
				while (st.hasMoreElements()) {
					String token = st.nextToken();
					if (index == 0) {// name
						System.out.print(token + ":");
					} else if (index == 1) {// phone number1
						System.out.print(token + "-");
					} else if (index == 2) {// phone number2
						System.out.print(token + "-");
					} else if (index == 3) {// phone number3
						System.out.println(token);
					}

					index++;
				}
			}

		} catch (IOException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("Error : " + e);
			}
		}
	}
}
