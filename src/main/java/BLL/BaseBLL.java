/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.DALGeneric;
import java.util.List;
import javax.persistence.TypedQuery;
public abstract class BaseBLL<T> {
    protected DALGeneric<T> dalGeneric;
    protected Class<T> classType;
    
    public abstract List loadData();  
    public abstract Object[][] ConvertListForTable(List<T> list);

    public void newData(T data) {
        dalGeneric.Add(data);
    }

    public T getData(int dataID) {
        T data = dalGeneric.getData(dataID);
        return data;
    }
    
    public void editData(T newData) {
        dalGeneric.Update(newData);
    }

    public void deleteData(int dataID) {
        dalGeneric.Delete(dataID);
    }
    public abstract List FindDataByName(String name) ; 
}
