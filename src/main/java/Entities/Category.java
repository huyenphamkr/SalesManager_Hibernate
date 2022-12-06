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

@NamedQueries(  
    {  
        @NamedQuery(  
        name = "findCategoryByName",  
        query = "from Category e where e.Name = :name"  
        )  
    }  
)  
@Data
@Entity
@Table(name = "category")
public class Category {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CatagoryID;
    @Column
    private String Name;
    @Column
    private String Description ;
}
