package com.netcracker.chapter3.cashe;

import java.util.ArrayList;
import java.util.List;

public class CashRegister
    {
        private double payment;
        private double change;
        private double tax;

        public double getTotalTax() {
            return totalTax;
        }

        private double totalTax;
        private List<Product> listOfProducts = new ArrayList<>();

        public CashRegister(double payment, double tax, List<Product> listOfProducts) {
            this.payment = payment;
            this.tax = tax;
            this.listOfProducts = listOfProducts;
        }

        public double getTax(){
            return tax;
        }

        public CashRegister(double payment) {
            this.payment = payment;
        }

        public CashRegister(double payment, List<Product> listOfProducts) {
            this.payment = payment;
            this.listOfProducts = listOfProducts;
        }

        public void getListOfProducts() {
            for(Product p : listOfProducts){
                System.out.println(p);
            }
        }

        public int getCount(){
            return listOfProducts.size();
        }

        public double getPurchase(){
            double purchase = 0;
            for (Product p : listOfProducts){
                if(p.isRecordPurchase()) {
                    purchase += p.getCost() + (p.getCost()*20)/100;
                    totalTax += (p.getCost()*20)/100;
                }else{
                    purchase +=p.getCost();
                }
            }
            return purchase;
        }

        public double giveChange()
        {
            change = payment - getPurchase();
            payment = 0;
            return change;
        }
    }

