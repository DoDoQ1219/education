package com.education.model.dto;

import com.education.model.entity.StudentInfo;

import java.io.Serializable;

/**
 * @author zengjintao
 * @version 1.0
 * @create_at 2020/11/21 21:09
 */
public class StudentInfoSession implements Serializable {

    private String token;
    private StudentInfo studentInfo;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }
}
