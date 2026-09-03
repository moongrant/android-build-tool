package com.umeng.analytics.pro;

import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ar {
    private short[] a;
    private int b = -1;

    public ar(int i) {
        this.a = new short[i];
    }

    private void d() {
        short[] sArr = this.a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.a = sArr2;
    }

    public short a() {
        short[] sArr = this.a;
        int i = this.b;
        this.b = i - 1;
        return sArr[i];
    }

    public short b() {
        return this.a[this.b];
    }

    public void c() {
        this.b = -1;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("<ShortStack vector:[");
        for (int i = 0; i < this.a.length; i++) {
            if (i != 0) {
                sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
            if (i == this.b) {
                sbOooO0o0.append(">>");
            }
            sbOooO0o0.append((int) this.a[i]);
            if (i == this.b) {
                sbOooO0o0.append("<<");
            }
        }
        sbOooO0o0.append("]>");
        return sbOooO0o0.toString();
    }

    public void a(short s) {
        if (this.a.length == this.b + 1) {
            d();
        }
        short[] sArr = this.a;
        int i = this.b + 1;
        this.b = i;
        sArr[i] = s;
    }
}
