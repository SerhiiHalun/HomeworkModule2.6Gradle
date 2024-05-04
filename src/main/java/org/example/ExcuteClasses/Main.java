package org.example.ExcuteClasses;

import org.example.DatabaseQueryService;
import org.example.return_objects_SQL_query.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<LongestProject> listLP = DatabaseQueryService.findLongestProject();
        System.out.println(listLP.toString());
        
        List<MaxProjectCliens> listMPC = DatabaseQueryService.findMaxProjectsClien();
        System.out.println(listMPC.toString());

        List<MaxSalaryWorker> listMSW = DatabaseQueryService.findMaxSalaryWorker();
        System.out.println(listMSW.toString());

        List<YoungestEldestWorker> listYEW = DatabaseQueryService.findYoungestEldestWorker();
        System.out.println(listYEW.toString());

        List<ProjectPrices> listPP = DatabaseQueryService.findProjectPrices();
        System.out.println(listPP.toString());

    }
}