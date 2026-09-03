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
import p029Oooo0oo.o0O00O0o;
import p045Oooooo.o000oOoO;
import p351o0OOOo0O.OooO;
import p427o0OoOO00.o0OOO0o;
import p588o0oOooo0.oOOoOOO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public class BluetoothBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f32830OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public IntentFilter f32831OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000oOoO f32832OooO0OO;

    public BluetoothBroadcastReceiver(Context context) {
        this.f32830OooO00o = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent == null || this.f32832OooO0OO == null) {
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
        BaseFragmentActivity this$0 = (BaseFragmentActivity) this.f32832OooO0OO.f1983OooO0Oo;
        int i = BaseFragmentActivity.f22750OooOOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f22753OooO0oO) {
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            if (o0OOO0o.OooO0oO() != RoomState.Close) {
                oOOoOOO0 ooooooo0 = new oOOoOOO0();
                if (ooooooo0.f56787OooO00o == null) {
                    ooooooo0.f56787OooO00o = (AudioManager) this$0.getSystemService("audio");
                }
                ooooooo0.f56789OooO0OO = "BluetoothBroadcastReceiver onBluetoothState \n isConnectedBluetooth = " + z + "\n changeAudioOut = 2500\n mAudioManager.isBluetoothA2dpOn = " + ooooooo0.f56787OooO00o.isBluetoothA2dpOn();
                if (z) {
                    OooO.OooO0O0().OooO00o().OooO0oO(false);
                    ooooooo0.f56788OooO0O0.postDelayed(new o0O00O0o(ooooooo0, 2), 2500L);
                } else {
                    OooO.OooO0O0().OooO00o().OooO0oO(true);
                }
                OooOOO0.OooO0O0(ooooooo0.f56789OooO0OO);
            }
        }
    }
}
