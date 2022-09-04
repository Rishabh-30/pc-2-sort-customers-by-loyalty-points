package com.jap.customers;


import java.util.Comparator;

// Implement the Comparator interface
public class LoyaltyPointComparator implements Comparator<Customer> {
    public int compare(Customer customer1,Customer customer2){
        if(customer1.getLoyaltyPoints() == customer2.getLoyaltyPoints()){
            return 0;
        }
        if(customer1.getLoyaltyPoints() > customer2.getLoyaltyPoints()){
            return -1;
        }
        else{
            return 1;
        }
    }

}
