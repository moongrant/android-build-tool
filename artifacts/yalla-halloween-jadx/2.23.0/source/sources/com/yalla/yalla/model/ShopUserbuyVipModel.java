package com.yalla.yalla.model;

/* JADX INFO: loaded from: classes4.dex */
public class ShopUserbuyVipModel {
    private String code;
    private DataBean data;
    private String message;

    public static class DataBean {
        private String daynum;
        private int state;
        private boolean sub = false;
        private String time;

        public String getDaynum() {
            return this.daynum;
        }

        public int getState() {
            return this.state;
        }

        public String getTime() {
            return this.time;
        }

        public boolean isSub() {
            return this.sub;
        }

        public void setDaynum(String str) {
            this.daynum = str;
        }

        public void setState(int i) {
            this.state = i;
        }

        public void setSub(boolean z) {
            this.sub = z;
        }

        public void setTime(String str) {
            this.time = str;
        }
    }

    public String getCode() {
        return this.code;
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
