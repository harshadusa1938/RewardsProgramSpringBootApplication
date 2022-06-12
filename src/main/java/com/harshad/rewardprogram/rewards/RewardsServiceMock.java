package com.harshad.rewardprogram.rewards;

import com.harshad.rewardprogram.model.Customer;
import com.harshad.rewardprogram.model.MyTransaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RewardsServiceMock {

    private static List<MyTransaction> transactions = new ArrayList<MyTransaction>();
    private static long index;

    static {

        transactions.add(new MyTransaction(index++, new Customer(1, "Harshad"), 100.0, "Online Shopping 1", new Date()));
        transactions.add(new MyTransaction(index++, new Customer(2, "Rahul"), 50.0, "Online Shopping 2", new Date()));
        transactions.add(new MyTransaction(index++, new Customer(3, "Akash"), 120.0, "Online Shopping 3", new Date()));
    }

    public List<MyTransaction> getAll() {
        return transactions;
    }
}
