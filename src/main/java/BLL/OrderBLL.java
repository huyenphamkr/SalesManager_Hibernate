/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ClassEnum;
import DAL.DALGeneric;
import Entities.Orders;
import java.util.List;

/**
 *
 * @author nnbcf
 */
public class OrderBLL extends BaseBLL<Orders>{

    public Orders tempBill;
    public OrderBLL(){
        dalGeneric = new DALGeneric<Orders>(Orders.class);
    }
    @Override
    public List loadData() {
        List list;
        list = dalGeneric.LoadData(ClassEnum.Orders);
        return list;
    }
    @Override
    public Object[][] ConvertListForTable(List<Orders> list) {
        int rows = list.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getOrderID();
            obj[i][1] = list.get(i).getCustomerObject().getFullname();
            obj[i][2] = list.get(i).getDate();
            obj[i][3] = list.get(i).getTotal();
            obj[i][4] = list.get(i).getNote();
        }
        return obj;
    }

    @Override
    public List FindDataByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    

    
}
