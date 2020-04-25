package com.woxing.pojo;

public class meate {
    private String name;

    private String Devel;

    private String Reply;

    private String supply;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDevel() {
        return Devel;
    }

    public void setDevel(String devel) {
        Devel = devel;
    }

    public String getReply() {
        return Reply;
    }

    public void setReply(String reply) {
        Reply = reply;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }




    public meate(String name, String devel, String reply, String supply) {
        this.name = name;
        Devel = devel;
        Reply = reply;
        this.supply = supply;
    }

    public meate() {
    }
}

