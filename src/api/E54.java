package api;

public class E54 {
	public static void main(String[] args) {
		String s1="as6d45f6d聂5f6asd4f晓3asd誉4f96傻e4rf6批as5d4a694gv6sdf56as451vz364dg6s31v41xz3.jpg";
		System.out.println("这个字符串里面的数字是：");
		
		char[] zfsz=s1.toCharArray();
		for(char zf :zfsz) {
			if(zf>='0'&&zf<'9') {
			System.out.print(zf);
			}
		
		}
		System.out.println("\n这个字符串里面的汉字是：");
		
		
		for(char zf :zfsz) {
			if(zf>='\u4E00'&&zf<'\u9FA5') {
			System.out.print(zf);
	}
		}	
}		
}
