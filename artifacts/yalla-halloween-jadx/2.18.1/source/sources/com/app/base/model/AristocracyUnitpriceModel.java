package com.app.base.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AristocracyUnitpriceModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    private String f11856code;
    private List<DataBean> data;
    private String message;
    private String paytype;

    public static class DataBean {
        private String aToken;
        private String amount;
        private String picurl;
        private int price;
        private int promotionprice;
        private int renew;
        private String returnMoney;
        private String shopid;
        private String sku;
        private String waresname;

        public String getAmount() {
            return this.amount;
        }

        public String getPicurl() {
            return this.picurl;
        }

        public int getPrice() {
            return this.price;
        }

        public int getPromotionprice() {
            return this.promotionprice;
        }

        public int getRenew() {
            return this.renew;
        }

        public String getReturnMoney() {
            return this.returnMoney;
        }

        public String getShopid() {
            return this.shopid;
        }

        public String getSku() {
            return this.sku;
        }

        public String getWaresname() {
            return this.waresname;
        }

        public String getaToken() {
            return this.aToken;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setPicurl(String str) {
            this.picurl = str;
        }

        public void setPrice(int i) {
            this.price = i;
        }

        public void setPromotionprice(int i) {
            this.promotionprice = i;
        }

        public void setRenew(int i) {
            this.renew = i;
        }

        public void setReturnMoney(String str) {
            this.returnMoney = str;
        }

        public void setShopid(String str) {
            this.shopid = str;
        }

        public void setSku(String str) {
            this.sku = str;
        }

        public void setWaresname(String str) {
            this.waresname = str;
        }

        public void setaToken(String str) {
            this.aToken = str;
        }
    }

    public String getCode() {
        return this.f11856code;
    }

    public List<DataBean> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPaytype() {
        return this.paytype;
    }

    public void setCode(String str) {
        this.f11856code = str;
    }

    public void setData(List<DataBean> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPaytype(String str) {
        this.paytype = str;
    }
}
