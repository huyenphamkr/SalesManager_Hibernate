/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ADMIN
 */
@NamedQueries(  
    {  
        @NamedQuery(  
        name = "findCustomerByName",  
        query = "from Customers e where e.Fullname = :name"  
        )  
    }  
)  
@Data
@Entity
@Table(name = "customers")
public class Customers {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerID;
    @Column
    private String Fullname;
    @Column
    private String Password;
    @Column
    private String Address;
    @Column
    private String City;
}
