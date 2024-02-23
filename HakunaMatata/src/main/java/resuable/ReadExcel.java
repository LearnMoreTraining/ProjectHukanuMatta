package resuable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String getData(String sheetName, int row, int column) throws IOException {

        FileInputStream fils = new FileInputStream(new File("src/main/resources/testdata/DataFile1.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fils);
        XSSFSheet sheet = wb.getSheet(sheetName);
        String data =sheet.getRow(row).getCell(column).getStringCellValue();

        return data;
    }
}
