package com.demo.Facade;

import com.demo.Entity.Customer;
import com.demo.Entity.Staff;
import com.demo.Entity.Vehicle;
import com.demo.Observer.ModelObserver;

import java.util.ArrayList;

public class ModelFacade {
    private Garage garage;
    private Organization organization;
    private Payroll payroll;
    public ModelFacade(){
        this.garage = new Garage();
        this.organization = new Organization();
        this.payroll = new Payroll();
    }
    private ArrayList<ModelObserver> subscribers;
    public void subscribe(ModelObserver subscriber){
        if (subscribers == null){
            subscribers = new ArrayList<>();
        }
        subscribers.add(subscriber);
    }
    public void unsubscribe(ModelObserver subscriber){
        if (subscribers == null){
            subscribers = new ArrayList<>();
            return;
        }
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(ActionType actionType){
        for (ModelObserver s: subscribers) {
            switch (actionType){
                case STAFF:
                    s.manageStaff();
                    break;
                case VEHICLE:
                    s.manageVehicle();
                    break;
                case CUSTOMER:
                    s.manageCustomer();
                    break;
                default:
                    break;
            }
        }
    }
    public void addVehicle(Vehicle vehicle){
        garage.addVehicle(vehicle);
        notifySubscribers(ActionType.VEHICLE);
    }
    public void addCustomer(Customer customer){
        organization.addCustomer(customer);
        notifySubscribers(ActionType.CUSTOMER);
    }
    public void addStaff(Staff staff){
        payroll.addStaff(staff);
        notifySubscribers(ActionType.STAFF);
    }
}
