package JDBC_SDET;

import java.util.ArrayList;
import java.util.List;
public class Root1
{
    private List<Data> data;

    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
        return this.data;
    }
}