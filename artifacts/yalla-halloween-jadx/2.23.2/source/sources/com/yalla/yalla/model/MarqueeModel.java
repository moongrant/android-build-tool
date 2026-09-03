package com.yalla.yalla.model;

import android.text.Spanned;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.model.bean.AbsJavaBean;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public class MarqueeModel extends AbsJavaBean {
    public String bitmap;
    public Spanned content;
    public Spanned giftCount;
    private long id;
    private String ip;
    private boolean isSuperGift;
    private boolean isTotalGift;
    private int port;
    public String url;

    private void setIp(String str) {
        this.ip = str;
    }

    private void setPort(int i) {
        this.port = i;
    }

    public long getId() {
        return this.id;
    }

    public String getIp() {
        return this.ip;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSuperGift() {
        return this.isSuperGift;
    }

    public boolean isTotalGift() {
        return this.isTotalGift;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIpInfo(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(CertificateUtil.DELIMITER)) {
            return;
        }
        String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
        setIp(strArrSplit[0]);
        setPort(Integer.valueOf(strArrSplit[1]).intValue());
    }

    public void setSuperGift(boolean z) {
        this.isSuperGift = z;
    }

    public void setTotalGift(boolean z) {
        this.isTotalGift = z;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("giftCount:");
        sb.append((Object) this.giftCount);
        sb.append(", content:");
        sb.append((Object) this.content);
        sb.append(", bitmap:");
        sb.append(this.bitmap);
        sb.append(", url:");
        sb.append(this.url);
        sb.append(", isTotalGift:");
        sb.append(this.isTotalGift);
        sb.append(", id:");
        sb.append(this.id);
        sb.append(", ip:");
        sb.append(this.ip);
        sb.append(", port:");
        return OooOO0.OooO00o(sb, this.port, "");
    }
}
