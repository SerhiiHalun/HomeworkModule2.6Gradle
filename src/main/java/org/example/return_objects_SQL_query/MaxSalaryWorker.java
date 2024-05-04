package org.example.return_objects_SQL_query;

import javax.lang.model.element.Name;

public class MaxSalaryWorker {
    private String name;

    public MaxSalaryWorker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MaxSalaryWorker{" +
                "name='" + name + '\'' +
                '}';
    }
}
