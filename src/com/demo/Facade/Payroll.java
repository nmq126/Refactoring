package com.demo.Facade;

import com.demo.Entity.Staff;

import java.util.ArrayList;

public class Payroll {
    private ArrayList<Staff> staffs;
    public void addStaff(Staff staff){
        if (staffs == null){
            staffs = new ArrayList<>();
        }
        staffs.add(staff);
        System.out.println("Payroll có nhân viên mới");

    }
}
