/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ClassEnum;
import DAL.DALGeneric;
import Entities.Category;
import Entities.Vegetable;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author ADMIN
 */
public class VegetableBLL extends BaseBLL<Vegetable>{
    public VegetableBLL() {
        dalGeneric = new DALGeneric<Vegetable>(Vegetable.class);
    }
    public List loadData() {
        List list;
        list = dalGeneric.LoadData(ClassEnum.Vegetable);
        return list;
    }
    @Override
    public Object[][] ConvertListForTable(List<Vegetable> list) {
        int rows = list.size();
        int cols = 7;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getVegetableID();
            obj[i][1] = list.get(i).getCatagoryID();
            obj[i][2] = list.get(i).getVegetableName();
            obj[i][3] = list.get(i).getUnit();
            obj[i][4] = list.get(i).getAmount();
            obj[i][5] = list.get(i).getImage();
            obj[i][6] = list.get(i).getPrice();
        }
        return obj;
    }
    public String[] ConvertListToComboBox(List<Category> list) {
        int rows = list.size();
        String[] newList = new String[rows];
        for (int i = 0; i < rows; i++) {
            newList[i] = list.get(i).getName();

        }
        return newList;
    }
    @Override
    public List FindDataByName(String name) {        
        TypedQuery query = dalGeneric.getQuery("findVegetableByName");
        query.setParameter("name", name);
        return query.getResultList();
    }
   
}
