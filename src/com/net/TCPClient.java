package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.io.FileinputStream;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Socket khd=new Socket("10.2.103.31",8899);
		OutputStream os=khd.getOutputStream();
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		byte[]buf=new byte[1024];
		int len=fin.read(buf);
		while (len!=-1) {
			//System.out.println(new String(zjhc,0,b));
			os.write(buf,0,len);
			len=fin.read(buf);
		}
		khd.shutdownOutput();
		InputStream is=khd.getInputStream();
		len=is.read(buf);
		while (len!=-1){
			System.out.println(new String(buf,0,len));
			len=is.read(buf);
		}
		os.close();
		is.close();
		khd.close();
	}

}
