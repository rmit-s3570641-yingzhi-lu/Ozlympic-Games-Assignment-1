package ass1;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static void main(String args[]){
		//The file is allocated at C:\Users\NQ\Desktop.PARTICIPANT.xls
		File f=new File("C:"+File.separator+"Users"+File.separator+"NQ"+File.separator+"Desktop"+File.separator+"PARTICIPANT.xls");
		try {
			//Get the file
			Workbook book=Workbook.getWorkbook(f);
			//Get the first sheet
			Sheet sheet=book.getSheet(0);  
			for(int i=0;i<sheet.getRows();i++){
				for(int j=0;j<sheet.getColumns();j++){
					//Get the cells
					Cell cell=sheet.getCell(j, i);
					System.out.print(cell.getContents()+" "); 
				}
				System.out.print("\n");
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
