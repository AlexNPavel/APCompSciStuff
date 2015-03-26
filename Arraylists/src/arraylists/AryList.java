package arraylists;
/*
    Alexander Pavel

    This class is supposed to take all the elements for array dataStore and put 
    them into ArrayList dataList. sqrListis supposed to then square each element
    and add the put the result in dataList after the element that was originally
    squared.
*/

import java.util.ArrayList;

public class AryList {
    
    int datastore[] = {12, 9, 20, 45, 28};
    ArrayList<Integer> dataList = new ArrayList<>();
    
    public AryList() {
        for(int i : datastore) {
            dataList.add(i);
        }   
        System.out.println(dataList);
    }
    
    public void sqrList() {
        int size = dataList.size();
        for(int i = 0; i < size; i++) {
            dataList.add(i*2+1, dataList.get(i*2)*dataList.get(i*2));
        }
        System.out.println(dataList);
    }
}
