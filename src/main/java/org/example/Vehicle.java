package org.example;

import java.util.ArrayList;
import java.util.List;

public class Vehicle  {

    private String brandName;
    private String modelName;
    private String vehicleType;
    private Integer wheelSize;
    private Double vehiclePrice;
    private Integer dealerId;
    private Integer showroomId;

    public Vehicle(String brandName,String modelName,String vehicleType,Integer wheelSize,Double vehiclePrice,Integer dealerId,Integer showroomId){
        this.brandName=brandName;
        this.modelName = modelName;
        this.vehicleType = vehicleType;
        this.wheelSize = wheelSize;
        this.vehiclePrice = vehiclePrice;
        this.dealerId=dealerId;
        this.showroomId=showroomId;
    }

    public Vehicle() {

    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Integer wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(Double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getShowroomId() {
        return showroomId;
    }

    public void setShowroomId(Integer showroomId) {
        this.showroomId = showroomId;
    }

    public String toString() {
        return "[BrandName = "+brandName+" , ModelName = "+modelName+
                " , VehicleType = "+vehicleType+" , WheelSize = "+wheelSize+" , VehiclePrice = "+vehiclePrice+
                " , DealerId = "+dealerId+" , ShowroomId = "+showroomId+"]";
    }

}
