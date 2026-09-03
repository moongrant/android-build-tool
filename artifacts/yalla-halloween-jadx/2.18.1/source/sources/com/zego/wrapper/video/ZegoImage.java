package com.zego.wrapper.video;

import OooO00o.OooO00o;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public class ZegoImage {
    public int height;
    public String url;
    public int width;
    public int x;
    public int y;

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZegoImage{url='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", x=");
        sbOooO0o0.append(this.x);
        sbOooO0o0.append(", y=");
        sbOooO0o0.append(this.y);
        sbOooO0o0.append(", width=");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append(", height=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.height, '}');
    }
}
