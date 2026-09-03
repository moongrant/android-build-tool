package com.didichuxing.doraemonkit.kit.core;

import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sb = new StringBuilder("DokitViewLayoutParams{flags=");
        sb.append(this.flags);
        sb.append(", gravity=");
        sb.append(this.gravity);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return OooO0O0.OooO00o(sb, this.height, '}');
    }
}
