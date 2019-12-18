//package jdbc;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import com.io.FileinputStream;
//
//public class shiliinput {
//	public static void main(String[] args) throws Exception {
//		FileinputStream fin=new FileinputStream("shili.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook(fin);
//		XSSFSheet sheet=workbook.getSheet("sheet1");
//		int rows=sheet.getLastRowNum();
//		for(int i = 1; i<=rows; i++) {
//			XSSFRow row=sheet.getRow(i);
//			XSSFCell cell=row.getCell(3);
//			String xuehao=cell.getStringCellValue();
//			System.out.println(xuehao);
//		}
//	}
//}
