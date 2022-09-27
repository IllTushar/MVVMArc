package com.example.mvvmarc;

public class ModelClass {
    String cname;
   public ModelClass(){}
    public ModelClass(String cname) {
        this.cname = cname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
