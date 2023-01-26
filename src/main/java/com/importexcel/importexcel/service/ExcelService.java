package com.importexcel.importexcel.service;

import com.importexcel.importexcel.entity.Bss;
import com.importexcel.importexcel.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ExcelService {
    void save(MultipartFile file);
    List<Bss> getAllBss();
    List<User> getAllUser();
}
