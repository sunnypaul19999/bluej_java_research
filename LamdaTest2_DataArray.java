import java.io.*;
import java.util.*;

interface DataArray{
    Data[] create(int n);
}

class Data{
    List<Integer> dataList;
    Data(List<Integer> dataList){
        this.dataList = dataList;
    }
}

public class LamdaTest2_DataArray{

    public static void main() {
        DataArray dataArray = Data[]::new;

        dataArray.create(10);
    }
}