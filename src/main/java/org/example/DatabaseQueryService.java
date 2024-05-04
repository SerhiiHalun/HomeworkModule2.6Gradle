package org.example;

import org.example.return_objects_SQL_query.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    public static List<LongestProject> findLongestProject(){

        List<LongestProject> longestProjects = new ArrayList<>();
        try {
            Database database = Database.getInstance();
            Statement  statement  = database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(FileSupportSQL.fileReader("sql_resources/find_longest_project.sql"));
            while (resultSet.next()){
                longestProjects.add(new LongestProject(resultSet.getString("CLIENT_NAME"),resultSet.getInt("MONTH_COUNT")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return longestProjects;
    }
    public static List<MaxProjectCliens> findMaxProjectsClien(){

        List<MaxProjectCliens> longestProjects = new ArrayList<>();
        try {
            Database database = Database.getInstance();
            Statement  statement  = database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(FileSupportSQL.fileReader("sql_resources/find_max_projects_client.sql"));
            while (resultSet.next()){
                longestProjects.add(new MaxProjectCliens(resultSet.getString("NAME"),resultSet.getInt("PROJECT_COUNT")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return longestProjects;
    }

    public static List<MaxSalaryWorker> findMaxSalaryWorker(){

        List<MaxSalaryWorker> listMaxSalaryWorker = new ArrayList<>();
        try {
            Database database = Database.getInstance();
            Statement  statement  = database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(FileSupportSQL.fileReader("sql_resources/find_max_salary_worker.sql"));
            while (resultSet.next()){
                listMaxSalaryWorker.add(new MaxSalaryWorker(resultSet.getString("NAME")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listMaxSalaryWorker;
    }


    public static List<YoungestEldestWorker> findYoungestEldestWorker(){

        List<YoungestEldestWorker> listYoungestEldestWorker = new ArrayList<>();
        try {
            Database database = Database.getInstance();
            Statement  statement  = database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(FileSupportSQL.fileReader("sql_resources/find_youngest_eldest_workers.sql"));
            while (resultSet.next()){
                listYoungestEldestWorker.add(new YoungestEldestWorker(resultSet.getString("TYPE"),resultSet.getString("NAME"),resultSet.getDate("BIRTHDAY")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listYoungestEldestWorker;
    }

    public static List<ProjectPrices> findProjectPrices(){

        List<ProjectPrices> listProjectPrices = new ArrayList<>();
        try {
            Database database = Database.getInstance();
            Statement  statement  = database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(FileSupportSQL.fileReader("sql_resources/print_project_prices.sql"));
            while (resultSet.next()){
                listProjectPrices.add(new ProjectPrices(resultSet.getString("PROJECT_NAME"),resultSet.getInt("PROJECT_COST")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listProjectPrices;
    }
}
