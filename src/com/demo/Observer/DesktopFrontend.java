package com.demo.Observer;

import com.demo.Observer.ModelObserver;

public class DesktopFrontend implements ModelObserver {
    @Override
    public void manageStaff() {
        System.out.println("Desktop nhận thông báo: Có thay đổi với staff");
    }

    @Override
    public void manageCustomer() {
        System.out.println("Desktop nhận thông báo: Có thay đổi với customer");

    }

    @Override
    public void manageVehicle() {
        System.out.println("Desktop nhận thông báo: Có thay đổi với vehicle");

    }
}
