package com.weieyu.yalla.libaudiochat.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.billingclient.api.o0000O0O;
import com.zego.zegoliveroom.constants.ZegoConstants;
import p355o0OOOo0o.OooO0o;
import p357o0OOOoO0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public class HeadsetBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f22001OooO00o;

    public HeadsetBroadcastReceiver(OooO0o oooO0o) {
        this.f22001OooO00o = oooO0o;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o0000O0O.OooO0o0(2, "====== HeadsetBroadcastReceiver Action:" + intent.getAction());
        if ("android.intent.action.HEADSET_PLUG".equalsIgnoreCase(intent.getAction()) && intent.hasExtra("state")) {
            int intExtra = intent.getIntExtra("state", -1);
            String stringExtra = intent.getStringExtra("name");
            int intExtra2 = intent.getIntExtra(ZegoConstants.DeviceNameType.DeviceNameMicrophone, -1);
            if (intExtra == 0 || intExtra == 1) {
                o0000O0O.OooO0o0(2, "======" + stringExtra + "===" + intExtra2);
                OooO0OO oooO0OO = this.f22001OooO00o;
                if (oooO0OO != null) {
                    ((OooO0o) oooO0OO).OooO0OO(intExtra == 1);
                }
            }
        }
    }
}
