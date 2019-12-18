package com.net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
	
		ServerSocket fwqtjz=new ServerSocket(8899);
		while (true) {
			Socket khdtjz=fwqtjz.accept();
			new Thread(()->{
				try {
				String ip=khdtjz.getInetAddress().getHostAddress();
				int port=khdtjz.getPort();
				System.out.println("和客户端IP地址是"+ip+",端口是"+port+"连接上了");
				InputStream is;
				is=khdtjz.getInputStream();
				byte[]zjhc=new byte[1024];
				FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+"jpeg");
				int b=is.read();
				while (b!=-1) {
					fout.write(zjhc,0,b);
					b=is.read(zjhc);
				}
				String xinxi="文件上传成功";
				OutputStream os=khdtjz.getOutputStream();
				os.write(xinxi.getBytes("UTF-8"));
				os.close();
				khdtjz.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}).start();		
		}
	}

}
