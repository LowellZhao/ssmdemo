package com.lwz.service.impl;


import com.lwz.beans.Student;
import com.lwz.dao.IStudentDao;
import com.lwz.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Transactional
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

}
