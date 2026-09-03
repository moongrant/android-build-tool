package com.yalla.yalla.util;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/util/PaySupportChannels;", "", "", "num", "I", "OooO00o", "()I", "pay_type_googlePay", "pay_type_payssionPay", "pay_type_huaWeiPay", "pay_type_tapPay", "pay_type_mintroute", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum PaySupportChannels {
    pay_type_googlePay(1),
    pay_type_payssionPay(3),
    pay_type_huaWeiPay(4),
    pay_type_tapPay(5),
    pay_type_mintroute(6);

    private final int num;

    PaySupportChannels(int i) {
        this.num = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getNum() {
        return this.num;
    }
}
