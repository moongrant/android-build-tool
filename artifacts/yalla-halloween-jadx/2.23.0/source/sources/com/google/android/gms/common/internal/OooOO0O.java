package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends com.google.android.gms.internal.common.zzi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f15106OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f15106OooO00o = baseGmsClient;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient baseGmsClient = this.f15106OooO00o;
        boolean z = false;
        if (baseGmsClient.f15036OooOoo.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                zzc zzcVar = (zzc) message.obj;
                zzcVar.OooO0O0();
                zzcVar.zzg();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !baseGmsClient.isConnecting()) {
            zzc zzcVar2 = (zzc) message.obj;
            zzcVar2.OooO0O0();
            zzcVar2.zzg();
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            baseGmsClient.f15033OooOoO = new ConnectionResult(message.arg2);
            if (!baseGmsClient.f15035OooOoOO && !TextUtils.isEmpty(baseGmsClient.OooO0Oo()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(baseGmsClient.OooO0Oo());
                    z = true;
                } catch (ClassNotFoundException unused) {
                }
            }
            if (z && !baseGmsClient.f15035OooOoOO) {
                baseGmsClient.OooO(3, null);
                return;
            }
            ConnectionResult connectionResult = baseGmsClient.f15033OooOoO;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            baseGmsClient.f15024OooOOOo.onReportServiceBinding(connectionResult);
            baseGmsClient.OooO0o(connectionResult);
            return;
        }
        if (i3 == 5) {
            ConnectionResult connectionResult2 = baseGmsClient.f15033OooOoO;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            baseGmsClient.f15024OooOOOo.onReportServiceBinding(connectionResult2);
            baseGmsClient.OooO0o(connectionResult2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            baseGmsClient.f15024OooOOOo.onReportServiceBinding(connectionResult3);
            baseGmsClient.OooO0o(connectionResult3);
            return;
        }
        if (i3 == 6) {
            baseGmsClient.OooO(5, null);
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.f15029OooOo0;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks.onConnectionSuspended(message.arg2);
            }
            baseGmsClient.f15010OooO00o = message.arg2;
            baseGmsClient.f15011OooO0O0 = System.currentTimeMillis();
            BaseGmsClient.OooO0oo(baseGmsClient, 5, 1, null);
            return;
        }
        if (i3 == 2 && !baseGmsClient.isConnected()) {
            zzc zzcVar3 = (zzc) message.obj;
            zzcVar3.OooO0O0();
            zzcVar3.zzg();
            return;
        }
        int i4 = message.what;
        if (i4 == 2 || i4 == 1 || i4 == 7) {
            ((zzc) message.obj).zze();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + i4, new Exception());
    }
}
