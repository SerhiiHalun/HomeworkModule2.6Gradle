package org.example.return_objects_SQL_query;

public class MaxProjectCliens {
    private String name;
    private int projectCount;

    public MaxProjectCliens(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "MaxProjectCliens{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
