package com.zego.wrapper.video;

import android.view.View;
import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoLiveRoomVideoCanvas {
    public static final int ScaleAspectFill = 1;
    public static final int ScaleAspectFit = 0;
    public static final int ScaleToFill = 2;
    public int renderMode;
    public int uid;
    public View view;

    public ZegoLiveRoomVideoCanvas(View view) {
        this.view = view;
        this.renderMode = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ZegoLiveRoomVideoCanvas{view=");
        sb.append(this.view);
        sb.append(", renderMode=");
        sb.append(this.renderMode);
        sb.append(", uid=");
        return OooO0O0.OooO00o(sb, this.uid, '}');
    }

    public ZegoLiveRoomVideoCanvas(View view, int i, int i2) {
        this.view = view;
        this.renderMode = i;
        this.uid = i2;
    }
}
