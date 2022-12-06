/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;

import javax.persistence.Table;

import lombok.Data;


/**
 *
 * @author nnbcf
 */
@NamedNativeQueries(  
    {  
        @NamedNativeQuery(  
        name = "groupByOrder",  
        query = "(Select stt, OrderID, VegetableID, sum(Quantity) as Quantity, sum(Price) as Price from OrderDetail Group By VegetableID)",
        resultClass = OrderDetail.class
        )  
    }  
)  
@Data
@Entity
@Table(name = "orderdetail")
public class OrderDetail {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int stt;
    @Column
    private int OrderID;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "OrderID", nullable = false, insertable = false, updatable = false, foreignKey = @ForeignKey(name = "orderdetail_ibfk_2"))
    private Orders OrdersObject;
    @Column
    private int VegetableID;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "VegetableID", nullable = false, insertable = false, updatable = false, foreignKey = @ForeignKey(name = "orderdetail_ibfk_1"))
    private Vegetable VegetableObject;
    @Column
    private int Quantity;
    @Column
    private float Price;
//    @Formula(value="Select sum(Quantity) as Quantity from OrderDetail Group By VegetableID")
//    @Formula(value="Select sum(Price) as Price from OrderDetail Group By VegetableID")

    
}
