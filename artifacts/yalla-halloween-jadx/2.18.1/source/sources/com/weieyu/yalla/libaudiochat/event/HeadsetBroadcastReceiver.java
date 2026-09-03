package com.weieyu.yalla.libaudiochat.event;

import OooO00o.OooO00o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.ServerProtocol;
import com.zego.zegoliveroom.constants.ZegoConstants;
import p445o0OoOo0o.o0O0OOOo;
import p447o0OoOoO0.oo0o0O0;
import p450o0OoOoo.o00;

/* JADX INFO: loaded from: classes2.dex */
public class HeadsetBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oo0o0O0 f20259OooO00o;

    public HeadsetBroadcastReceiver(oo0o0O0 oo0o0o0) {
        this.f20259OooO00o = oo0o0o0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("====== HeadsetBroadcastReceiver Action:");
        sbOooO0o0.append(intent.getAction());
        o00.OooO0OO(2, sbOooO0o0.toString());
        if ("android.intent.action.HEADSET_PLUG".equalsIgnoreCase(intent.getAction()) && intent.hasExtra(ServerProtocol.DIALOG_PARAM_STATE)) {
            int intExtra = intent.getIntExtra(ServerProtocol.DIALOG_PARAM_STATE, -1);
            String stringExtra = intent.getStringExtra("name");
            int intExtra2 = intent.getIntExtra(ZegoConstants.DeviceNameType.DeviceNameMicrophone, -1);
            if (intExtra == 0 || intExtra == 1) {
                o00.OooO0OO(2, "======" + stringExtra + "===" + intExtra2);
                oo0o0O0 oo0o0o0 = this.f20259OooO00o;
                if (oo0o0o0 != null) {
                    ((o0O0OOOo) oo0o0o0).OooO0OO(intExtra == 1);
                }
            }
        }
    }
}
