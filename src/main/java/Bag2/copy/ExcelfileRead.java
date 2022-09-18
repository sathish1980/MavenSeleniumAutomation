package Bag2.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelfileRead {
	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Besant07082022\\inputfiles\\Input.xls";
	String fileoutput="C:\\Users\\sathishkumar\\eclipse-workspace\\Besant07082022\\inputfiles\\OutputBesant.xls";
	public void readdata() throws IOException
	{
		File f = new File(filepath);
		FileInputStream Fs = new FileInputStream(f);
		FileOutputStream FO =new FileOutputStream(fileoutput);
		HSSFWorkbook workbook= new HSSFWorkbook(Fs);
		HSSFWorkbook outworkbook= new HSSFWorkbook();
		//XSSFWorkbook workbook= new XSSFWorkbook(Fs);
		HSSFSheet sheet=workbook.getSheet("Testdata");
		HSSFSheet outsheet=outworkbook.createSheet("output");
		//XSSFSheet sheet=workbook.getSheet("Testdata");
		//int tota_rows=sheet.getLastRowNum();
		int tota_rows=sheet.getPhysicalNumberOfRows();
		for (int i=0;i<tota_rows;i++)
		{
			System.out.println(" ");
			
			//XSSFRow rowvalue=sheet.getRow(i);
			HSSFRow rowvalue=sheet.getRow(i);
			HSSFRow outrowrowvalue=outsheet.createRow(i);
			int tota_columns=rowvalue.getLastCellNum();
			for(int j=0;j<tota_columns;j++)
			{
				//XSSFCell cellvalue=rowvalue.getCell(j);
				Cell cellvalue=rowvalue.getCell(j);
				Cell outcellvalue=outrowrowvalue.createCell(j);
				readdatabasedondatatype(cellvalue,outcellvalue);
			}
			System.out.println(" ");
			
		}
		outworkbook.write(FO);
		outworkbook.close();
		FO.close();
		workbook.close();
		
	}
	
	public void readdatabasedondatatype(Cell cellvalue,Cell outcellvalue)
	{
		switch(cellvalue.getCellType())
		{
			case STRING:
				System.out.print(cellvalue.getStringCellValue()+" ");
				outcellvalue.setCellValue(cellvalue.getStringCellValue());
				break;
			case NUMERIC:
				DataFormatter dataFormatter = new DataFormatter();
				System.out.print(dataFormatter.formatCellValue(cellvalue)+" ");
				outcellvalue.setCellValue(dataFormatter.formatCellValue(cellvalue));
				break;
		
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelfileRead E = new ExcelfileRead();
		E.readdata();
	}

}
