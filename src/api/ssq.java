//package api;
//
//import java.util.HashSet;
//import java.util.Random;
//
//import org.apache.poi.hssf.usermodel.HSSFChildAnchor;
//
//public class ssq {
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("双色球开奖：26 7 16 21 47 3+15");
//		System.out.print("六个红球号码是：");
//		
//		Random r=new Random();
//		HashSet<Integer> hs=new HashSet<>();
//		for(int i = 0; i < 10000; i++) {
//			int hq=r.nextInt(33)+1;
//			hs.add(hq);
//			if(hs.size()==6) {
//				break;
//			}
//		}
//		for(Integer hq : hs) {
//			System.out.print(hq+" ");
//			Thread.sleep(1000);
//		}
//		System.out.println("\n蓝球号码是：");
//		Thread.sleep(1000);
//		int lq=r.nextInt(16)+1;
//		System.out.println(lq+"  ");
//	}
//}
