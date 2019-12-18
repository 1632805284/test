package com.net;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSender {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket(30000);
		String str="Hello 热心市民小王  王雷";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送消息...");
		ds.send(dp);
		ds.close();
	}

}
