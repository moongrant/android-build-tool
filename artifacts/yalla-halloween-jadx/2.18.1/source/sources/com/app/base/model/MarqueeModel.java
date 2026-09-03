package com.app.base.model;

import OooO00o.OooO00o;
import android.text.Spanned;
import android.text.TextUtils;
import com.app.base.bean.AbsJavaBean;
import com.facebook.internal.security.CertificateUtil;
import o0O0O00.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
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

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("giftCount:");
        sbOooO0o0.append((Object) this.giftCount);
        sbOooO0o0.append(", content:");
        sbOooO0o0.append((Object) this.content);
        sbOooO0o0.append(", bitmap:");
        sbOooO0o0.append(this.bitmap);
        sbOooO0o0.append(", url:");
        sbOooO0o0.append(this.url);
        sbOooO0o0.append(", isTotalGift:");
        sbOooO0o0.append(this.isTotalGift);
        sbOooO0o0.append(", id:");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", ip:");
        sbOooO0o0.append(this.ip);
        sbOooO0o0.append(", port:");
        return o0ooOOo.OooO00o(sbOooO0o0, this.port, "");
    }
}
