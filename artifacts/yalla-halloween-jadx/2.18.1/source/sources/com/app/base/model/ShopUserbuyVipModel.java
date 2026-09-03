package com.app.base.model;

/* JADX INFO: loaded from: classes.dex */
public class ShopUserbuyVipModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    private String f11885code;
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
        return this.f11885code;
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.f11885code = str;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
