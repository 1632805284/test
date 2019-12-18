package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Gengxin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","123456");
		Statement yuju=lianjie.createStatement();
		String sql="UPDATE tb_user SET email = 'jack@123.com' WHERE id = 1";
		yuju.execute(sql);
	}

}
