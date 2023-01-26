package com.importexcel.importexcel.helper;

import com.importexcel.importexcel.entity.Bss;
import com.importexcel.importexcel.entity.User;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHelper {

    static Logger log = LoggerFactory.getLogger(ExcelHelper.class);
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String[] HEADERS = {"Name", "Location", "Longitude", "Latitude", "Slot", "Status", "Kota", "Provinsi"};
    static String SHEET = "INITIAL DATA";

    public static Boolean isExcel(MultipartFile file) {
        if (!TYPE.equals(file.getContentType())) {
            return false;
        }
        return true;
    }

    public static List<User> excelToUser(InputStream inputStream) {
        try {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();

            List<User> userList = new ArrayList<>();

            int rowNum = 0;

            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // check for empty row
                // if rowNum == 0 then skip
                if (rowNum == 0) {
                    rowNum++;
                    continue;
                }

                Iterator<Cell> cells = currentRow.iterator();

                User user = new User();

                int cellNum = 0;
                while (cells.hasNext()) {
                    Cell currentCell = cells.next();

                    // mapping cell to Bss object
                    switch (cellNum) {
                        case 0:
                            log.info(String.valueOf(currentCell.getStringCellValue()));
                            user.setEmpNo(currentCell.getStringCellValue());
                            break;
                        case 1:
                            user.setEmployeeName(currentCell.getStringCellValue());
                            break;
                        case 2:
                            user.setPositionName(currentCell.getStringCellValue());
                            break;
                        case 3:
                            user.setDepartment(currentCell.getStringCellValue());
                            break;
                        case 4:
                            user.setWorklocationCode(currentCell.getStringCellValue());
                            break;
                        case 5:
                            user.setWorklocationName(currentCell.getStringCellValue());
                            break;
                        case 6:
                            user.setEndDate(currentCell.getStringCellValue());
                            break;
                        case 7:
                            user.setSupervisorNik(currentCell.getStringCellValue());
                            break;
                        case 8:
                            user.setSupervisorName(currentCell.getStringCellValue());
                            break;
                        case 9:
                            user.setDeptHeadUp1(currentCell.getStringCellValue());
                            break;
                        case 10:
                            user.setManagerNik(currentCell.getStringCellValue());
                            break;
                        case 11:
                            user.setManagerName(currentCell.getStringCellValue());
                            break;
                        case 12:
                            user.setDeptHeadUp2(currentCell.getStringCellValue());
                            break;
                        case 13:
                            user.setEmail(currentCell.getStringCellValue());
                            break;
                        default:
                            break;
                    }
                    cellNum++;
                }
                userList.add(user);
            }
            workbook.close();

            log.info(String.valueOf(sheet.getLastRowNum()));
            return userList;
        } catch (IOException e) {
            log.error(e.getMessage());
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}
