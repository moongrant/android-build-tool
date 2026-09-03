package com.app.base.model.chat;

import OooO00o.OooO00o;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class SendGiftMessageModel extends SendChatMessageModel {
    public int giftId;
    public int giftNumber;
    public String headurl;
    public String nickname;
    public int role;

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SendGiftMessageModel{giftId=");
        sbOooO0o0.append(this.giftId);
        sbOooO0o0.append(", giftNumber=");
        sbOooO0o0.append(this.giftNumber);
        sbOooO0o0.append(", nickname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.nickname, '\'', ", headurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headurl, '\'', ", role=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.role, '}');
    }
}
