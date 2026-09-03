package com.weieyu.yalla.libaudiochat.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p445o0OoOo0o.o0O0OOOo;
import p447o0OoOoO0.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothHeadsetBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oo0o0O0 f20258OooO00o;

    public BluetoothHeadsetBroadcastReceiver(oo0o0O0 oo0o0o0) {
        this.f20258OooO00o = oo0o0o0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        oo0o0O0 oo0o0o0;
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
        if (intExtra != 2) {
            if (intExtra != 0 || (oo0o0o0 = this.f20258OooO00o) == null) {
                return;
            }
            ((o0O0OOOo) oo0o0o0).OooO0OO(false);
            return;
        }
        oo0o0O0 oo0o0o1 = this.f20258OooO00o;
        if (oo0o0o1 != null) {
            ((o0O0OOOo) oo0o0o1).OooO0OO(true);
        }
    }
}
