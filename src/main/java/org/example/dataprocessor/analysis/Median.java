package org.example.dataprocessor.analysis;

import java.util.ArrayList;
import java.util.List;

public class Median implements AnalysisInterface {
    @Override
    public int clean(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return 0;
        }
        List<Integer> listForMean=new ArrayList<>(data);
        int meedian =listForMean.size()-1/2;
        System.out.println(data.get(meedian));

    return meedian; }
}
