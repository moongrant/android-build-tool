package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public class CommonModel extends AbsJavaBean {
    public int bartype;
    public String code = "-1";
    public int index;
    public String message;
    public String mid;
    public String msg;
    public long mycoin;
    public String mylongtime;
    public String pagecount;
    public int pageindex;
    public String perimageurl;
    public String pernumber;
    public String str;
    public long time;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.code;
        String str2 = ((CommonModel) obj).code;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.code;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("CommonModel{code='");
        sb.append(this.code);
        sb.append("', message='");
        sb.append(this.message);
        sb.append("', msg='");
        sb.append(this.msg);
        sb.append("', time=");
        sb.append(this.time);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", mycoin=");
        sb.append(this.mycoin);
        sb.append(", bartype='");
        sb.append(this.bartype);
        sb.append("', pagecount='");
        sb.append(this.pagecount);
        sb.append("', mylongtime='");
        sb.append(this.mylongtime);
        sb.append("', str='");
        sb.append(this.str);
        sb.append("', pernumber='");
        sb.append(this.pernumber);
        sb.append("', perimageurl='");
        return o0O00o0.OooO0O0(sb, this.perimageurl, "'}");
    }
}
