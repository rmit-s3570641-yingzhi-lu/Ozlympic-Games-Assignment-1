package ass1;
/**
 * @author Ningqi Lu
 * 27/03/2017
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	
	public static int i;
	public static int j;
	public static Workbook book;
	public static Sheet sheet;
//	static ArrayList Swimmer = new ArrayList();

	public static void main(String args[]){
		//The file is allocated at C:\Users\NQ\Desktop¡£PARTICIPANT.xls
		File f=new File("C:"+File.separator+"Users"+File.separator+"NQ"+File.separator+"Desktop"+File.separator+"PARTICIPANT.xls");
	
		try {
			//Get the file
			Workbook book=Workbook.getWorkbook(f);
			//Get the first sheet
			Sheet sheet=book.getSheet(0);  
			
			System.out.println("Input the type(OFFICIAL/SWIMMER/CYCLIST/SPRINTER/SUPERATHLETE):");
			Scanner sc = new Scanner(System.in);
			String type = sc.nextLine();
			
			for(i = 1; i < sheet.getRows(); i++){
				for(j = 0; j < sheet.getColumns(); j++){
					
				/*	ReadExcel list = new ReadExcel();
					list.matchSwimmer();*/
					//Swimmer.add(list);
					//Get the cells
					Cell cell=sheet.getCell(j, i);
					
					
					if(cell.getContents().equals(type)){
							for(int n = 0; n <= j; n++){
								System.out.print(sheet.getCell(n, i).getContents()+" ");  
							}
							System.out.print("\n");
					}
				}
				
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*	public void matchSwimmer(){
		//Get the cells
		Cell cell=sheet.getCell(j, i);
		
		if(cell.getContents().equals("SWIMMER")){
				for(int n = 0; n <= j; n++){
					System.out.print(sheet.getCell(n, i).getContents()+" ");  
				}
				System.out.print("\n");
		}
	}*/
	}
