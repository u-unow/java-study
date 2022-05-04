package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Localhost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			String hostName = inetAddress.getHostName();
			String hostAddress = inetAddress.getHostAddress();
			System.out.println("호스트 이름 : " + hostName);
			System.out.println("호스트 주소 : " + hostAddress);
			byte[] addresses = inetAddress.getAddress();
			for (byte address : addresses) {
				System.out.print(address & 0x000000ff);
				System.out.print('.');
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
