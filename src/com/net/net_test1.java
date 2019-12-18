package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class net_test1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO 自动生成的方法存根
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("本机的IP地址是："+ip.getHostAddress());
		InetAddress ip2=InetAddress.getByName("www.hbjhart.com");
		System.out.println("江汉艺术职业学院web服务器的Ip地址是："+ip2.getHostAddress());
		
	}

}
