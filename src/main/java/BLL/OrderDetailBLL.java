/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ClassEnum;
import DAL.DALGeneric;
import Entities.OrderDetail;
import Entities.Vegetable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author nnbcf
 */
public class OrderDetailBLL extends BaseBLL<OrderDetail> {

    public static List<Vegetable> vegetableList;

    public OrderDetailBLL() {
        vegetableList = new ArrayList<Vegetable>();
        dalGeneric = new DALGeneric<OrderDetail>(OrderDetail.class);
    }

    @Override
    public List loadData() {
        List list;
        list = dalGeneric.LoadData(ClassEnum.OrderDetail);
        return list;
    }
@Override
    public List FindDataByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public Object[][] ConvertListForTable(List<OrderDetail> list) {
        int rows = list.size();
        int cols = 4;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getVegetableID();
            obj[i][1] = list.get(i).getQuantity();
            obj[i][2] = list.get(i).getPrice();
        }
        return obj;
    }

    public List GroupById() {
        TypedQuery query = dalGeneric.getQuery("groupByOrder");
        return query.getResultList();
    }

}
