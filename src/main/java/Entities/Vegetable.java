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
        name = "findVegetableByName",  
        query = "from Vegetable e where e.VegetableName = :name"  
        )  
    }  
)  


@Data
@Entity
@Table(name = "vegetable")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VegetableID;
    @Column
    private int CatagoryID;

    @Column
    private String VegetableName;
    @Column
    private String Unit;
    @Column
    private int Amount;
    @Column
    private String Image;
    @Column
    private Float Price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CatagoryID", nullable = true, insertable = false, updatable = false, foreignKey = @ForeignKey(name = "category_ibfk_1"))
    private Category CategoryObject;

}
