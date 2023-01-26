package com.importexcel.importexcel.service.impl;

import com.importexcel.importexcel.entity.Bss;
import com.importexcel.importexcel.entity.User;
import com.importexcel.importexcel.helper.ExcelHelper;
import com.importexcel.importexcel.repository.BssRepository;
import com.importexcel.importexcel.repository.UserRepository;
import com.importexcel.importexcel.service.ExcelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {

    static Logger log = LoggerFactory.getLogger(ExcelHelper.class);

    @Autowired
    BssRepository bssRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(MultipartFile file) {
        try {
            List<User> users = ExcelHelper.excelToUser(file.getInputStream());
            userRepository.saveAll(users);
        }catch (IOException e){
            log.error("Error saving Excel ", e);
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }

    @Override
    public List<Bss> getAllBss() {
        return bssRepository.findAll();
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
