package com.didichuxing.doraemonkit.kit.core;

import OooO00o.OooO00o;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class DokitViewLayoutParams {
    public static int FLAG_LAYOUT_NO_LIMITS = 512;
    public static int FLAG_NOT_FOCUSABLE = 8;
    public static int FLAG_NOT_FOCUSABLE_AND_NOT_TOUCHABLE = 24;
    public static int FLAG_NOT_TOUCHABLE = 16;
    public static int MATCH_PARENT = -1;
    public static int WRAP_CONTENT = -2;
    public int flags;
    public int gravity;
    public int height;
    public int width;
    public int x;
    public int y;

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DokitViewLayoutParams{flags=");
        sbOooO0o0.append(this.flags);
        sbOooO0o0.append(", gravity=");
        sbOooO0o0.append(this.gravity);
        sbOooO0o0.append(", x=");
        sbOooO0o0.append(this.x);
        sbOooO0o0.append(", y=");
        sbOooO0o0.append(this.y);
        sbOooO0o0.append(", width=");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append(", height=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.height, '}');
    }
}
