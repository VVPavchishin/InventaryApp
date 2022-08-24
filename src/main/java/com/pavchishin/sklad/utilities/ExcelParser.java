package com.pavchishin.sklad.utilities;

import com.pavchishin.sklad.model.SparePart;
import com.pavchishin.sklad.repository.PartRepository;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

@NoArgsConstructor

public class ExcelParser {

    public static void excelReader(String filename, PartRepository repository) {

        if (filename.endsWith(".xlsx") ) {
            File file = new File(filename);
            readerRead(file, repository);
        }
    }

    private static void readerRead(File file, PartRepository repository) {
        if (!file.exists()) {
            return;
        }
        try(InputStream stream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(stream)) {
            Sheet sheet = workbook.getSheetAt(0);

            int startRow = sheet.getFirstRowNum() + 10;
            int lastRow = sheet.getLastRowNum();

            DataFormatter formatter = new DataFormatter();

            for (int i = startRow; i <= lastRow; i++) {

                SparePart sparePart = new SparePart();

                String location = formatter.formatCellValue(sheet.getRow(i).getCell(0));
                sparePart.setPartLocation(location);

                String number = formatter.formatCellValue(sheet.getRow(i).getCell(3));
                sparePart.setPartNumber(number);

                String name = formatter.formatCellValue(sheet.getRow(i).getCell(4));
                sparePart.setPartName(name);

                int quantityDock = (int) sheet.getRow(i).getCell(8).getNumericCellValue();
                sparePart.setPartQuantity(quantityDock);

                sparePart.setPartQuantityFact(0.0);
                sparePart.setPartBarcode(number.replaceAll("-", ""));

                repository.save(sparePart);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
