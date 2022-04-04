package com.demo.Observer;

public class WebFrontend implements ModelObserver{
    @Override
    public void manageStaff() {
        System.out.println("Web nhận thông báo: Có thay đổi với staff");
    }

    @Override
    public void manageCustomer() {
        System.out.println("Web nhận thông báo: Có thay đổi với customer");
    }

    @Override
    public void manageVehicle() {
        System.out.println("Web nhận thông báo: Có thay đổi với vehicle");
    }
}
