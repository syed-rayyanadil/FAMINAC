package com.company.famanic.historyRecyclerView;

public class HistoryObject {
    private String serviceId;
    private String time;

    public HistoryObject(String serviceId, String time){
        this.serviceId = serviceId;
        this.time = time;
    }

    public String getRideId(){return serviceId;}
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getTime(){return time;}
    public void setTime(String time) {
        this.time = time;
    }
}

