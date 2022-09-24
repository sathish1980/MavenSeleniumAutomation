package auto.MavenSeleniumAutomation;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	static Object s;
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\JAVABasics\\inputfiles\\inputdata.xlsx";
	
	public void read() throws IOException{
		
		File F = new File(filepath);
		FileInputStream fs= new FileInputStream(F);
		XSSFWorkbook hsf = new XSSFWorkbook(fs); // we can able to read xlsx file
		//or
		//HSSFWorkbook hsf = new HSSFWorkbook(fs); // we can able to read xls file
		
		Sheet sh= hsf.getSheet("input");
		//Sheet sh= wbk.getSheetAt(1);
	//	int usedrow=sh.getLastRowNum();
		int usedrow=sh.getPhysicalNumberOfRows();
		
		for(int i=0;i<=usedrow;i++)
		{
			Row rw=sh.getRow(i);
			if(rw!=null)
			{	
			int usedcolumn= rw.getLastCellNum();
			for(int j=0;j<usedcolumn;j++)
			{
				Cell celvalue=rw.getCell(j);
				if(celvalue!=null)
				{
				System.out.print(readdataassuch(celvalue));
				System.out.print(" ");
				}
			}
			System.out.println("");
			}
		}
		hsf.close();
		fs.close();
	}

	public static Object readdataassuch(Cell cellvalue)
	{
		if(cellvalue.getCellType().equals(CellType.STRING))
		{
			s= cellvalue.getStringCellValue();
		}
		else if(cellvalue.getCellType().equals(CellType.NUMERIC)) 
		{
			DataFormatter dataFormatter = new DataFormatter();
			s = dataFormatter.formatCellValue(cellvalue);
		}
		
		return s;
	}

}
