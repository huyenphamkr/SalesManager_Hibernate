/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ClassEnum;
import DAL.DALGeneric;
import Entities.Category;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author ADMIN
 * 
 */
public class CategoryBLL extends BaseBLL<Category>{
    public CategoryBLL() {
        dalGeneric = new DALGeneric<Category>(Category.class);
    }
    @Override
    public List loadData() {
        List list;
        list = dalGeneric.LoadData(ClassEnum.Category);
        return list;
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
    public Object[][] ConvertListForTable(List<Category> list) {
        int rows = list.size();
        int cols = 3;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getCatagoryID();
            obj[i][1] = list.get(i).getName();
            obj[i][2] = list.get(i).getDescription();
//            obj[i][3] = list.get(i).getListVegetable().size();
        }
        return obj;
    }
    @Override
    public List FindDataByName(String name) {        
        TypedQuery query = dalGeneric.getQuery("findCategoryByName");
        query.setParameter("name", name);
        return query.getResultList();
    }

}
