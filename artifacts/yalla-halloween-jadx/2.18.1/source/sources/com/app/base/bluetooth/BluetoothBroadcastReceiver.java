package com.app.base.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.core.widget.OooO;
import com.app.base.base.activity.BaseFragmentActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00OOO00.OooO0O0;
import p445o0OoOo0o.o0O0OOOo;
import p515o0o0O00.o00O00;
import p537o0o0Oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public class BluetoothBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f11475OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public IntentFilter f11476OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0 f11477OooO0OO;

    public BluetoothBroadcastReceiver(Context context) {
        this.f11475OooO00o = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent == null || this.f11477OooO0OO == null) {
            return;
        }
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
            z = true;
        } else {
            action.equals("android.bluetooth.device.action.ACL_DISCONNECTED");
            z = false;
        }
        BaseFragmentActivity this$0 = (BaseFragmentActivity) this.f11477OooO0OO.f31670OooO0o0;
        int i = BaseFragmentActivity.f11460OoooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f11461Oooo) {
            o00O0O o00o0o2 = new o00O0O();
            if (o00o0o2.f43898OooO00o == null) {
                o00o0o2.f43898OooO00o = (AudioManager) this$0.getSystemService("audio");
            }
            o00o0o2.f43900OooO0OO = "BluetoothBroadcastReceiver onBluetoothState \n isConnectedBluetooth = " + z + "\n changeAudioOut = 2500\n mAudioManager.isBluetoothA2dpOn = " + o00o0o2.f43898OooO00o.isBluetoothA2dpOn();
            if (z) {
                o0O0OOOo.OooO0O0().OooO00o().OooOo0o(false);
                o00o0o2.f43899OooO0O0.postDelayed(new OooO(o00o0o2, 1), 2500L);
            } else {
                o0O0OOOo.OooO0O0().OooO00o().OooOo0o(true);
            }
            o00O00.OooO0O0(o00o0o2.f43900OooO0OO);
        }
    }
}
