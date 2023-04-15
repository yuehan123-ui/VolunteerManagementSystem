package com.ztbu.pojo;

public class Volunteer {
    private int id;
    private String name;
    private String sex;
    private String grade;
    private String call;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", call='" + call + '\'' +
                '}';
    }
}
