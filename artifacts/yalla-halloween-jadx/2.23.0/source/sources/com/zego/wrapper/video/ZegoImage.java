package com.zego.wrapper.video;

import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoImage {
    public int height;
    public String url;
    public int width;
    public int x;
    public int y;

    public String toString() {
        StringBuilder sb = new StringBuilder("ZegoImage{url='");
        sb.append(this.url);
        sb.append("', x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return OooO0O0.OooO00o(sb, this.height, '}');
    }
}
