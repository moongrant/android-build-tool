package com.yalla.yalla.model;

import com.yalla.yalla.model.user.UserInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VisitorModel extends CommonModel {
    public String count;
    public List<Visitor> data;
    public String datesort;

    public static class Visitor extends UserInfoModel {
        public String isnew;
        public String vid;
        public String visittime;
        public long vtime;
    }

    @Override // com.yalla.yalla.model.CommonModel, com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        return "VistorModel{index='" + this.index + "', count='" + this.count + "', datesort='" + this.datesort + "', data=" + this.data + '}';
    }
}
