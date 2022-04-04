package com.demo;

import com.demo.Entity.Customer;
import com.demo.Entity.Staff;
import com.demo.Entity.Vehicle;
import com.demo.Facade.ModelFacade;
import com.demo.Observer.DesktopFrontend;
import com.demo.Observer.ModelObserver;
import com.demo.Observer.WebFrontend;

public class MainThread {
    public static void main(String[] args) {
        ModelFacade pub = new ModelFacade();
        ModelObserver sub1 = new DesktopFrontend();
        ModelObserver sub2 = new WebFrontend();

        pub.subscribe(sub1);
        pub.subscribe(sub2);

        Vehicle vehicle = new Vehicle();
        Staff staff = new Staff();
        Customer customer = new Customer();

        pub.addVehicle(vehicle);
        pub.addCustomer(customer);
        pub.addStaff(staff);
    }
}
