/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.hibernate;

import BLL.CategoryBLL;
import Entities.Category;
import java.util.List;
import BLL.CustomersBLL;
import BLL.OrderBLL;
import BLL.OrderDetailBLL;
import BLL.VegetableBLL;
import DAL.ClassEnum;
import Entities.Customers;
import Entities.Orders;
import Entities.OrderDetail;
import Entities.Vegetable;

/**
 *
 * @author ad
 */
public class Hibernate {

    public static void main(String[] args) {
//        CategoryBLL cateBLL = new CategoryBLL();
//        List<Category> listCate = cateBLL.loadCategory(ClassEnum.Category);
//        System.out.println("Before Add");
//        System.out.println(listCate);
//        
//        Category newCategory = new Category();
//        newCategory = cateBLL.getCategory(2);
//        System.out.println(newCategory.getName());
        VegetableBLL vegetableBLL = new VegetableBLL();
//        List<Vegetable> listVegetables = vegetableBLL.loadVegetable(ClassEnum.Vegetable);
//        for (OrderDetail vegetable : listVegetables) {
//            System.out.println(vegetable.getOrdersObject().getNote());
//        }
//        System.out.println("Before Add");
//        System.out.println(listCate);
//        
//        Orders newVegetable = new Orders();
//        newVegetable = orderBLL.getOrders(2);
//        System.out.println(newVegetable.getOrderID());
        /*Vegetable newVegetable = new Vegetable();
        newVegetable.setAmount(20);
        newVegetable.setCatagoryID(2);
        newVegetable.setImage("test.jpg");
        newVegetable.setPrice(Float.parseFloat("80000"));
        newVegetable.setUnit("kg");
        newVegetable.setVegetableName("Cai xanh");

        vegetableBLL.newVegetble(newVegetable);
        System.out.println("After Delete");
        System.out.println(listVegetables);*/

    }
}
