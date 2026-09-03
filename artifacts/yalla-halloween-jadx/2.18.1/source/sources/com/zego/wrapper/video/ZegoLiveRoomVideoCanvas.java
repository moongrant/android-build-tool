package com.zego.wrapper.video;

import OooO00o.OooO00o;
import android.view.View;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZegoLiveRoomVideoCanvas{view=");
        sbOooO0o0.append(this.view);
        sbOooO0o0.append(", renderMode=");
        sbOooO0o0.append(this.renderMode);
        sbOooO0o0.append(", uid=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.uid, '}');
    }

    public ZegoLiveRoomVideoCanvas(View view, int i, int i2) {
        this.view = view;
        this.renderMode = i;
        this.uid = i2;
    }
}
