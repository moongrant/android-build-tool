package com.yalla.yalla.util.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.manager.RoomState;
import kotlin.jvm.internal.Intrinsics;
import p042OooooO0.oo0O;
import p355o0OOOo0o.OooO0o;
import p404o0Oo0OO0.OooOo00;
import p429o0OoOO.o0Oo0oo;
import p592o0oOoooo.c3;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public class BluetoothBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f32294OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public IntentFilter f32295OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOo00 f32296OooO0OO;

    public BluetoothBroadcastReceiver(Context context) {
        this.f32294OooO00o = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent == null || this.f32296OooO0OO == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
            z = true;
        } else {
            action.equals("android.bluetooth.device.action.ACL_DISCONNECTED");
            z = false;
        }
        BaseFragmentActivity this$0 = (BaseFragmentActivity) this.f32296OooO0OO.f43658OooO0Oo;
        int i = BaseFragmentActivity.f22277OooOOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f22280OooO0oO) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() != RoomState.Close) {
                c3 c3Var = new c3();
                if (c3Var.f57320OooO00o == null) {
                    c3Var.f57320OooO00o = (AudioManager) this$0.getSystemService("audio");
                }
                c3Var.f57322OooO0OO = "BluetoothBroadcastReceiver onBluetoothState \n isConnectedBluetooth = " + z + "\n changeAudioOut = 2500\n mAudioManager.isBluetoothA2dpOn = " + c3Var.f57320OooO00o.isBluetoothA2dpOn();
                if (z) {
                    OooO0o.OooO0O0().OooO00o().OooO0oO(false);
                    c3Var.f57321OooO0O0.postDelayed(new oo0O(c3Var, 1), 2500L);
                } else {
                    OooO0o.OooO0O0().OooO00o().OooO0oO(true);
                }
                o0000O00.OooO0O0(c3Var.f57322OooO0OO);
            }
        }
    }
}
