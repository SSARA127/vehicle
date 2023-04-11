package org.example;

public class Dealer {

    private Integer dealerId;
    private String dealerName;
    private String companyName;
    private String dealerPhoneNumber;
    private Integer dealerGSTcode;

    public Dealer(Integer dealerId,String dealerName,String companyName,String dealerPhoneNumber,Integer dealerGSTcode){
        this.dealerId=dealerId;
        this.dealerName = dealerName;
        this.companyName = companyName;
        this.dealerPhoneNumber = dealerPhoneNumber;
        this.dealerGSTcode = dealerGSTcode;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDealerPhoneNumber() {
        return dealerPhoneNumber;
    }

    public void setDealerPhoneNumber(String dealerPhoneNumber) {
        this.dealerPhoneNumber = dealerPhoneNumber;
    }

    public Integer getDealerGSTcode() {
        return dealerGSTcode;
    }

    public void setDealerGSTcode(Integer dealerGSTcode) {
        this.dealerGSTcode = dealerGSTcode;
    }

    public String toString() {
        return "[DealerId = "+dealerId+" , DealerName = "+dealerName+
                " , CompanyName = "+companyName+" , DealerPhoneNumber = "+dealerPhoneNumber+
                " , DealerGSTcode = "+dealerGSTcode+"]";
    }

}
