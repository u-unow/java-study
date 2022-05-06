package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServer {
	private static final int PORT = 6666;

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		try {
			// 1. 서버소켓 생성
			serverSocket = new ServerSocket();

			// 2. 바인딩(binding)
			// . .Socket에 InetSocketAddress(IP Address + Port)를 바인딩 한다.
			// . .IPAddress(0.0.0.0) : 특정호스트 IP를 바인딩하지 않는다.
			// . .Backlog : 요청 queue(10)
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT), 10);
			log("starts... [Port : "+PORT + " ]");
			// 3. accept
			// . .클라이언트로 부터 요청을 기다린다.
			Socket socket = serverSocket.accept(); // blocking

			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			String remteHostAddress = inetSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetSocketAddress.getPort();
			log("connected by client[" + remteHostAddress + ":" + "]" + remoteHostPort);
			
			try {
				// 4. IO Stream 받아오기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter( socket.getOutputStream(),"UTF-8"), true);
				while (true) {
					// 5. 데이터 읽기
					String data = br.readLine();// blocking
					if (data == null) {
						// 클라이언트가 정상적으로 종료
						// close() 호출
						log("closed by client");
						break;
					}

					log("received : "+data);
				
					// 6. 데이터 쓰기
					pw.println(data);
				}
			} catch (SocketException ex) {
				System.out.println("[Server] suddenly closed by client");
			} catch (IOException ex) {
				System.out.println("[server] Error : " + ex);
			} finally {
				try {
					if (socket != null && !socket.isClosed()) {
						socket.close();
					}
				} catch (IOException ex) {

				}
			}
		} catch (IOException e) {
			System.out.println("[Server] Error : " + e);
		} finally {
			try {
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void log(String log) {
		System.out.println("[EchoServer : "+log);
	}
}
