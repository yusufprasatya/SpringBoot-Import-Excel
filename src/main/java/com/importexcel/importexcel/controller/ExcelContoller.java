package com.importexcel.importexcel.controller;

import com.importexcel.importexcel.entity.Bss;
import com.importexcel.importexcel.helper.ExcelHelper;
import com.importexcel.importexcel.service.ExcelService;
import com.importexcel.importexcel.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/excel")
public class ExcelContoller {

    @Autowired
    ExcelService excelService;

    @PostMapping("/import")
    public ResponseEntity<ResponseMessage> importExcel(MultipartFile file) {
        String message;
        if (ExcelHelper.isExcel(file)){
            excelService.save(file);

            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        }
        message = "Please upload an excel file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }

    @GetMapping("/bss")
    public ResponseEntity<List<Bss>> getAllBss() {
        try {
            List<Bss> tutorials = excelService.getAllBss();

            if (tutorials.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
