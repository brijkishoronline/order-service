package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders() {
        return Stream.of(
                new Order(101, "Mobile", 1, 3000),
                new Order(58, "Book", 3, 300),
                new Order(122, "Laptop", 1, 6000),
                new Order(134, "headset", 1, 340))
                .collect(Collectors.toList());
    }
}



