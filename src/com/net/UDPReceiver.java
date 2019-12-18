//package com.net;
//
//import java.net.DatagramPacket;
//import java.net.DatagramSocket;
//import java.net.SocketException;
//
//import org.omg.PortableServer.Servant;
//
//public class UDPReceiver {
//
//	public static void main(String[] args) throws Exception {
//		// TODO 自动生成的方法存根
//		DatagramSocket sever=new DatagramSocket(8900);
//		byte[] buf=new byte[1024];
//		DatagramPacket packet=new DatagramPacket(buf,buf.length);
//		System.out.println("等待接受数据Orz");
//		while(true) {
//			sever.receive(packet);
//			String str=new String(packet.getData(),0,packet.getLength());
//			System.out.println(packet.getAddress()+":"+packet.getPort()+"发送消息："+str);
//		}
//	}
//
//}
