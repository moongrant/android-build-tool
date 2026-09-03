package com.weieyu.yalla.libaudiochat.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p348o0OOOo.OooO0OO;
import p351o0OOOo0O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public class BluetoothHeadsetBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f22473OooO00o;

    public BluetoothHeadsetBroadcastReceiver(OooO oooO) {
        this.f22473OooO00o = oooO;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
        if (!"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            if ("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(action)) {
                intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                return;
            } else {
                if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
                    intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                    return;
                }
                return;
            }
        }
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
        OooO0OO oooO0OO = this.f22473OooO00o;
        if (intExtra == 2) {
            if (oooO0OO != null) {
                ((OooO) oooO0OO).OooO0OO(true);
                return;
            }
            return;
        }
        if (intExtra != 0 || oooO0OO == null) {
            return;
        }
        ((OooO) oooO0OO).OooO0OO(false);
    }
}
