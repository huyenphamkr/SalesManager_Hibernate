/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ClassEnum;
import DAL.DALGeneric;
import Entities.Customers;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author ADMIN
 */
public class CustomersBLL extends BaseBLL<Customers>{

    public CustomersBLL(){
        dalGeneric = new DALGeneric<Customers>(Customers.class);
    }
    @Override
    public List loadData() {
        List list;
        list = dalGeneric.LoadData(ClassEnum.Customers);
        return list;
    }
    public String[] ConvertListToComboBox(List<Customers> list) {
        int rows = list.size();
        String[] newList = new String[rows];
        for (int i = 0; i < rows; i++) {
            newList[i] = list.get(i).getFullname();            
        }
        return newList;
    }

    @Override
    public Object[][] ConvertListForTable(List<Customers> list) {
        int rows = list.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getCustomerID();
            obj[i][1] = list.get(i).getFullname();
            obj[i][2] = list.get(i).getPassword();
            obj[i][3] = list.get(i).getAddress();
            obj[i][4] = list.get(i).getCity();
        }
        return obj;
    }

    @Override
    public List FindDataByName(String name) {
        TypedQuery query = dalGeneric.getQuery("findCustomerByName");
        query.setParameter("name", name);
        return query.getResultList();
    }

    
}
