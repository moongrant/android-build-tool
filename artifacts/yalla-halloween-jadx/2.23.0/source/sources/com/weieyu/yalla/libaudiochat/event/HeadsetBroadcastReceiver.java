package com.weieyu.yalla.libaudiochat.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zego.zegoliveroom.constants.ZegoConstants;
import p348o0OOOo.OooO0OO;
import p351o0OOOo0O.OooO;
import p353o0OOOoO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public class HeadsetBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f22474OooO00o;

    public HeadsetBroadcastReceiver(OooO oooO) {
        this.f22474OooO00o = oooO;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o0OOO0o.OooO0OO(2, "====== HeadsetBroadcastReceiver Action:" + intent.getAction());
        if ("android.intent.action.HEADSET_PLUG".equalsIgnoreCase(intent.getAction()) && intent.hasExtra("state")) {
            int intExtra = intent.getIntExtra("state", -1);
            String stringExtra = intent.getStringExtra("name");
            int intExtra2 = intent.getIntExtra(ZegoConstants.DeviceNameType.DeviceNameMicrophone, -1);
            if (intExtra == 0 || intExtra == 1) {
                o0OOO0o.OooO0OO(2, "======" + stringExtra + "===" + intExtra2);
                OooO0OO oooO0OO = this.f22474OooO00o;
                if (oooO0OO != null) {
                    ((OooO) oooO0OO).OooO0OO(intExtra == 1);
                }
            }
        }
    }
}
