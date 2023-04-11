package org.example;

public class Showroom {

    private Integer showroomId;
    private String showroomName;
    private String showroomLocation;
    private String showroomStatus;
    private Integer showroomGSTcode;

    public Showroom(Integer showroomID,String showroomName,String showroomLocation,String showroomStatus,Integer showroomGSTcode){
        this.showroomId=showroomID;
        this.showroomName = showroomName;
        this.showroomStatus = showroomStatus;
        this.showroomLocation = showroomLocation;
        this.showroomGSTcode = showroomGSTcode;
    }

    public Integer getShowroomId() {
        return showroomId;
    }

    public void setShowroomId(Integer showroomId) {
        this.showroomId = showroomId;
    }

    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public String getShowroomLocation() {
        return showroomLocation;
    }

    public void setShowroomLocation(String showroomLocation) {
        this.showroomLocation = showroomLocation;
    }

    public String getShowroomStatus() {
        return showroomStatus;
    }

    public void setShowroomStatus(String showroomStatus) {
        this.showroomStatus = showroomStatus;
    }

    public Integer getShowroomGSTcode() {
        return showroomGSTcode;
    }

    public void setShowroomGSTcode(Integer showroomGSTcode) {
        this.showroomGSTcode = showroomGSTcode;
    }

    public String toString() {
        return "[ShowroomId = "+showroomId+" , ShowroomName = "+showroomName+
                " , ShowroomLocation = "+showroomLocation+" , ShowroomStatus = "+showroomStatus+
                " , ShowroomGSTcode = "+showroomGSTcode+"]";
    }
}
