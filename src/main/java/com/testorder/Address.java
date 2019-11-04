package com.testorder;

/**
 * @author zhanglei
 * @description
 * @date 2019/7/18
 */
public class Address {
    private String id;
    private String customer;
    private String consignee;
    private String phone;

    public Address(String id,String customer, String consignee) {
        this.id = id;
        this.customer = customer;
        this.consignee = consignee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
